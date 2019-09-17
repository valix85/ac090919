package it.nextre.academy.supermercato;

import it.nextre.academy.myutils.ListaS;

import java.util.Random;

public class BarCodeGenerator {

    private ListaS codes;
    private Random r;
    private static BarCodeGenerator instance;

    private BarCodeGenerator(){
        codes=new ListaS();
        r=new Random();
    }

    public static synchronized BarCodeGenerator getIstance(){
        if (instance==null)
            instance=new BarCodeGenerator();
        return instance;
    }


    public String newCode(){
        String tmp="";
        int lunghezza = r.nextBoolean()?13:21;
        do {
            for (int i = 0; i < lunghezza; i++) {
                tmp += r.nextInt(10);
            }
        }while(codes.contains(tmp));
        codes.add(tmp);
        return tmp;
    }



}//end class
