package it.nextre.academy.basi;

import it.nextre.academy.myutils.DummyData;
import it.nextre.academy.myutils.MySupport;

import java.util.*;

public class Collezioni {
    public static void main(String[] args) {

        /*
        LinkedList<String> nomi = new LinkedList<>();
        Deque<String> dek = nomi;

        nomi.poll(); // no eccez torna null, prende e toglie dalla testa
        nomi.peek(); // no eccez torna null, prende ma non toglie dalla testa
        nomi.pop();  // SI eccez torna null, prende e toglie dalla testa
        nomi.remove(); // alias di pop
        nomi.offer(""); //inserisce in coda
        */


        List<Umano> popolazione = new LinkedList<>();

        popolazione.add(getRandomUmano());
        popolazione.add(getRandomUmano());
        popolazione.add(getRandomUmano());
        popolazione.add(getRandomUmano());
        popolazione.add(getRandomUmano());
        popolazione.add(getRandomUmano());
        popolazione.add(getRandomUmano());
        popolazione.add(getRandomUmano());
        popolazione.add(getRandomUmano());
        popolazione.add(getRandomUmano());
        popolazione.add(getRandomUmano());
        popolazione.add(getRandomUmano());
        popolazione.add(getRandomUmano());
        popolazione.add(getRandomUmano());
        popolazione.add(getRandomUmano());

        System.out.println(popolazione);
        System.out.println("ordino...");

        Comparator<Umano> compEta = new Comparator<Umano>() {
            @Override
            public int compare(Umano u1, Umano u2) {
                /*
                if (u1.getEta()>u2.getEta()){
                    return 1;
                }else if(u1.getEta()<u2.getEta()){
                    return -1;
                }else{
                    return 0;
                }
                */
                 return u1.getEta()-u2.getEta();
            }
        };
        //popolazione.sort(compEta);
        //popolazione.sort((Umano u1, Umano u2)->u1.getEta()-u2.getEta() );
        //popolazione.sort(Comparator.comparingInt(Umano::getEta));
        //popolazione.sort(Comparator.comparingInt((Umano u)->u.getNome().length()));

        popolazione.sort((Umano u1, Umano u2)->{
            if(u1.getNome().length()-u2.getNome().length()==0){
                return u1.getNome().compareTo(u2.getNome());
            }else{
                return u1.getNome().length()-u2.getNome().length();
            }
        } );
        System.out.println(popolazione);



    }//end main


    private static Umano getRandomUmano(){
        return new Umano(
                DummyData.getName(),
                DummyData.getSurname(),
                DummyData.getAge(),
                DummyData.getRandomDouble(50,20),
                DummyData.getRandomDouble(170,30)
        );
    }



}//end class



class Umano implements Comparable{
    private String nome;
    private String cognome;
    private int eta;
    private double peso;
    private double altezza;

    public Umano(String nome, String cognome, int eta, double peso, double altezza)  {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.peso = peso;
        this.altezza = altezza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public String toString() {
        return "Umano{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                ", peso=" + MySupport.formattaDouble(peso) + "kg" +
                ", altezza=" + MySupport.formattaDouble(altezza) + "cm" +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(!(o instanceof Umano))return -1;
        return this.nome.compareTo(((Umano) o).getNome());
    }
}