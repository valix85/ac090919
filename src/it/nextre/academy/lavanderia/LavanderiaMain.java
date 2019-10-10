package it.nextre.academy.lavanderia;

import it.nextre.academy.myutils.DummyData;

import java.util.List;
import java.util.Set;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

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
        double totale = c1.getCapiLavatiPerPrezzo()
                .stream()
                .mapToDouble(capo->capo.getPrezzo())
                .sum();
                //.reduce(0, (left, right) -> left+right);
                //Conteggio
                //.count();
                //.reduce(0, (a,b)->a+1); //a elemento iniziale, b il prezzo, il risultato viene messo in a
        System.out.println(totale);



        //estrazione delle categorie dei capi lavati non doppie!
        List<String> catsPulite = c1.getCapiLavatiPerPrezzo()
                .stream()
                .map(capo -> capo.getCategoria().name().toLowerCase())
                /*
                .map(new Function<Capo, String>() {
                    @Override
                    public String apply(Capo capo) {
                        return capo.getCategoria().name().toLowerCase();
                    }
                })
                */
                //.peek(System.out::println)
                //.filter(cat->cat.length()>7)
                .distinct()//inutile se colleziono in un set
                .collect(Collectors.toList());

        catsPulite.forEach(MyPrinter::stampaS);
        catsPulite.forEach(el->MyPrinter.stampaS(el));

        MyPrinter myPrinter=new MyPrinter();
        catsPulite.forEach(myPrinter::stampaI);

    }//end main


}//end class

class MyPrinter{
    public static void stampaS(Object o){
        System.out.println("item Statico: " + o.toString());
    }
    public void stampaI(Object o){
        System.out.println("item Istanza: " + o.toString());
    }
}