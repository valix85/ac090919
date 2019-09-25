package it.nextre.academy.designpattern.PublisherSubscriber_Observable;

import java.util.ArrayList;
import java.util.Iterator;
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

        Integer tmp;
        while (esr.size()>0 && (tmp=esr.estrai())!=null ){
            System.out.println("Estratto: "+tmp);


            Iterator<Player> it = giocatori.iterator();
            while(it.hasNext()){
                Player p=it.next();
                if (p.inGioco()==true && p.haVinto()){
                    esr.removeSubscriberObservable(p);
                    p.setInGioco(false);
                }
            }
            System.out.println("In gara: "+esr.size()+" giocatori");

        }
    }//end main

}//end class
