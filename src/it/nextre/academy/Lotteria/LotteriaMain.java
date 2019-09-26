package it.nextre.academy.Lotteria;

import java.util.ArrayList;
import java.util.List;

public class LotteriaMain {

    public static final int N_GIOCATORI = 100;
    public static final int N_RIGHE_SCHEDINA = 3;
    public static final int N_NUMERI_RIGA = 6;

    public static void main(String[] args) {

        //preparare il tabellone di gioco
        Sorteggiatore s1 = Sorteggiatore.getInstance();

        //preparare i giocatori
        List<Giocatore> giocatori = new ArrayList<>();
        for (int i = 0; i < N_GIOCATORI; i++) {
            Giocatore giocatoreTmp = new Giocatore(s1, "Giocatore "+(i+1));
            s1.iscrivi(giocatoreTmp);
            giocatori.add(giocatoreTmp);
        }//end for

        //estrarre
        List<Giocatore> vincitori = new ArrayList<>();
        while(vincitori.size()==0){
            s1.estrai();
            for(Giocatore g : giocatori){
                if (g.haVinto()){
                    vincitori.add(g);
                    g.getObservable().cancellaIscrizione(g);
                }
            }
        }

        //stampare statistiche
        for(Giocatore g : vincitori){
            System.out.println(g);
            g.stampaSchedina();
        }

    }//end main

}//end class
