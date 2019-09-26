package it.nextre.academy.Lotteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteggiatore {

    private static Sorteggiatore instance;
    private List<Giocante> iscritti;
    private Random r;
    private Integer estratto;  //stato interno da osservare
    private List<Integer> estraibili;


    //singleton

    private Sorteggiatore(){
        iscritti = new ArrayList<>();
        r = new Random();
        estraibili=new ArrayList<>();
        for (int i = 1; i <= 90; i++) {
            estraibili.add(i);
        }//end for
    }


    public synchronized static Sorteggiatore getInstance() {
        if (instance==null){
            instance=new Sorteggiatore();
        }
        return instance;
    }

    //Observable

    //add, remove, update/notify
    public boolean iscrivi(Giocante giocatore){
        return iscritti.add(giocatore);
    }

    public boolean cancellaIscrizione(Giocante giocatore){
        if (iscritti.contains(giocatore)){
            System.out.println("Disiscritto Giocatore: "+giocatore);
            return iscritti.remove(giocatore);
        }
        return false;
    }

    private void avvisa(){
        for (int i = 0; i < iscritti.size(); i++) {
            Giocante observer = (Giocante) iscritti.get(i);
            observer.controlla(estratto);
        }
    }

    public void estrai(){
        if (estraibili.size()>0){
            estratto=estraibili.get(r.nextInt(estraibili.size()));
            avvisa();
        }
    }

}//end class
