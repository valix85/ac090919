package it.nextre.academy.basi;

public class Conto {

    private String nome;
    private String cognome;
    private String cf;
    private String ddn;

    private String numeroConto;
    private String IBAN;
    private double saldo;

    private String numeroCarta; //16 cifre
    private String cvv;     // codice di controllo
    private String dds;     // MM/YY
    private int tipo;       // 0 - debito, 1 - credito
    private String circuito;

    //costruttore vuoto != di default
    public Conto(){
        super();
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

    public String getCf() {
        return cf;
    }

    void setCf(String cf) {
        if(cf.length()==16)
            this.cf = cf;
    }

    public String getDdn() {
        return ddn;
    }

    public void setDdn(String ddn) {
        this.ddn = ddn;
    }

    public String getNumeroConto() {
        return numeroConto;
    }

    public void setNumeroConto(String numeroConto) {
        this.numeroConto = numeroConto;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public double getSaldo() {
        return saldo;
    }

    void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroCarta() {
        return numeroCarta;
    }

    public void setNumeroCarta(String numeroCarta) {
        this.numeroCarta = numeroCarta;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getDds() {
        return dds;
    }

    public void setDds(String dds) {
        this.dds = dds;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getCircuito() {
        return circuito;
    }

    public void setCircuito(String circuito) {
        this.circuito = circuito;
    }


    public boolean paga(double importo){
        if (importo<0) return false;
        if (saldo<importo){
            //non POTREI pagare, check carta di credito
            if (getTipo()==1){
                saldo-=importo;
                return true;
            }else{
                return false;
            }
        }else{
            saldo-=importo;
            return true;
        }
    }

    public double carica(double amount){
        return saldo+=amount;
    }

}//end class
