package it.nextre.academy.basi.date;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;
import java.util.Date;

public class Formattatore {

    public static void main(String[] args) {



        LocalTime time = LocalTime.parse("123850", DateTimeFormatter.ofPattern("A")); //milli-of-day	number
        time = LocalTime.ofNanoOfDay(123850L*1000*1000);
        System.out.println(time);
        time = time.plus(83018, ChronoUnit.MILLIS);
        System.out.println(time);
        time = time.minus(83018, ChronoUnit.MILLIS);
        System.out.println(time);

        Duration d1 = Duration.of(time.toNanoOfDay(), ChronoUnit.NANOS);
        System.out.println(d1);
        System.out.println(
                DateTimeFormatter
                        .ofPattern("HH:mm:ss:SSS")
                        .format( LocalTime.ofNanoOfDay(d1.toNanos()) )
        );



    }//end main
}//end class
