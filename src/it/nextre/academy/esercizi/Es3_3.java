package it.nextre.academy.esercizi;

import it.nextre.academy.myutils.MyInput;

import java.util.Arrays;

public class Es3_3 {
    public static void main(String[] args) {

        String[] nomi;
        int[] numeri;
        int[] fibonacci;


        System.out.println("Quanti nomi vuoi inserire?");
        int nElem = MyInput.leggiInteroPositivo();
        nomi=new String[nElem];

        for(int i=0;i<nomi.length;i++){
            System.out.println("inserisci un nome");
            nomi[i]=MyInput.leggiRiga();
        }





        System.out.println("Quanti numeri vuoi inserire?");
        nElem = MyInput.leggiInteroPositivo();
        numeri=new int[nElem];

        for(int i=0;i<numeri.length;i++){
            System.out.println("inserisci un nome");
            numeri[i]=MyInput.leggiIntero();
        }


        System.out.println("Quale posizione di fibonacci vuoi calcolare?");
        nElem = MyInput.leggiInteroPositivo();
        fibonacci=new int[nElem];

        for(int i=0; i<fibonacci.length; i++){
            if (i==0){
                fibonacci[i]=0;
                continue;
            }
            if(i==1){
                fibonacci[i]=1;
                continue;
            }
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
        }





        //verifica
        System.out.println("---NOMI---");
        for(String item : nomi){
            System.out.println(item);
        }
        System.out.println("---NUMERI---");
        for(int item : numeri){
            System.out.println(item);
        }

        System.out.println("Fibonacci di "+(fibonacci.length)+" vale: "+fibonacci[fibonacci.length-1]);
        for (int i = 0; i < fibonacci.length; i++) {
            System.out.println("pos "+ (i+1)+" = "+fibonacci[i]);
        }//end for



    }//end main

}//end class
