package it.nextre.academy.designpattern.strategy;

import it.nextre.academy.basi.Umano;

import java.util.List;

public class StrategyMain {

    public static void main(String[] args) {

        Elenco partecipanti = new Elenco();

        for (int i =0; i<300;i++){
            partecipanti.add(Umano.getRandomUmano());
        }

        System.out.println("Partecipanti: " + partecipanti.size());
        partecipanti
                .estrai(new CriterioCercaEta(63))
                .stream()
                .forEach(System.out::println);


        List<Umano> tmp = partecipanti
                .estrai((Umano u) ->
               u.getNome().toLowerCase().startsWith("a")
        );

        System.out.println(tmp);

    }//end main


}//end class
