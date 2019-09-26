package it.nextre.academy.Lotteria;

import java.util.ArrayList;
import java.util.List;

public class Schedina {

    private List<Riga> righe;
    private boolean vincente;

    public Schedina() {
        this.righe = new ArrayList<>();
        vincente=false;
        for (int i = 0; i < LotteriaMain.N_RIGHE_SCHEDINA; i++) {
            righe.add(new Riga());
        }//end for
    }

    public boolean contiene(Integer numero){
        boolean presente = false;
        for(Riga r: righe){
            if (r.contiene(numero)){
                presente = true;
            }
        }
        return presente;
    }

    @Override
    public String toString() {
        String tmp = "";
        for (Riga r : righe){
            tmp+=r+"\n";
        }
        return tmp;
    }

    public boolean haFattoUnaRigaPiena() {
        for(Riga r : righe){
            if (r.isVincente()){
                System.out.println("Una Riga Ha Fatto 6");
                return true;
            }
        }
        return false;
    }
}//end class
