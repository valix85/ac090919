package it.nextre.academy.designpattern.PublisherSubscriber_Observable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EstrattoreRandomico extends PublisherSubjectObserver {

    List<Integer> tabellone;
    Random r ;

    public EstrattoreRandomico(){
        r = new Random();
        tabellone = new ArrayList<>();
        for(int i = 1; i<=90;i++){
            tabellone.add(i);
        }
    }

    public Integer estrai(){
        if (!tabellone.isEmpty()) {
            Integer estratto = tabellone.get(r.nextInt(tabellone.size()));
            tabellone.remove(estratto);
            update(estratto);
            return estratto;
        }
        else {
            update(null);
            return null;
        }
    }

}//end class
