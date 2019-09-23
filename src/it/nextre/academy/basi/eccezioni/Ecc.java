package it.nextre.academy.basi.eccezioni;

import it.nextre.academy.myutils.MyInput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Ecc {

    public static void main(String[] args) {
        int x = 100;
        int y = 20;
        int ris = 0;
        try {
            ris = x / y;
        }
        //catch (ArithmeticException ex){}
        //catch (NullPointerException ex){}
        //catch (FileNotFoundException ex){}
        finally {
            System.out.println(ris);
        }




        //MyInput.leggiIntero2();
        Dado d1 = new Dado(4);
        try {
            d1.tira();
        }
        catch (InvalidTiroException | IllegalParamsException e) {
            //e.printStackTrace();
            //System.err.println(e.getMessage());
        }
        catch (Exception e){} //quelle più generali solo dopo
        finally {
            System.out.println(d1.getFaccia());
        }





        Random r = new Random();
        try(
                FileReader fr = new FileReader("test.txt");
                FileWriter fw = new FileWriter("test.txt");
                ){
            //to do many operations ...
            if (r.nextBoolean())
            throw new IOException();
            //to do lost operations ...
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //fr.close(); //al di fuori del try non esisterà più
        }













        FileReader fr = null;//new FileReader("test.txt");
        FileWriter fw = null;//new FileWriter("test.txt");
        String fname = "test.txt";

        try{
            fr = new FileReader(fname);
            //to do many operations
            if (r.nextBoolean())
                throw new IOException();
            //to do lost operations
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }//end main

}//end class
