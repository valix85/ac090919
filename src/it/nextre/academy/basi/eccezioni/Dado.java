package it.nextre.academy.basi.eccezioni;

import java.security.PublicKey;
import java.util.Random;

public class Dado {

    private int min, max, faccia;
    private int valore = 0;
    private Random r;

    public Dado() {
        this.r = new Random();
        this.min = 1;
        this.max = 6;
    }

    public Dado(boolean tirato) {
        this.r = new Random();
        this.min = 1;
        this.max = 6;
        if(tirato) faccia = this.min+r.nextInt(max+1-min);
    }

    public Dado(int max) {
        this();
        if (max <= min) { // in realtà è anche max<0
            throw new IllegalParamsException("N. di facce non valido");
        }
        this.max = max;
    }

    public Dado(int min, int max) {
        this();
        if (max <= min || min >=max) {
            throw new IllegalParamsException("N. di facce non valido");
        }
        this.min = min;
        this.max = max;
    }


    public int tira() throws InvalidTiroException{
        if (r.nextDouble()<0.3){
            throw new InvalidTiroException();
        }
        faccia = this.min+r.nextInt(max+1-min);
        return faccia;
    }

    public int getFaccia() {
        return faccia;
    }
}//end class
