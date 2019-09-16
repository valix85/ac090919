package it.nextre.academy.basi.inizializzatore;

public class B extends A {

    {
        System.out.println("Iniz istanza B");
    }

    static{
        System.out.println("Iniz statico B");
    }

    public B(){
        System.out.println("Costruttore di B");
    }

    public static void saluta(){
        System.out.println("Saluti da B");
    }

}//end class
