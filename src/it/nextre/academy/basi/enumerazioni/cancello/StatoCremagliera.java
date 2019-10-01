package it.nextre.academy.basi.enumerazioni.cancello;

public enum StatoCremagliera {
    APERTA(0),
    UN_QUARTO(25),
    UN_MEZZO(50),
    TRE_QUARTI(75),
    CHIUSA(100);

    private int progresso;
    private StatoCremagliera(int progresso){
        this.progresso=progresso;
    }
    public int getProgresso(){
        return progresso;
    }
}
