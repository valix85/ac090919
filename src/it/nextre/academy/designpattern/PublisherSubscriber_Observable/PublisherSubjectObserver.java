package it.nextre.academy.designpattern.PublisherSubscriber_Observable;

import java.util.ArrayList;
import java.util.List;

public class PublisherSubjectObserver {

    List<ObserverInterface> iscritti;

    public PublisherSubjectObserver(){
        iscritti=new ArrayList<>();
    }

    public void addSubscriberObservable(ObserverInterface item){
        if (iscritti.add(item))
            System.out.println("Item iscritto con successo");
        else
            System.out.println("Registrazione item fallita");

    }

    public void removeSubscriberObservable(ObserverInterface item){
        if(iscritti.remove(item))
            System.out.println("Item rimosso dall'elenco");
        else
            System.out.println("Item non presente in elenco");
    }

    public void update(Integer param){
        for(ObserverInterface item : iscritti){
            item.doAction(param);
        }
    }

    //todo more custom operations

}//end class
