package it.nextre.academy.designpattern;


import it.nextre.academy.myutils.ListaI;

import java.util.Random;

// https://refactoring.guru/design-patterns/singleton
public class Pallottoliere {

    private static Pallottoliere instance = null;

    private Pallottoliere(){
        // non faccio nulla per ora
        db=new ListaI();
        r=new Random();
    }

    public synchronized static Pallottoliere getInstance(){
        if (instance==null){
            instance = new Pallottoliere();
        }
        return instance;
    }



    private ListaI db;
    private Random r;

    private int mischia(){
        System.out.println("Shuffle in corso....");
        return 1+r.nextInt(90);
    }

    public int estrai(){
        int num = mischia();
        if (!db.contains(num)){
            db.add(num);
            return num;
        }
        System.out.println("trovato doppione non concesseo n: "+ num);
        return estrai();
    }

    public void reset(){
        db.clear();
    }


}//end class
