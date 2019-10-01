package it.nextre.academy.basi.enumerazioni.cancello;

public class Cancello {

    private StatoCremagliera stato;
    private int progresso;

    public Cancello(){
        stato=StatoCremagliera.CHIUSA;
        progresso=stato.getProgresso();
        stampaInfo();
    }

    public void apri(){
        /*
        if (stato==StatoCremagliera.APERTA){
            System.out.println("Il cancello è già aperto");
        }else{
            System.out.println("VADO A: "+StatoCremagliera.APERTA);
            while(progresso>StatoCremagliera.APERTA.getProgresso()){
               retrai();
            }
            stato=StatoCremagliera.APERTA;
            stampaInfo();
        }
        */
        muoviA(StatoCremagliera.APERTA);
    }

    public void chiudi(){
        /*
        if (stato==StatoCremagliera.CHIUSA){
            System.out.println("Il cancello è già chiuso");
        }else{
            System.out.println("VADO A: "+StatoCremagliera.CHIUSA);
            while(progresso<StatoCremagliera.CHIUSA.getProgresso()){
                avanza();
            }
            stato=StatoCremagliera.CHIUSA;
            stampaInfo();
        }
        */
         muoviA(StatoCremagliera.CHIUSA);
    }

    public void unMezzo(){
        muoviA(StatoCremagliera.UN_MEZZO);
    }
    public void unQuarto(){
        muoviA(StatoCremagliera.UN_QUARTO);
    }
    public void treQuarti(){
        muoviA(StatoCremagliera.TRE_QUARTI);
    }

    private void muoviA(StatoCremagliera to) {
        if (stato==to){
            System.out.println("Il cancello è già in posizione"); return;
        }
        System.out.println("VADO A: "+to);
        if (stato.getProgresso()<to.getProgresso()){
            while(progresso<to.getProgresso()){
                avanza();
            }
        }else{
            while(progresso>to.getProgresso()){
                retrai();
            }
        }
        stato=to;
        stampaInfo();
    }

    private void avanza(){
        progresso++;
        graficaCancello();
    }

    private void retrai(){
        progresso--;
        graficaCancello();
    };

    private void graficaCancello() {
        String out = "|";
        int lunghezza=20;
        int ncanc = (progresso*lunghezza)/100;
        int binario = lunghezza-ncanc;
        out+="X".repeat(ncanc);
        out+="_".repeat(binario);
        System.out.println(out+"|");
    }

    private void stampaInfo() {
        System.out.println("Il cancello è in stato: "+stato);
        System.out.println("Progresso: "+progresso);
    }

}//end class
