package it.nextre.academy.files;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public class Lettura {

    public static void main(String[] args) {



        try {
            File test = new File("test.txt");



            File targhe = new File ("C:"+File.separator+"Academy"+File.separator+"academy3"+File.separator+"verifica1"+File.separator+"Soluzione"+File.separator+"targhe.txt");
            FileReader fr = new FileReader(targhe);
            BufferedReader br = new BufferedReader(fr);
            String riga=null;

            //br.mark(0);
            //System.out.println(br.lines().count());
            //List<String> elenco = br.lines().collect(Collectors.toList());
            //System.out.println(elenco.size());
            //int  righe = 456976000*6*2;
            //br.reset();
            //br.skip(6L);
            System.out.println("ciclo");
            long nrighe=0L;
            long limite = 456976000-1010;
            while((riga=br.readLine())!=null){
                //System.out.println(riga);
                nrighe++;
                if (nrighe>limite)
                    System.out.println(riga);
            }
            br.close();
            System.out.println("n_righe: "+nrighe);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }//end main

}//end class
