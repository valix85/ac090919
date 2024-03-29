package it.nextre.academy.lotteria;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * La riga non può contenere doppioni
 * conteggerà i numeri estratti se presenti in essa
 * */

public class Riga {

    private int estratti;
    private List<Integer> numeri;

    public Riga() {
        estratti=0;
        numeri=new ArrayList<>();
        Random r = new Random();
        int tmp;
        while(numeri.size()< LotteriaMain.N_NUMERI_RIGA){
            tmp = r.nextInt(90)+1;
            if (!numeri.contains(tmp))
                numeri.add(tmp);
        }
    }

    public boolean contiene(Integer valore){
        if (numeri.contains(valore)){
            System.out.println("*** La riga contiene: "+ valore+" ***");
            estratti++;
            return true;
        }
        System.out.println("La riga non contiene: "+ valore);
        return false;
    }

    public int getPresenti() {
        return estratti;
    }

    @Override
    public String toString() {
        String tmp="";
        for(Integer num : numeri)
            tmp += String.format("% 3d ", num);
        tmp += " ["+estratti+"]";
        return tmp;
    }

    public boolean isVincente() {
        return estratti==LotteriaMain.N_NUMERI_RIGA;
    }
}//end class
