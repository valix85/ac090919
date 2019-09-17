package it.nextre.academy.myutils;

import java.text.DecimalFormat;

public class MySupport {

    /**
     * Clona un array di double
     * */
    public static double[] clonaArray(double[] arrayInput) {
        double[] arrayOutput = new double[arrayInput.length];
        for (int i = 0; i < arrayInput.length; i++) {
            arrayOutput[i]=arrayInput[i];
        }//end for
        return arrayOutput;
    }

    /**
     * Formatta un double a 2 cifre decimali
     * */
    public static String formattaDouble(double number){
         /* cattiva idea duplicare la logica
         DecimalFormat df= new DecimalFormat();
         df.setMaximumFractionDigits(2);
         //System.out.printf("%.2f",number);
         //System.out.println("");
         return df.format(number);
         */
        //meglio richiamare l'altro metodo
        return formattaDouble(number,2);
    }

    /**
     * Formatta un double a n cifre decimali
     * */
    public static String formattaDouble(double number, int precision){
        DecimalFormat df= new DecimalFormat();
        df.setMaximumFractionDigits(precision);
        //System.out.printf("%."+precision+"f",number);
        //System.out.println("");
        return df.format(number);
    }


    /**
     * Stampa una matrice di interi a schermo
     * @param matrice
     */
    public static void stampaMatriceInteri(int[][] matrice) {
        for (int riga = 0; riga < matrice.length; riga++) {
            //System.out.print("[");
            for (int colonna = 0; colonna < matrice[riga].length; colonna++) {
                //System.out.print(matrice[riga][colonna]+" ");
                System.out.printf("% 3d ",matrice[riga][colonna]);
                if (colonna!=matrice[riga].length-1){
                    //System.out.print("|");
                }
            }//end for
            //System.out.print("]");
            System.out.println("");
        }//end for
    }

}//end class
