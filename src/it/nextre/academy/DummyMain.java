package it.nextre.academy;

import it.nextre.academy.myutils.DummyData;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DummyMain {

    public static void main(String[] args) {
/*
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
*/


        System.out.println(stray(new int[]{2,3,3,3,3,3}));



    }//end main



    static int stray(int[] numbers) {
        int a=-1, b=-1;
        int k=0, j=0;
        a=numbers[0];
        k++;
        for (int i = 1; i<numbers.length; i++){
            if (numbers[i]==a){
                k++;
            }else{
                b=numbers[i];
                j++;
            }
        }
        if (k==1){return a;}
        if (j==1){return b;}
        return -1;
    }


}//end class


class Linea{}