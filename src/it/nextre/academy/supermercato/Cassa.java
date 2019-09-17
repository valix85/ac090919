package it.nextre.academy.supermercato;

public class Cassa {

    private double tot;
    private String scontrino;
    public Cassa(){
        tot=0d;
        scontrino="";
    }

    public void addProdotto(Prodotto prod){
        tot += prod.getPrezzo();
        scontrino+="\n"+prod.getNome();
    }

    public void addProdotti(Prodotto[] prods){
        for(Prodotto prod:prods) {
            addProdotto(prod);
        }
    }

    public double getTotale(){
        return tot;
    }

    public void reset(){
        tot=0;
    }

    public String getScontrino(){
        return scontrino;
    }

}//end class
