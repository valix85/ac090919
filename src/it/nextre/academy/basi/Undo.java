package it.nextre.academy.basi;


import it.nextre.academy.basi.eccezioni.IllegalParamsException;

public class Undo<E> {
    E[] mem;

    public Undo(){
        this(3);
    }
    public Undo(Integer size){
        if (size<=0)
            throw new IllegalParamsException("Grandezza minima di 1 posizione");
        mem = (E[]) new Object[size];
    }

    public void add(E elem){
        //debug();
        //caso base
        if (mem[0]==null){
            mem[0]=elem;
            return;
        }
        //altrimenti cerco la prima posizione nulla e la inverto con il precedente
        for (int i = 0; i < mem.length; i++) {
            if (mem[i]==null){
                mem[i]=mem[i-1];
                mem[i-1]=null;
                break;
                //if (i==1)
            }
            if (i==mem.length-1 && mem[mem.length-1]!=null)
                mem[mem.length-1]=null;
        }//end for
        add(elem);
    }

    public E getItem(int idx){
        return mem[idx];
    }

    public void debug(){
        for (int i = 0; i < mem.length; i++) {
            System.out.print(mem[i]+" ");
        }//end for
        System.out.println("");
    }
}//end class
