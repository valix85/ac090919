package it.nextre.academy.basi.enumerazioni.cancello;

import java.util.Random;

public class CancelloMain {


    public static void main(String[] args) {
        Cancello c1 = new Cancello();
        /*
        c1.apri();
        c1.chiudi();
        c1.unMezzo();
        c1.unMezzo();
        c1.unQuarto();
        c1.treQuarti();
         */

        Random r = new Random();
        int i=0;
        do{
            i++;
            switch (r.nextInt(5)){
                case 0:
                    c1.apri(); break;
                case 1:
                    c1.chiudi(); break;
                case 2:
                    c1.unQuarto(); break;
                case 3:
                    c1.unMezzo(); break;
                case 4:
                    c1.treQuarti(); break;
            }
        }while(i<10);




    }//end main





}//end class
