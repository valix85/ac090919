package it.nextre.academy.basi;

import java.util.Comparator;

public class UmanoComparator{

    public final static Comparator<Umano> cognomeNomeComparator = (Umano o1, Umano o2) -> {
        if (!o1.getCognome().equals(o2.getCognome())) {
            return o1.getCognome().compareTo(o2.getCognome());
        } else {
            return o1.getNome().compareTo(o2.getNome());
        }
    };

    public final static Comparator<Umano> etaComparator = (Umano o1, Umano o2) -> {
        if (o1.getEta() == o2.getEta()) {
            return cognomeNomeComparator.compare(o1, o2);
        } else {
            return o1.getEta() - o2.getEta();
        }
    };


    public static final Comparator<Umano> pesoComparator = (Umano u1, Umano u2) -> {
        if (u1.getPeso() > u2.getPeso())
            return 1;
        else if (u1.getPeso() < u2.getPeso())
            return -1;
        else
            return cognomeNomeComparator.compare(u1,u2);
    };
}//end class
