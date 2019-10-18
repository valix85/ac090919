package it.nextre.academy.basi.gestionefile;

import java.io.*;

public class TextReaderWriterMain {

    public static void main(String[] args) {




        File f = new File("textdemo.txt");
        if (!f.exists())
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }


        try {
            FileReader fr = new FileReader("textdemo.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        try (
                FileReader fr =new FileReader("textdemo.txt");
                BufferedReader bfr = new BufferedReader(fr)
        ){
            String riga = null;
            while( (riga=bfr.readLine())!=null ){
                //System.out.println("Letto: "+riga);
                //fr.close();
            }
            System.out.println("end");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }//end main


}//end class
