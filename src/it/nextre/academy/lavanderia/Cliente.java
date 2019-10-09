package it.nextre.academy.lavanderia;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Cliente {

    private String nome;
    private String cognome;

    private List<Capo> cesta;

    public Cliente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.cesta = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", N° capi in cesta=" + cesta.size() +
                '}';
    }

    public void portaALavare(Capo capo) {
        if (capo !=null && !cesta.contains(capo))
            cesta.add(capo);
    }

    public List<Capo> getCesta() {
        return cesta;
    }



    public List<Capo> getCapiLavatiPerPrezzo() {
        List<Capo> puliti = cesta.stream()
                .filter(Capo::isPulito)
                .collect(Collectors.toList());
        //ordino la lista dei puliti
        puliti.sort(new Comparator<Capo>() {
            @Override
            public int compare(Capo o1, Capo o2) {
                if (o1.getPrezzo()-o2.getPrezzo()==0)
                    return 0;
                else if (o1.getPrezzo()-o2.getPrezzo()>0)
                    return -1;
                else
                    return 1;
            }
        });

        return puliti;
    }
}//end class
