package it.nextre.academy.designpattern.strategy;

import it.nextre.academy.basi.Umano;

public class CriterioDinamicoEta implements Filtrabile{

    private boolean maggiore=false;
    private int soglia;

    public CriterioDinamicoEta(boolean maggiore, int soglia) {
        this.maggiore = maggiore;
        this.soglia = soglia;
    }

    @Override
    public boolean filtra(Umano umano) {
        return maggiore? umano.getEta()>soglia : umano.getEta()<soglia;
    }
}//end class
