package it.nextre.academy.basi;

public class Primitivi {

    public static void main(String[] args) {


        byte b = 3 + 2;
        byte b2 = 1;
        //System.out.println(b);
        b = 126;
        b = (byte)(b+1);
        int ris = (b+b2);
        System.out.println(ris);
        int x1 = 4;
        long l1 = 5647284321L;
        float f1 = 4.5f;
        float ris2;
        ris2 = x1*f1;

        double f3 = 1.5e-3; //1.5*1000;

        int x3 = Integer.MAX_VALUE +1 ;
        System.out.println("x3: "+x3);

        System.out.println(5/2*2);
        System.out.println(5/2*2.0);
        System.out.println(5/2.0*2);
        System.out.println((double)(5.0/2)*2);


        final int x5 = (byte)130;
        System.out.println("x5: "+x5);
        //x5=131;

        long cc = 0b1011_0100_1011_1101_0100_1001_1001L;
        double d3 = 3.1415e150;

        String s1 = "1234456789101112134";
        String s2 = new String("1234456789101112134");

        int iv = 4;
        Integer iw = 4;


        long lv = 4;
        Long lw = 4L;

        boolean b1 = true;
        boolean b20 = false;
        String booltxt = "true";
        Boolean b21 =
                Boolean.parseBoolean(" TruE ".trim());
        System.out.println(b21);

        if (Boolean.toString(b21).equals(booltxt) )
            System.out.println("BOOOM BABY");

        String sesso;
        if(b21)
            sesso="Maschio";
        else
            sesso="Femmina";
        System.out.println(sesso);

        System.out.println(b21?"Maschio":b21==false?"Femmina":"");

        char c1 = 65;
        char c2 = 'B';
        char c3 = '\u0000';
        char c4 = '\u0131';
        char c5 = '\'';
        System.out.println(c1+1);
        System.out.println((char)(c1+1));
        System.out.println(c1+c2);
        System.out.println((char)(c1+c2)+"â"+"ƒ"+" "+c4+" "+c3);

        System.out.println("testo a \n\t\\\"capo");

    }//end main

}//end class
