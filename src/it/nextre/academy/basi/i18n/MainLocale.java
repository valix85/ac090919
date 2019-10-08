package it.nextre.academy.basi.i18n;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.ResourceBundle;

public class MainLocale {

    public static void main(String[] args) {

        //La jvm eredita dal sistema ospitate la lingua

        //imposto a runtime la lingua della JVM
        Locale.setDefault(Locale.GERMANY);

        ResourceBundle rb = ResourceBundle.getBundle("lang/traduzioni"
                , Locale.forLanguageTag("es")
                );
        System.out.println(rb.getString("home.welcome"));
        System.out.println(rb.getString("home.contacts"));

    }//end main


}//end class
