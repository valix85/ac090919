package it.nextre.academy.designpattern.strategy.converter;

import java.util.ArrayList;
import java.util.List;

public class LunghezzaConvertibile implements Convertibile {

    private List<String> lunghezze = new ArrayList<>();
    private double risultato;
    private int grandezzeDaSaltare;
    public LunghezzaConvertibile() {
        lunghezze.add("mm");
        lunghezze.add("cm");
        lunghezze.add("dm");
        lunghezze.add("m");
        lunghezze.add("dam");
        lunghezze.add("hm");
        lunghezze.add("Km");
        risultato = 0;
        grandezzeDaSaltare = 0;
    }



    @Override
    public String converti(double qta, String from, String to) {
        risultato = qta;
        if (lunghezze.indexOf(from) > lunghezze.indexOf(to)) {
            grandezzeDaSaltare = lunghezze.indexOf(from) - lunghezze.indexOf(to);
            while (grandezzeDaSaltare > 0) {
                risultato = risultato * 10;
                grandezzeDaSaltare--;

            }
            return ""+risultato;
        } else {
            grandezzeDaSaltare = lunghezze.indexOf(to) - lunghezze.indexOf(from);
            while (grandezzeDaSaltare > 0) {
                risultato = risultato / 10;
                grandezzeDaSaltare--;
            }
            return ""+risultato;
        }
    }



}//end class
