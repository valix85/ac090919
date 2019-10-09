package it.nextre.academy.basi.stream;

import it.nextre.academy.myutils.DummyData;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainStream {

    public static void main(String[] args) {

        List<String> nomi = new ArrayList<>();

        nomi.add(DummyData.getName());
        nomi.add(DummyData.getName());
        nomi.add(DummyData.getName());
        nomi.add(DummyData.getName());
        nomi.add(DummyData.getName());

        System.out.println(nomi);


        nomi.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.toLowerCase());
            }
        });
        System.out.println("###########################");
        nomi.forEach(s->System.out.println(s));
        System.out.println("###########################");
        nomi.forEach(System.out::println);
        System.out.println("###########################");
        nomi.forEach((s)->{
            s="Nome: "+s;
            System.out.println(s);
            return;
        });

        System.out.println("###########################");
        System.out.println("###########################");
        System.out.println("###########################");
        System.out.println("###########################");
        System.out.println("###########################");
        System.out.println("###########################");



        long conteggio = nomi.stream()
                .peek(item-> System.out.println("peek Prima del filtro: "+item))
                .filter(s -> s.length()>5)
                .peek(item-> System.out.println("peek dopo del filtro: "+item))
                //.forEach(System.out::println);
                .count();
        System.out.println("Nomi ok "+conteggio);

        Stream<String> streamString = nomi.stream();
        streamString.forEach(s-> System.out.println(s));
        //streamString.forEach(s-> System.out.println(s)); //1 stream si usa una sola volta !!!

        //voglio salvare i risultati del filtraggio in una nuova lista
        int k =0;
        List<String> nomiFiltrati1 = nomi.stream()
                .filter(s -> s.length()>5)
                //.peek(s->{k++;}) //non posso MODIFICARE I DATI!
                .collect(Collectors.toList());
        System.out.println("### nomi filtrati: "+nomiFiltrati1.size());
        nomiFiltrati1.forEach(System.out::println);


        Random r = new Random();
        /*
        IntStream ints = IntStream.generate(new IntSupplier() {
            @Override
            public int getAsInt() {
                return r.nextInt();
            }
        });
        */
        //IntStream ints = IntStream.generate(()->r.nextInt());
        IntStream ints = IntStream.generate(r::nextInt);

        //ints.forEach(System.out::println); //Infinite stream
        ints
                //.peek(num->System.out.println(num))
                .filter(n->(n>0&&n<15000))
                .limit(1)
                .forEach(System.out::println);


        System.out.println("*** temperature rilevate ***");
        List<Integer> temperature = getRandomList(18,22,10);
        temperature.forEach(System.out::println);
        double avg = temperature.stream()
                .mapToInt(t->t) //entra Integer, esce int
                .average()
                .getAsDouble();
        System.out.println(avg);

    }//end main



    public static IntStream getRandomIntStream(int from, int to){
        return IntStream.generate(new IntSupplier() {
            @Override
            public int getAsInt() {
                Random r = new Random();
                return from+r.nextInt(to-from)+1;
            }
        });
    }

    public static Integer getRandom(int from, int to){
        return getRandomIntStream(from,to)
                .findFirst()
                .getAsInt();
    }

    public static List<Integer> getRandomList(int from, int to, long qta){
        return getRandomIntStream(from,to)
                .limit(qta)
                .boxed() //converte da OggettoStream ad StreamDiOggetti
                .collect(Collectors.toList());
    }

}//end class
