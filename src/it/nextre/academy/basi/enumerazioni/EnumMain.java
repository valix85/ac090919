package it.nextre.academy.basi.enumerazioni;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

        System.out.println("-----------------------");
        System.out.println("-----------------------");
        System.out.println("-----------------------");
        System.out.println("-----------------------");

        List<Radio> operations = new ArrayList<>();
        Random rnd = new Random();
        Radio[] values = Radio.values();
        for (int i = 0; i < 10; i++) {
            operations.add(values[rnd.nextInt(values.length
            )]);
        }//end for
        //operations.forEach(System.out::println);




        operations.stream()
                //.peek(EnumMain::operate)
                //.map(Radio::getStato)
                //.forEach(System.out::println);
                .forEach(EnumMain::operate);


    }//end main

    private static void operate(Radio operation) {
        switch (operation){
            case ACCESA:
                System.out.println("RADIO ACCESA");
                break;
            case SPENTA:
                System.out.println("RADIO SPENTA");
                break;
            case STOP:
                System.out.println("TORNO AL MOMENTO 0 DELLA CANZONE ATTUALE E FERMO LA RIPRODUZIONE");
                break;
            case PLAY:
                System.out.println("RIPRENDE LA RIPRODUZIONE");
                break;
            case PAUSA:
                System.out.println("RADIO IN PAUSA, LAMPEGGIO DEL MOMENTO SUL DISPLAY");
                break;
            case AVANTI:
                System.out.println("PROSSIMA CANZONE DELLA PLAYLIST");
                break;
            case INDIETRO:
                System.out.println("CANZONE PRECEDENTE NELLA PLAYLIST");
                break;
            case VOL_UP:
                System.out.println("ALZO IL VOLUME e STAMPO IL VALORE DEL VOLUME segui da 'db' ");
                break;
            case VOL_DOWN:
                System.out.println("ABBASSO IL VOLUME e STAMPO IL VALORE DEL VOLUME segui da 'db' ");
                break;
        }
    }
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