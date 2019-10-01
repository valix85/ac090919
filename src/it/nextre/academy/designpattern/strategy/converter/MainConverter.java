package it.nextre.academy.designpattern.strategy.converter;

public class MainConverter {

    public static void main(String[] args) {

        Converter conv = new Converter();
        String risultato = conv.converti(20, "Km","m");
        System.out.println(risultato);

        risultato = conv.converti(500, "m","Km");
        System.out.println(risultato);

    }//end main

}//end class
