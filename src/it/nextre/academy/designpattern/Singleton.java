package it.nextre.academy.designpattern;


// https://refactoring.guru/design-patterns/singleton
public class Singleton {

    private static Singleton instance = null;

    private Singleton(){
        // non faccio nulla per ora
    }

    public synchronized static Singleton getInstance(){
        if (instance==null){
            instance = new Singleton();
        }
        return instance;
    }


}//end class
