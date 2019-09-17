package it.nextre.academy.supermercato;

public class ProdottoCasalingo extends Prodotto{


    private String categoria;

    public ProdottoCasalingo(String nome, double pesoKg, double prezzo, String barcode) {
        super(nome,pesoKg,prezzo,barcode);
        this.categoria = "casalingo";
    }

    @Override
    public String toString() {
        return "ProdottoCasalingo{" +
                "nome='" + super.getNome() + '\'' +
                ", peso=" + super.getPesoKg()+
                ", prezzo=" + super.getPrezzo() +
                ", barcode='" + super.getBarcode() + '\'' +
                ", categoria='" + super.getCategoria() + '\'' +
                '}';
    }

}//end class
