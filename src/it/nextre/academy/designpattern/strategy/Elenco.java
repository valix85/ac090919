package it.nextre.academy.designpattern.strategy;

import it.nextre.academy.basi.Umano;

import java.util.ArrayList;
import java.util.List;

public class Elenco {

    List<Umano> db;

    public Elenco() {
        this.db = new ArrayList<>();
    }

    public boolean add(Umano u){
        return db.add(u);
    }

    public List<Umano> estrai(Filtrabile f){
        List<Umano> tmp = new ArrayList<>();
        for(Umano u : db){
            if (f.filtra(u)) tmp.add(u);
        }
        return tmp;
    }

    public int size() {
        return db.size();
    }
}//end class
