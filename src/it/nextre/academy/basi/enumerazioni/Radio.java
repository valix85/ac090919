package it.nextre.academy.basi.enumerazioni;

public enum Radio {
    ACCESA("2xx", "Power ON"),
    SPENTA("5xx", "Power OFF"),
    PLAY("202","Play..."){
        @Override
        public void stampa() {
            //non faccio fare nulla
        }
    },
    // PAUSA, //NO, in origne non c'era
    STOP("503", "STOP"),
    AVANTI("302"),
    INDIETRO("301"),
    VOL_UP("889", "Vol up"),
    VOL_DOWN("887","Vol Down"),
    //I valori nuovi sempre in fondo, mai inserirli nel mezzo!
    PAUSA("418", "PAUSE") //Si, in origne non c'era e lo aggiungo alla fine
    ;



    //private Radio(){errorCode="-1";mexToPrint="";}
    private Radio(String errorCode){
        this.errorCode=errorCode;
        mexToPrint="";
    }
    private Radio(String errorCode, String mexToPrint){
        this.errorCode=errorCode;
        this.mexToPrint=mexToPrint;
    }


    private String errorCode;
    private String mexToPrint;

    public String getStato(){return ""+this.ordinal()+" - "+this.name();}

    public String getErrorCode(){
        return errorCode;
    }

    public void stampa(){
        System.out.println(mexToPrint);
    };

    @Override
    public String toString() {
        return "Valore Enum: " + this.name();
    }
}//end class
