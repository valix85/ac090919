package it.nextre.academy.supermercato;

public class Prodotto {

    private String nome;
    private double pesoKg;
    private double prezzo;
    private String barcode;
    private String categoria;

    public Prodotto(String nome, double pesoKg, double prezzo, String barcode) {
        this.nome = nome;
        this.pesoKg = pesoKg;
        this.prezzo = prezzo;
        this.barcode = barcode;
        this.categoria = "sconosciuta";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getBarcode() {
        return barcode;
    }

    private void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getCategoria() {
        return categoria;
    }

    void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "nome='" + nome + '\'' +
                ", pesoKg=" + pesoKg +
                ", prezzo=" + prezzo +
                ", barcode='" + barcode + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}//end class
