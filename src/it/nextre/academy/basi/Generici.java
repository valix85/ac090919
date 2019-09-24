package it.nextre.academy.basi;

import java.util.ArrayList;
import java.util.List;

public class Generici {

    public static void main(String[] args) {
        ArrayList<String> iscritti = new ArrayList<String>();
        ArrayList<Double> prezzi = new ArrayList<>();
        ArrayList items = new ArrayList();

        iscritti.add("Pierino Penati");
        prezzi.add(110.0);

        items.add(iscritti);
        items.add(prezzi);
        items.add("Valerio");

        //iscritti.add(110.0); //NON SI può FARE!

        ArrayList<Number> numeri = new ArrayList<>();
        numeri.add(5); //numeri.add(new Integer(5))
        numeri.add(5L);//numeri.add(new Long(5L))
        numeri.add(5D);//numeri.add(new Double(5D))

        System.out.println(numeri.get(0).getClass());
        System.out.println(numeri.get(1).getClass());
        System.out.println(numeri.get(2).getClass());

        for(Number n : numeri){
            if (n instanceof Integer){
                ((Integer)n).compareTo(6);
            }
            if (n instanceof Long){
                ((Long)n).compareTo(6L);
            }
            if (n instanceof Double){
                ((Double)n).isInfinite();
            }
        }

    }//end main

}//end class
