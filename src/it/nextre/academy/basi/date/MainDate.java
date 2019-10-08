package it.nextre.academy.basi.date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class MainDate {

    public static void main(String[] args) {
        // it-IT   lang minuscola, country MAIUSCOLA
        Locale it = Locale.ITALY; //lang - country
        Locale ita = Locale.ITALIAN; //lang

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        DateTimeFormatter dtfCanada = DateTimeFormatter.ofPattern("HH:mm MMM", Locale.CANADA);
        DateTimeFormatter dtfItaly = DateTimeFormatter.ofPattern("HH:mm MMM", Locale.ITALY);
        System.out.println(ldt.format(dtfCanada));
        System.out.println(ldt.format(dtfItaly));
        System.out.println("-----------------------");
        System.out.println(ldt.format(DateTimeFormatter.ISO_LOCAL_DATE));


        ZonedDateTime zdtI = ZonedDateTime.of(ldt, ZoneId.of("Europe/Berlin"));
        ZonedDateTime zdtJ = ZonedDateTime.of(ldt,ZoneId.of("Asia/Tokyo"));
        System.out.println(zdtI.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
        System.out.println(zdtJ.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
        System.out.println(zdtI.withZoneSameLocal(zdtJ.getZone()));
        System.out.println(zdtI.until(zdtJ, ChronoUnit.MILLIS));
        System.out.println(zdtI.getOffset());
        System.out.println(zdtI.getOffset().getId());
        System.out.println(zdtI.getOffset().getTotalSeconds());


        for (String zone : ZoneId.getAvailableZoneIds()){
            //System.out.println(zone);
        }


        System.out.println(Instant.EPOCH); //tempo 0 dei computer 1 gen 1970 00:00:00

        LocalDate natale = LocalDate.of(Year.now().getValue(),12, 25);
        LocalDateTime nataleT = LocalDateTime.of(Year.now().getValue(),12, 25,0,0,0);

        System.out.println(ldt.toLocalDate().until(natale, ChronoUnit.DAYS));

        System.out.println(Duration.between(ldt, nataleT).toDays());

    }//end main

}//end class
