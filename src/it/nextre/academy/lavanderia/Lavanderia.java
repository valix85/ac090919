package it.nextre.academy.lavanderia;

import it.nextre.academy.myutils.DummyData;

import java.time.LocalDateTime;
import java.util.List;

public class Lavanderia {

    public void lava(List<Capo> capi){
        for (Capo tmp : capi){
            if (!tmp.isPulito()){
                tmp.setPulito(true);
                tmp.setPrezzo(DummyData.getRandomDouble(4,3));
                tmp.setDataLavaggio(LocalDateTime.now());
            }
        }
    }

}//end class
