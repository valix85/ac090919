package it.nextre.academy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Urna<E> {

    private List<E> mem; //memory of elements
    private Random r;

    public Urna(){
        mem = new ArrayList<>();
        r = new Random();
    }

    public boolean put(E item){
        if (!mem.contains(item))
            return mem.add(item);
        return false;
    }

    /**
     * Estrae randomicamente un elemento dal suo insieme e lo rimuove dall'insieme
     * */
    public E fetch(){
        if (!mem.isEmpty())
            return mem.remove(r.nextInt(mem.size()));
        //throw new RuntimeException("EmptyListException");
        return null;
    }

    @Override
    public String toString(){
        String tmp = "";
        for(E item:mem){
            tmp+=item.toString()+" , ";
        }
        return tmp.length()>=3?tmp.substring(0, tmp.length()-3):tmp;
    }

}//end class
