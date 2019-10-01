package it.nextre.academy.designpattern.strategy.converter;


/** Accetta un quantità, un'unità di misura e la destinazione di conversione per convertire la quantità
 *
 * */
public class Converter {


    public String converti(double qta, String from, String to) {

        //step 1 controllare la possibilità di convertire
        Convertibile c = checkData(qta, from, to);

        //step2 dato il convertitore eseguo la conversione
        if (c!=null){
            //ho trovato un possibile convertitore, eseguirò la conversione
            return c.converti(qta, from , to); //+""+to; meglio tornare la semplice qta, così portò rifare il parsing all'esterno
        }else{
            throw new RuntimeException("Informazioni non valide per la conversione");
        }
    }

    private Convertibile checkData(double qta, String from, String to) {

        String lunghezza = "Km hm dam m dm cm mm";
        // String peso = "t q Kg hg g dg cg mg";
        // ... altre misure


        if (lunghezza.contains(from) && lunghezza.contains(to)){
            return new LunghezzaConvertibile();
        }
        /*
        if (peso.contains(from) && peso.contains(to)){
            return new PesoConvertibile();
        }
        */


        return null;
    }
}//end class
