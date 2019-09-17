package it.nextre.academy.supermercato;

public class ProdottoDaBanco extends Prodotto {
    private double prezzoKg;

    public ProdottoDaBanco(String nome, double pesoKg, String barcode, double prezzoKg) {
        super(nome,pesoKg,prezzoKg*pesoKg,barcode);
        super.setCategoria("da banco");
        this.prezzoKg = prezzoKg;
        //setPrezzo();

    }
//    Calcolato direttamente nel costruttore
//    private void setPrezzo() {
//        super.setPrezzo(prezzoKg*super.getPesoKg());
//    }

    @Override
    public String toString() {
        return "ProdottoDaBanco{" +
                "nome='" + super.getNome() + '\'' +
                ", peso=" + super.getPesoKg()+
                ", prezzo=" + super.getPrezzo() +
                ", barcode='" + super.getBarcode() + '\'' +
                ", categoria='" + super.getCategoria() + '\'' +
                ", prezzoKg=" + this.prezzoKg +
                '}';
    }
}//end class
