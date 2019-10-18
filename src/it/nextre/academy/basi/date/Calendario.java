package it.nextre.academy.basi.date;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Calendario {

    public static void main(String[] args) {
/*
        Calendar cal = new GregorianCalendar(Locale.ITALY);
        System.out.println(cal.getTime().toString());
        System.out.println(cal.getFirstDayOfWeek());
        SimpleDateFormat sdf = new SimpleDateFormat("MM");
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(sdf.format(cal.getTime()));
*/
        //stampare i giorni di ottobre 2019
        System.out.println("\n"+getMonthCalendarIT(1,2019));
        System.out.println("\n"+getMonthCalendarIT(2,2019));
        System.out.println("\n"+getMonthCalendarIT(3,2019));
        System.out.println("\n"+getMonthCalendarIT(4,2019));
        System.out.println("\n"+getMonthCalendarIT(5,2019));
        System.out.println("\n"+getMonthCalendarIT(6,2019));
        System.out.println("\n"+getMonthCalendarIT(7,2019));
        System.out.println("\n"+getMonthCalendarIT(8,2019));
        System.out.println("\n"+getMonthCalendarIT(9,2019));
        System.out.println("\n"+getMonthCalendarIT(10,2019));
        System.out.println("\n"+getMonthCalendarIT(11,2019));
        System.out.println("\n"+getMonthCalendarIT(12,2019));




        /*

        System.out.println(getDayFullText(start.getTime(), Locale.ITALY));
        System.out.println(getDayShortText(start.getTime(), Locale.ITALY));

        start.add(Calendar.DATE, 1);
        System.out.println(getDayFullText(start.getTime(), Locale.ITALY));
        System.out.println(getDayShortText(start.getTime(), Locale.ITALY));

        start.add(Calendar.DATE, 1);
        System.out.println(getDayFullText(start.getTime(), Locale.ITALY));
        System.out.println(getDayShortText(start.getTime(), Locale.ITALY));
*/
    }//end main


    private static String getDayFullText(Date d, Locale l){
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE", l);
        return sdf.format(d);
    }

    private static String getDayShortText(Date d, Locale l){
        SimpleDateFormat sdf = new SimpleDateFormat("E", l);
        return sdf.format(d).substring(0,2).toUpperCase();
    }

    private static String getMonthCalendarIT(int month, int year){
        if (month<1 || month>12)return "error month 1-12";
        String out="";
        GregorianCalendar start = new GregorianCalendar(year, month-1,1);
        //Ottengo il mese in Italiano con anno
        out+=new SimpleDateFormat("MMMM", Locale.ITALY )
                .format(start.getTime()).toUpperCase()+" "+year+"\n";

        //creo intestazione di colonna
        Map<String, Integer> m = start.getDisplayNames(Calendar.DAY_OF_WEEK,Calendar.SHORT,Locale.ITALY);
        Set<String> nomiGiorni = m.keySet();
        List<String> gg = new ArrayList<>();
        m.forEach((k,v)->{
            if (v==1)v=8;
            gg.add(v+k);
        });
        for(String nomeGiorno:nomiGiorni){
            gg.add((m.get(nomeGiorno)==1?"8":m.get(nomeGiorno))+""+nomeGiorno);
        }
        gg.sort(String::compareTo);
        for (int i = 0; i < gg.size(); i++) {
            out+=gg.get(i).substring(1,3).toUpperCase()+"\t";
        }//end for
        out+="\n";
        //ciclo per i giorni
        for(int d = 0; d<=start.get(Calendar.DAY_OF_MONTH); d++){
            if (d==0){
                //devo capire da che giorno nella settimana il calendario deve iniziare
                //DAY_OF_WEEK da 1 a 7 dove 1 è domenica
                if (start.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                    out+="\t".repeat(6);
                else
                    out+="\t".repeat(start.get(Calendar.DAY_OF_WEEK)-2);
            }
            out+=start.get(Calendar.DAY_OF_MONTH)+"\t";
            if (start.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY){
                out+="\n";
            }
            start.add(Calendar.DATE,1);
        }
        return out;
    }

}//end class
