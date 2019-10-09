package it.nextre.academy.lavanderia;

import it.nextre.academy.myutils.DummyData;

public class LavanderiaMain {

    /*
    * Gestire una lavanderia e in particolare suddividere i capi per ogni cliente.
    * Ogni capo avrà una categoria (maglione camicia polo pantalone jeans), un colore (nero rosso azzurro ecc...), un materiale (lana, cotone, acrilico, lino e seta, ecc...), pulito (si/no), un prezzo di lavorazione, data e ora di lavaggio
    * ordinare i capi per categoria, colore e materiale, estrarre un capo dalla cesta e lavarlo
    * */

    public static void main(String[] args) {

        Cliente c1 = new Cliente(DummyData.getName(), DummyData.getSurname());
        //Cliente c2 = new Cliente(DummyData.getName(), DummyData.getSurname());

        //simulo i capi di un cliente
        for (int i = 0; i < 10; i++) {
            Capo tmp = new Capo();
            //System.out.println(tmp);
            c1.portaALavare(tmp);
        }//end for


        //la lavanderia dovrà lavare la lista dei capi
        Lavanderia lavello = new Lavanderia();
        lavello.lava(c1.getCesta());

        System.out.println("Lavaggio finito");

        //stampare in ordine di prezzo i capi lavati
        c1.getCapiLavatiPerPrezzo().forEach(System.out::println);


    }//end main


}//end class
