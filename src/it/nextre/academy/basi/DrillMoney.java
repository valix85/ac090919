package it.nextre.academy.basi;

import it.nextre.academy.myutils.MyInput;

import java.util.Random;

public class DrillMoney {

    public static void main(String[] args) {

        //0 definire le variabili del gioco
        int vite = 3;
        int[][] tabellone;
        int difficolta;
        int num_premi;

        //1 chiedere la difficoltà
        difficolta = impostaDifficolta();
        num_premi = richiediPremi(difficolta);
        //2 impostare il tabellone di gioco
        tabellone = new int[difficolta][difficolta];
        stampaTabellone(tabellone);
        generaTabellone(tabellone, num_premi);
        System.out.println("---------------------------------");
        stampaTabellone(tabellone);
        //3 interagire con l'utente

        //4 stampare il risultato

    }//end main


    /**
     * Posiziona casualmente il numero di premi uno per ogni cella differente.
     * @param tabellone
     * @param num_premi
     */
    private static void generaTabellone(int[][] tabellone, int num_premi) {
        //il tabellone sarà pieno di zeri e i premi saranno un numero positivo > 0
        Random r = new Random();
        while(num_premi>0){
            int x = r.nextInt(tabellone.length);
            int y = r.nextInt(tabellone.length);
            //controllo che la casella sia libera
            if(tabellone[x][y]==0){
                //libera
                tabellone[x][y]=1;
                num_premi--;
                System.out.println("Premio in "+x+", "+y);
            }else{
                System.out.println("nella casella "+x+", "+y+" c'è già un premio");
            }
        }
    }

    /**
     * Gestisce le regole per il rilascio del numero dei premi in base alla difficoltà
     * @param difficolta
     * @return numero di premi per il tabellone
     */
    private static int richiediPremi(int difficolta) {
        switch (difficolta){
            case 4: return 1;
            case 6: return 2;
            case 8: return 3;
        }
        return 0;
    }


    /**
     * Richiede all'utente la scelta del livello di difficoltà. Il livello di difficoltà rappresenta la lunghezza del lato del quadrato del tabellone
     * @return il livello di difficoltà
     */
    private static int impostaDifficolta() {
        int caselle=0; //caselle per riga
        do {
            System.out.println("Scegli 1 per facile, 2 per normale o 3 per difficile");
            int tmp = MyInput.leggiInteroPositivo();
            switch (tmp) {
                case 1: caselle = 4;
                    break;
                case 2: caselle = 6;
                    break;
                case 3: caselle = 8;
                    break;
                default: caselle = 0;
                    System.out.println("Valore non valido");
            }
        }while(caselle==0);
        return caselle;
    }


    /**
     * Metodo per la stampa del tabellone
     * @param tabellone
     */
    private static void stampaTabellone(int[][] tabellone) {
        for (int riga = 0; riga < tabellone.length; riga++) {
            for (int colonna = 0; colonna < tabellone[riga].length; colonna++) {
                System.out.print(tabellone[riga][colonna]+" ");
            }//end for
            System.out.println("");
        }//end for
    }

}//end class
