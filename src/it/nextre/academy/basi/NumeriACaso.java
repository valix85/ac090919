package it.nextre.academy.basi;

import java.util.Random;

public class NumeriACaso {
    public static void main(String[] args) {

        Random r = new Random();
        System.out.println(1+r.nextInt(10));

        int x = 1+(int)(Math.random()*10);
        System.out.println(x);

        test:do {
            x = 1+(int)(Math.random()*10);
            System.out.println(x);
            if (x==5)break test;
        }while (x<=10 || x>=1);

    }//end main
}//end class
