package it.nextre.academy.shoppone;

/*
 *
 * Gestore di ordini
 * Tenere traccia degli ordini effettuati da una persona per poi eseguire diverse statistiche su di essi. il Main non potrò venire a conoscenza degli ordini delle singole persone. Nessuno al di fuori di esse conoscerà tali oggetti.
 *
 * Main crea le persone
 * La persona può tenere traccia dei suoi ordini
 * La persona può avere operazioni sugli ordini
 * Il suo registro è privato
 * Gli ordini sono composti di ordine, data…
 * Dall’esterno non si può accedere agli ordini.
 * Il main crea i prodotti
 *
 * */


import it.nextre.academy.myutils.DummyData;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class NegozioMain {


    public static final long N_PRODOTTI_NEGOZIO = 10;
    public static final long N_ACQUISTI_PERSONA = 5;
    public static final long N_PRODOTTI_PER_ACQUISTO_PERSONA = 3;
    public static final Random RND = new Random();


    public static void main(String[] args) {

        NegozioMain negozio = new NegozioMain();

        //Creo i prodotti in una lista
        List<Prodotto> magazzino = negozio.creaMagazzino(N_PRODOTTI_NEGOZIO);

        //System.out.println(magazzino);


        //Creo una persona che compri randomicamente per N volte X prodotti
        Persona mark = new Persona("Mark", DummyData.getSurname());
        for (long acquisto = 0; acquisto < N_ACQUISTI_PERSONA ; acquisto++) {
            for (long n_prodotto = 0; n_prodotto < N_PRODOTTI_PER_ACQUISTO_PERSONA ; n_prodotto++) {
                Prodotto prodottoAcaso = magazzino.get(RND.nextInt(magazzino.size()));
                mark.compra(prodottoAcaso);
            }//end for
            mark.paga();
        }//end for

        //la persona avrà realizzato diversi acquisti, procedo con estrarre le statistiche da esso.

        System.out.println("#############################################");
        System.out.println("#############################################");
        System.out.println("######  ANALISI  ############################");
        System.out.println("#############################################");
        System.out.println("#############################################");

        //Q1 ottenere la stampa di tutti gli scontrini della persona
        mark.stampaRegistroOrdini();

        //todo ... fare statistica!


    }//end main


    private List<Prodotto> creaMagazzino(Long qta){
        List<Prodotto> temps = new LinkedList<>();
        for (long i = 0; i < qta; i++) {
            Prodotto tmp;
            do {
                tmp = Prodotto.getRandomProdotto();
            }while(temps.contains(tmp));
            temps.add(tmp);
        }//end for
        return temps;
    }

}//end class



