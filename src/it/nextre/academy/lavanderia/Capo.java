package it.nextre.academy.lavanderia;

import java.time.LocalDateTime;
import java.util.Random;

public class Capo {

    private static long contatore=0; //NESSUNO, se non il metodo dedicato, DOVRà USARE QUESTA VARIABILE!!!
    private synchronized static long nextCartellino(){
        return ++contatore;
    }

    private long cartellino;
    private Materiale materiale;
    private Categoria categoria;
    private Colore colore;
    private double prezzo;
    private boolean pulito;
    private LocalDateTime dataLavaggio;


    public Capo(Materiale materiale, Categoria categoria, Colore colore) {
        this.cartellino = nextCartellino();
        this.materiale = materiale;
        this.categoria = categoria;
        this.colore = colore;
    }

    public Capo() {
        this(getMaterialeRandom(),
            getCategoriaRandom(),
            getColoreRandom()
        );
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public boolean isPulito() {
        return pulito;
    }

    public void setPulito(boolean pulito) {
        this.pulito = pulito;
    }

    public LocalDateTime getDataLavaggio() {
        return dataLavaggio;
    }

    public void setDataLavaggio(LocalDateTime dataLavaggio) {
        this.dataLavaggio = dataLavaggio;
    }

    public Materiale getMateriale() {
        return materiale;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Colore getColore() {
        return colore;
    }

    @Override
    public String toString() {
        return "Capo{" +
                "cartellino=" + cartellino +
                ", materiale=" + materiale +
                ", categoria=" + categoria +
                ", colore=" + colore +
                ", prezzo=" + prezzo +
                ", pulito=" + pulito +
                ", dataLavaggio=" + dataLavaggio +
                '}';
    }

    private static Materiale getMaterialeRandom() {
        return new Estrattore<Materiale>().getOne( Materiale.values());
    }
    private static Categoria getCategoriaRandom() {
        return new Estrattore<Categoria>().getOne( Categoria.values());
    }
    private static Colore getColoreRandom() {
        return new Estrattore<Colore>().getOne( Colore.values());
    }

}//end class


class Estrattore<T> {
    private static Random r = new Random();
    public T getOne(T[] arr){
        return arr[r.nextInt(arr.length)];
    }
}