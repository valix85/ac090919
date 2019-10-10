package it.nextre.academy.basi.stream;

import it.nextre.academy.basi.eccezioni.Dado;

import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainDado {
    static Integer i=1;
    public static void main(String[] args) {


        IntStream dadoStream = IntStream.generate(() -> new Dado(true).getFaccia());
        dadoStream
                .boxed()
                .distinct()
                .peek(System.out::println)
                .limit(6)
                .collect(Collectors.toSet());

        System.out.println("---------------------");










        Supplier<Integer> dadoSupplier = () -> new Dado(true).getFaccia();
        AtomicInteger k= new AtomicInteger();
        Supplier<Integer> pariSupplier = () -> k.addAndGet(2);
        Supplier<Integer> dispariSupplier = () -> i+=2;
        Set<Integer> lanci = Stream
                //.generate(dadoSupplier)
                //.generate(pariSupplier)
                .generate(dispariSupplier)
                .distinct()
                .peek(System.out::println)
                .limit(6)
                .collect(Collectors.toSet());

        System.out.println("Stampo il set");
        System.out.println(lanci);

    }//end main

}//end class
