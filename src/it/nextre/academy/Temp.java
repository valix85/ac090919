package it.nextre.academy;

public class Temp {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        a = a-b;
        b = b+a;
        a = b-a;
        System.out.println("a= "+a);
        System.out.println("b= "+b);

        System.out.println("-------------------");

        double d1 = 0.02;
        double d2 = 0.05;
        double ris = d1+d2;
        System.out.println(ris);
        System.out.println(sommaDouble(d1,d2));

    }//end main

    public static double sommaDouble(double d1, double d2){
        d1 = 0.02;
        d2 = 0.05;
        double ris = d1+d2;
        return ris;
    }

}//end class
