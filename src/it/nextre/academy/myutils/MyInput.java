package it.nextre.academy.myutils;

import java.util.Random;
import java.util.Scanner;

public class MyInput {
    public static String leggiRiga(){
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    public static int leggiInteroPositivo() {
        Scanner s = new Scanner(System.in);
        String tmp = s.nextLine().trim();
        String numeri="0123456789";
        for(int i=0;i<tmp.length();i++ ){
            if(numeri.indexOf(tmp.charAt(i)) <0  ){
                if (i==0 && tmp.charAt(i)=='+' ) {}else {
                    //trovato carattere non valido
                    System.out.println("Input non valido, riprova");
                    return leggiInteroPositivo();
                }
            }
        }
        //se arrivo qui tmp è una sequenza di numeri positiva
        return Integer.parseInt(tmp);
    }


    public static int leggiIntero() {
        Scanner s = new Scanner(System.in);
        String tmp = s.nextLine().trim();
        String numeri="0123456789";
        for(int i=0;i<tmp.length();i++ ){
            if(numeri.indexOf(tmp.charAt(i)) <0  ){
                if (i==0 && (tmp.charAt(i)=='+' || tmp.charAt(i)=='-') ) {}else {
                    //trovato carattere non valido
                    System.out.println("Input non valido, riprova");
                    return leggiIntero();
                }
            }
        }
        //se arrivo qui tmp è una sequenza di numeri positiva
        return Integer.parseInt(tmp);
    }


    public static String invertiStringa(String input){
        String output="";
        for (int i = input.length()-1; i >=0; i--) {
            output += input.charAt(i);
            // P i p p o
            // 0 1 2 3 4

            // input.length()-1 - i  = 4-4 -> 0
            // input.length()-1 - i  = 4-3 -> 1
            // input.length()-1 - i  = 4-2 -> 2
            // input.length()-1 - i  = 4-1 -> 3
            // input.length()-1 - i  = 4-0 -> 4


        }//end for
        return output;
    }




    public static double getRandomTemp(double base, double delta){
        double temp = 0, scarto;
        Random r = new Random();
        scarto = r.nextDouble()*delta;
        if (r.nextBoolean()){
            //aggiungo
            temp = base + scarto;
        }else{
            //sottraggo
            temp = base - scarto;
        }

        //return r.doubles(1,base-delta/2,base+delta/2)
        //        .findFirst()
        //        .getAsDouble();

        return temp;
    }




    public static String barlettizza(String input) {
        String output = "";
        String vocali = "AEIOUaeiou";
        for (int i = 0; i < input.length(); i++) {
            char tmp = input.charAt(i);
            if (vocali.indexOf(tmp) < 0) {
                output += tmp;
            }
        }//end for
        //v2 regex
        output="";
        output = input.replaceAll("[AaEeIiOoUu]", "");
        return output;
    }


    public static int[][] randomMatrix(int righe, int colonne) {
         int[][] mattmp = new int[righe][colonne];
         Random r = new Random();
         for (int i = 0; i<righe;i++){
             for (int j = 0; j < colonne; j++) {
                 mattmp[i][j]=r.nextInt(10);
             }//end for
         }
         return mattmp;
    }
}//end class
