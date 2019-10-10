package it.nextre.academy.lavanderia;

import it.nextre.academy.myutils.DummyData;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

public class Lavanderia {

    public void lava(List<Capo> capi){
        Random r = new Random();
        for (Capo tmp : capi){
            //randomicamente alcuni capi non vengono puliti bene e andranno rilavati
            if (r.nextDouble()<0.25)continue;
            if (!tmp.isPulito()){
                tmp.setPulito(true);
                tmp.setPrezzo(DummyData.getRandomDouble(4,3));
                tmp.setDataLavaggio(LocalDateTime.now());
            }
        }
    }

}//end class
