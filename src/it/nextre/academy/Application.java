package it.nextre.academy;

import it.nextre.academy.geometria.Punto;
import it.nextre.academy.geometria.forme.Rettangolo;

public class Application {

    static int x;
    static Punto p;
    static String str;

    public static final void main(String[] args) {


        Punto p1 = new Punto();
        p1.x = 3;
        p1.y = 5;

        Punto p2 = new Punto();
        p2.x = 3;
        p2.y = 5;

        Punto p3 = p1;
        p3.x=30;
        p3.y=50;

        Punto p4 = new Punto();
        p4.x=30;
        p4.y=50;

        System.out.println(p1 == p2);
        System.out.println(p1 == p3);
        System.out.println(p1 == p4);
        System.out.println(p3 == p4);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p4));
        System.out.println(p3.equals(p4));


        Rettangolo r1 = new Rettangolo(5, 4);
        r1.calcolaPerimetro();
        r1.setBase(10);
        System.out.println(r1.getPerimetro());

        System.out.println( "Ciao".repeat(3) );


    }//end main
}//end class
