package it.nextre.academy.designpattern.strategy;

import it.nextre.academy.basi.Umano;

public class CriterioUnder18 implements Filtrabile{
    @Override
    public boolean filtra(Umano umano) {
        return umano.getEta()<18;
    }
}//end class
