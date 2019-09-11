package it.nextre.academy.basi;

import it.nextre.academy.myutils.MyInput;

import java.util.Random;

public class Matrice {
    /*
    *
    * 1. Creare una matrice (array bidimensionale) di dimensioni definite tramite input da tastiera (righe e colonne)
    * 2. Popolare la matrice con caratteri char corrispondenti alle lettere dell'alfabeto maiuscole (numeri ascii 65-90) o minuscole (numeri ascii 97-167)
    * 3. Stampare gli elementi dell'Array, ma interrompere l'azione quando viene trovata la "x" mostrando le coordinate dove è presente e tornare un indicatore che la matrice non sia valida
    *
    * */

    public static void main(String[] args) {

        char[][] matrix;

        //1 chiedere le dimensioni della matrice all'utente
        System.out.println("Quante righe vuoi? (1-10)");
        int righe = MyInput.leggiInteroPositivo();

        System.out.println("Quante colonne vuoi? (1-10)");
        int colonne = MyInput.leggiInteroPositivo();

        matrix = new char[righe][colonne];

        //stampaMatrice(matrix);

        //2 popolare la matrice
        popolaMatriceRandomicamente(matrix);
        System.out.println("--- Matrice popolata");
        stampaMatrice(matrix);

        //3 controllare la matrice
        System.out.println(controllaMatrice(matrix, 'X'));

    }//end main

    private static boolean controllaMatrice(char[][] sorgente, char carattereDaCercare) {
        boolean trovato = false;
        //fix to charUpperCase
        //carattereDaCercare = (""+carattereDaCercare).toUpperCase().toCharArray()[0];
        riga:for (int riga = 0; riga < sorgente.length; riga++) {
            colonna:for (int colonna = 0; colonna < sorgente[riga].length; colonna++) {
                if(sorgente[riga][colonna]==carattereDaCercare){
                    trovato=true;
                    System.out.println("Simbolo "+carattereDaCercare+" trovato in posizione "+riga+", "+colonna);
                    break riga;
                };
            }//end for
        }//end for
        return trovato;
    }

    private static void popolaMatriceRandomicamente(char[][] matrix) {
        Random r = new Random();
        for (int riga = 0; riga < matrix.length; riga++) {
            for (int colonna = 0; colonna < matrix[riga].length; colonna++) {
                char carattereCasuale = (char)(65 + r.nextInt(26));
                matrix[riga][colonna] = carattereCasuale;
            }//end for
        }//end for

    }

    private static void stampaMatrice(char[][] matrix) {
        for (int riga = 0; riga < matrix.length; riga++) {
            for (int colonna = 0; colonna < matrix[riga].length; colonna++) {
                System.out.print(matrix[riga][colonna]+" ");
            }//end for
            System.out.println("");
            try {Thread.sleep(200);} catch (InterruptedException e) {}
        }//end for
    }
}//end class
