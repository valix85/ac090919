package it.nextre.academy.basi;

import it.nextre.academy.myutils.MyInput;

public class Multidimensionale {

    public static void main(String[] args) {

        char parola1[] = new char[4];
        parola1[0]='C';
        parola1[1]='i';
        parola1[2]='a';
        parola1[3]='o';

        char[] parola2 = new char[]{'C','i','a','o'};
        char[] parola3 = {'C','i','a','o'};
        char[] parola4 = "Ciao".toCharArray();

        //forEach = per ogni item dall'inizio alla fine
        for(char item : parola4){
            System.out.print(item+".");
        }

        System.out.println("");
        //for più versatile, bidirezionale, incremento personalizzabile
        //tutte le dichiarazioni sono opzionali
        for (int i = 0; i < parola4.length; i++) {
            System.out.println("i="+i+" , lettera: "+parola4[i]);
        }//end for
        System.out.println("-".repeat(25));
        for (int i = parola4.length-1; i>=0; i--) {
            System.out.println("i="+i+" , lettera: "+parola4[i]);
        }//end for



        for (int i=0;i<3;i++){
            System.out.println("Inserisci un nome: ");
            String tmp = MyInput.leggiRiga();
            System.out.println("hai inserito: "+tmp);
        }



    }//end main

}//end class
