package it.nextre.academy.basi;

import java.util.*;

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




        Box<String> lettera = new Box<>("Ciao");


        List<String> emails = new ArrayList<>();


        List<String> l1 = new LinkedList<>();


        Undo<Integer> estrazioni = new Undo<>();
        estrazioni.debug();
        estrazioni.add(5);
        estrazioni.debug();
        estrazioni.add(3);
        estrazioni.debug();
        estrazioni.add(8);
        estrazioni.debug();
        estrazioni.add(7);
        estrazioni.debug();
        estrazioni.add(1);
        estrazioni.debug();
        Random r = new Random();
        for (int i = 0; i<15; i++){
            estrazioni.add(r.nextInt(10));
            estrazioni.debug();
        }



        Undo<String> posizioni = new Undo<>(1);
        posizioni.debug();
        posizioni.add("Mario");

        posizioni.debug();
        posizioni.add("Chiara");

        posizioni.debug();
        posizioni.add("Luca");

        posizioni.debug();
        posizioni.add("Federica");

        posizioni.debug();
        posizioni.add("Gianni");

        posizioni.debug();
        posizioni.add("Valerio");

        posizioni.debug();
        posizioni.add("Enrica");
        posizioni.debug();
        posizioni.add("Valter");

        posizioni.debug();
        posizioni.add("Francesca");
        posizioni.debug();




    }//end main

}//end class
