package it.nextre.academy.designpattern;

public class Estrattore {

    public static void main(String[] args) {
        Pallottoliere p1 = Pallottoliere.getInstance();
        Pallottoliere p2 = Pallottoliere.getInstance();
        Pallottoliere p3 = Pallottoliere.getInstance();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p1.estrai());
        System.out.println(p2.estrai());
        System.out.println(p3.estrai());
        System.out.println(p1.estrai());
        System.out.println(p1.estrai());
        System.out.println(p1.estrai());
        System.out.println(p1.estrai());
        System.out.println(p1.estrai());
        System.out.println(p1.estrai());
        System.out.println(p1.estrai());
        System.out.println(p1.estrai());
        System.out.println(p1.estrai());
        System.out.println(p1.estrai());
        System.out.println(p1.estrai());
        System.out.println(p1.estrai());
        System.out.println(p1.estrai());
        System.out.println(p1.estrai());
        System.out.println(p1.estrai());
        System.out.println(p1.estrai());
    }//end main

}//end class
