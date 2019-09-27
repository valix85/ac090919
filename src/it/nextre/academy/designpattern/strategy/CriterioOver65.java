package it.nextre.academy.designpattern.strategy;

import it.nextre.academy.basi.Umano;

public class CriterioOver65 implements Filtrabile{
    @Override
    public boolean filtra(Umano umano) {
        return umano.getEta()>=65;
    }
}//end class
