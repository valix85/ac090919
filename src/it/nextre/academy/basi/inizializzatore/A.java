package it.nextre.academy.basi.inizializzatore;

public class A {

    {
        System.out.println("Iniz istanza A");
    }

    static{
        System.out.println("Iniz statico A");
    }

    public A(){
        System.out.println("Costruttore di A");
    }

    public static void saluta(){
        System.out.println("Saluti da A");
    }

}//end class
