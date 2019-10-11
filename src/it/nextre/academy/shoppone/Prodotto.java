package it.nextre.academy.shoppone;

import it.nextre.academy.myutils.DummyData;
import it.nextre.academy.myutils.MySupport;

import java.util.Objects;

public class Prodotto {
    public static Prodotto getRandomProdotto() {
        return new Prodotto(DummyData.getProdotto(), DummyData.getMarca(), DummyData.getRandomDouble(10,8));
    }


    private String nome;
    private String marca;
    private Double prezzo;

    public Prodotto(String nome, String marca, Double prezzo) {
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prodotto prodotto = (Prodotto) o;
        return nome.equals(prodotto.nome) &&
                marca.equals(prodotto.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, marca);
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", prezzo=" + MySupport.formattaDouble(prezzo) +
                '}';
    }


    @Override
    protected Prodotto clone() {
        return new Prodotto(this.nome, this.marca, this.prezzo);
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public Double getPrezzo() {
        return prezzo;
    }
}//end class
