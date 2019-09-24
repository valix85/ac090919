package it.nextre.academy;

import it.nextre.academy.myutils.DummyData;

public class DummyMain {

    public static void main(String[] args) {

        Urna<String> u = new Urna();
        u.put(DummyData.getName());
        u.put(DummyData.getName());
        u.put(DummyData.getName());
        u.put(DummyData.getName());
        u.put(DummyData.getName());
        System.out.println(u);

        System.out.println(u.fetch());
        System.out.println(u);

        System.out.println(u.fetch());
        System.out.println(u);

        System.out.println(u.fetch());
        System.out.println(u);

        System.out.println(u.fetch());
        System.out.println(u);

        System.out.println(u.fetch());
        System.out.println(u);

        System.out.println(u.fetch());
        System.out.println(u);



    }//end main


}//end class
