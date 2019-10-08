package it.nextre.academy.basi;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class CollectionVarie {

    public static void main(String[] args) {

        Map<String, String> classifica = new Hashtable<>();


        classifica.put("F", "C");
        classifica.put("Z", "C");
        classifica.put("A", "C");
        classifica.put("3", "Z");
        classifica.put("2", "B");
        classifica.put("1", "A");
        classifica.put("4", "C");

        Map<String, String> mappaOrdinata = new TreeMap<>(classifica);

        System.out.println(classifica);
        System.out.println(mappaOrdinata);


    }//end main

}//end class
