package it.nextre.academy.supermercato;

import it.nextre.academy.myutils.MySupport;

import java.util.Random;

public class Conad {

    public static void main(String[] args) {

        Prodotto[] scaffale = {
                new Prodotto("Fagioli Borlotti",0.250, 3.49,BarCodeGenerator.getIstance().newCode()),
                new Prodotto("Cetrioli",0.500, 1.49,BarCodeGenerator.getIstance().newCode()),
                new Prodotto("Minestrone Valle dei morti",1.250, 2.95,BarCodeGenerator.getIstance().newCode()),
                new ProdottoDaBanco("Crudo di Parma",0.203, BarCodeGenerator.getIstance().newCode(),28.85),
                new ProdottoDaBanco("Costata di Manzo",0.507, BarCodeGenerator.getIstance().newCode(),15.99),
                new ProdottoCasalingo("Nelsen Piatti",1.025,1.19,BarCodeGenerator.getIstance().newCode()),
                new ProdottoCasalingo("Svelto Piatti",1.055,1.49,BarCodeGenerator.getIstance().newCode()),
                new ProdottoCasalingo("Scopa Pippo",0.625,0.98,BarCodeGenerator.getIstance().newCode()),
                new ProdottoCasalingo("Straccio Pavimento 40x50",0.105,2.39,BarCodeGenerator.getIstance().newCode())
        };

        //Stampo tutti i prodotti
        for (int i = 0; i < scaffale.length; i++) {
            System.out.println(scaffale[i]);
        }//end for

        final int N_PEZZI = 8;
        Prodotto[] carrello = new Prodotto[N_PEZZI];

        Random r = new Random();
        System.out.println("FACCIO LA SPESA...");
        for (int i = 0; i < carrello.length; i++) {
            carrello[i] = scaffale[r.nextInt(scaffale.length)];
        }//end for

        System.out.println("\nIL CARRELLO CONTIENE");
        for (int i = 0; i < carrello.length; i++) {
            System.out.println(carrello[i]);
        }//end for


        System.out.println("\n\nVADO IN CASSA...");

        Cassa cassa1 = new Cassa();
        cassa1.addProdotti(carrello);
        System.out.println(cassa1.getScontrino());
        System.out.println("\n\nPAGARE: "+ MySupport.formattaDouble(cassa1.getTotale())+"€ ...e subito! in contante grazie, di piccola taglia meglio ancora");

    }//end main

}//end class
