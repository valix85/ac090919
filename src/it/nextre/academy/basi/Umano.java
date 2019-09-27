package it.nextre.academy.basi;

import it.nextre.academy.myutils.DummyData;
import it.nextre.academy.myutils.MySupport;

import java.util.Comparator;

public class Umano implements Comparable<Umano>, Comparator<Umano> {
    private String nome;
    private String cognome;
    private int eta;
    private double peso;
    private double altezza;

    public Umano(String nome, String cognome, int eta, double peso, double altezza) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.peso = peso;
        this.altezza = altezza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public String toString() {
        return "Umano{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                ", peso=" + MySupport.formattaDouble(peso) + "kg" +
                ", altezza=" + MySupport.formattaDouble(altezza) + "cm" +
                '}';
    }


    // Comparable
    @Override
    public int compareTo(Umano o) {
        //if(!(o instanceof Umano))return -1; //inutile perchè ho tipizzato il Comparable nell'interfaccia!
        return this.nome.compareTo(((Umano) o).getNome());
    }


    //Comparator


    @Override
    public int compare(Umano o1, Umano o2) {
        return o1.getEta() - o2.getEta();
    }

    public static Umano getRandomUmano() {
        return new Umano(
                DummyData.getName(),
                DummyData.getSurname(),
                DummyData.getAge(),
                DummyData.getRandomDouble(50, 20),
                DummyData.getRandomDouble(170, 30)
        );
    }

}
//end class
