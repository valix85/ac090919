package it.nextre.academy.basi;

import it.nextre.academy.myutils.MyInput;

import java.util.Arrays;

public class Multidimensionale {

    public static void main(String[] args) {

        if (args.length>0){
            //farò delle scelte
            for(String arg : args){
                checkArg(arg);
            }
        }else{
            //altrimenti eseguo tutto il programma
            array();
            matrice();
        }


    }//end main

    private static void checkArg(String param) {
        System.out.println("Inizio controllo parametro");
        param=param.toLowerCase();
        switch (param){
            default:
                System.out.println("Parametro \""+param+"\" non valido");
                break;

            case "paperino":
            case "topolino":
            case "pippo":
                System.out.println("CASO 1");
                break;
            case "pluto":{
                System.out.println("CASO 2");
                break;
            }
            case "incremento": incremento(); break;

        }
        System.out.println("Fine controllo parametro");
    }

    private static void incremento() {


        byte b1 = 3;
        //b1=b1+1;
        b1++;   //b1 = (byte)(b1+1)  //POST incremento
        ++b1;   // PRE incremento




        int x = 3;
        System.out.println("1) "+x); //3
        x=x++; //errore, non si incrementa
        System.out.println("2) "+x); //3
        x=++x; //inutile assegnazione, è uguale a fare ++x;
        System.out.println("3) "+x); //4
        x++;  //corretto, incrementa di 1
        System.out.println("4) "+x); //5

        x=5;
        x=x+++x;  //x++ + x  //da sx a dx
        System.out.println("5) "+x); //11

        x=6;
        System.out.println(x++==6); //true
        System.out.println("6) "+x);//7
        System.out.println(++x==7);//false
        System.out.println("7) "+x);//8


        System.out.println("-".repeat(25));

        System.out.println(3+2+"2"+1); //521
        System.out.println(3+2+"2"+1+4); //5214
        System.out.println(3+2+"2"+(1+4)); //525
        System.out.println("3"+2+"2"); //322
        System.out.println(""+3+2+"5"); //325
        System.out.println(3+2+"5"); //55

       do{
           System.out.println(".");
       }while (!true);

       boolean test = false;

       while(test){
           System.out.println(":");
       }

       for(int i=3;i>=0;i--){
           if (i<0){
               break;
               //x--; //codice irraggiungibile
           }else{
               continue;
               //x++; //codice irraggiungibile
           }
           //System.out.println("i= "+i); ////codice irraggiungibile
       }





        for(int i=3;i>=0;i--){
            if (x<0){break;}
            if (x>=0){continue;}
            System.out.println("x= "+x);
        }


        blocco1:{
            System.out.println("...");
            if (x==9){break blocco1;}
            //if (x==8){continue blocco1;} //NON è un ciclo, no continue!
            x=x*5;
        }



    }

    public static void array() {

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



    }
    public static void matrice(){

        String[][] classifica = new String[2][4];

        /*
            Classifica
            [0][0]   [0][1]  [0][2]  [0][3]
            [1][0]   [1][1]  [1][2]  [1][3]
         */

        classifica[0][0] = "riga 0 col 0";
        classifica[0][1] = "riga 0 col 1";
        classifica[0][2] = "riga 0 col 2";
        classifica[0][3] = "riga 0 col 3";

        classifica[1][0] = "riga 1 col 0";
        classifica[1][1] = "riga 1 col 1";
        classifica[1][2] = "riga 1 col 2";
        classifica[1][3] = "riga 1 col 3";


        classifica = new String[][]{
                {"riga 0 col 0","riga 0 col 1","riga 0 col 2","riga 0 col 3"},
                {"riga 1 col 0","riga 1 col 1","riga 1 col 2","riga 1 col 3"},
                {"riga 2 col 0","riga 2 col 1","riga 2 col 2","riga 2 col 3","riga 2 col 4","riga 2 col 5" },
        };



        for (int riga=0; riga<classifica.length;riga++ ){
            System.out.println(classifica[riga]);
            for(int colonna=0;colonna<classifica[riga].length;colonna++){
                System.out.println(classifica[riga][colonna]);
            }
        }



    }

}//end class
