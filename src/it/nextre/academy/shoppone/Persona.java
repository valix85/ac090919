package it.nextre.academy.shoppone;

import it.nextre.academy.myutils.MySupport;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Persona {

    private static AtomicInteger nextId = new AtomicInteger(1);

    private String nome;
    private String cognome;
    private Ordine carrello;
    private RegistroOrdini registro;

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.carrello = new Ordine();
        this.registro = new RegistroOrdini();
    }

    public void compra(Prodotto prodotto) {
        if (carrello!=null)
            carrello.addProdotto(prodotto);
    }

    public void paga() {
        if (carrello.getNumeroProdotti()>0){
            System.out.println(carrello.getContenuto());
            System.out.println("Totale carrello: "+ MySupport.formattaDouble(carrello.getTotaleOrdine())+"€");
            carrello.setPagato(true);
            System.out.println("Pagamento riuscito\n");
            registro.registraOrdine(carrello);
            carrello = new Ordine();
        }
    }

    public void stampaRegistroOrdini() {
        System.out.println(registro.print());
    }

    private class Ordine {

        private int id;
        private List<Prodotto> prodotti;
        private LocalDateTime dataAcquisto;
        private Boolean pagato;

        {
            id = nextId.getAndIncrement();
        }

        public Ordine() {
            this.pagato=false;
            this.prodotti=new ArrayList<>();
        }

        public void setPagato(Boolean pagato) {
            if (!this.pagato) {
                this.pagato = pagato;
                this.dataAcquisto = LocalDateTime.now();
            }
        }

        public Boolean getPagato() {
            return pagato;
        }

        public List<Prodotto> getProdotti() {
            return prodotti;
        }

        public void addProdotto(Prodotto prodotto){
            this.prodotti.add(prodotto.clone());
        }

        public void removeProdotto(Prodotto prodotto){
            if (this.prodotti.contains(prodotto))
            this.prodotti.remove(prodotto);
        }

        public long getNumeroProdotti() {
            return prodotti.size();
        }

        public double getTotaleOrdine(){
            return prodotti.stream()
                    .mapToDouble(p->p.getPrezzo())
                    .sum();
        }

        public String getContenuto() {
            return prodotti.stream()
                    .map(p->{
                        String tmp = p.getNome()+" ["+p.getMarca()+"] ";
                        tmp+=".".repeat(60);
                        tmp=tmp.substring(0,60);
                        tmp+=".....€ "+MySupport.formattaDouble(p.getPrezzo())+"\n";
                        return tmp;
                    })
                    .reduce(String::concat)
                    .orElse("CARRELLO VUOTO");
        }


        public int comparaPerData(Ordine o1, Ordine o2 ){
            return o1.dataAcquisto.compareTo(o2.dataAcquisto);
        }

        @Override
        public String toString() {
            return "" +
                    "\nOrdine id=" + id +
                    "\ndataAcquisto=" + dataAcquisto +
                    "\npagato=" + pagato +
                    "\ncontenuto:\n" + getContenuto()  +"\n" +
                    "------------------------------------------\n" +
                    "TOTALE \t\t\t\t\t\t€ " + MySupport.formattaDouble(getTotaleOrdine()) + "\n"
                    ;
        }
    }


    private class RegistroOrdini{
        List<Ordine> ordini;


        public RegistroOrdini() {
            this.ordini = new ArrayList<>();
        }


        public void registraOrdine(Ordine ordine){
            this.ordini.add(ordine);
        }

        public String print() {
            //stampare il registro ordinato per data
            Collections.sort(ordini, Comparator.comparing(o -> o.dataAcquisto));
            return ordini.stream()
                    .map(o->o.toString()+"\n")
                    .reduce(String::concat).orElse("");
        }
    }
}//end class
