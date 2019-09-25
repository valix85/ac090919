package it.nextre.academy.designpattern.PublisherSubscriber_Observable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainObservable {

    public static void main(String[] args) {
        EstrattoreRandomico esr = new EstrattoreRandomico();
        List<Player> giocatori = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 5; i++) {
            Player tmp = new Player("Giocatore "+(i+1), (1+r.nextInt(90))  );
            giocatori.add(tmp);
            esr.addSubscriberObservable(tmp);
        }//end for

        while (esr.estrai()!=null){

        }
    }//end main

}//end class
