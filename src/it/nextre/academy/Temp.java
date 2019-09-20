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
    }//end main

}//end class
