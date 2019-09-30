package it.nextre.academy.basi.enumerazioni;

public class EnumMain {
    public static void main(String[] args) {


        AutoradioSany stereo = new AutoradioSany("CDX101EP");

        /*
        if (stereo.getState()==Radio.ACCESA){} //OK
        if (stereo.getState().ordinal()==1){}//BAD!

        System.out.println(Radio.ACCESA.ordinal());
        System.out.println(Radio.SPENTA.ordinal());
        System.out.println(Radio.STOP.ordinal());
        */

        //System.out.println(Radio.values());

        Radio[] r = Radio.values();
        for(Radio tmp : r){
            System.out.println(tmp);
            System.out.println(tmp.toString());
            System.out.println(tmp.ordinal());
            System.out.println(tmp.getErrorCode());
            tmp.stampa();
            System.out.println("\n-------------");

        }


        System.out.println(
                Radio.valueOf("STOP").ordinal()
        );


    }//end main
}//end class



class AutoradioSany{
    private String modello;
    private Radio state;

    public AutoradioSany(String modello) {
        this.modello = modello;
        this.state = Radio.SPENTA;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public Radio getState() {
        return state;
    }

    public void setState(Radio state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "AutoradioSany{" +
                "modello='" + modello + '\'' +
                ", state=" + state +
                '}';
    }
}