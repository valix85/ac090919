package it.nextre.academy.basi.inizializzatore;

public class C extends B {

    {
        System.out.println("Iniz istanza C");
    }

    static{
        System.out.println("Iniz statico C");
    }

    public C(){
        System.out.println("Costruttore di C");
    }

    public static void saluta(){
        System.out.println("Saluti da C");
    }
}//end class
