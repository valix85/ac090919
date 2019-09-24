package it.nextre.academy.basi;

public class Asserzioni {

    public static void main(String[] args) {

        //Abilitare le asserzioni con il parametro -ea della JVM

        assert (combo1(1, 1) == 1) : "caso 1 non valido";
        assert (combo1(1, 2) == 2) : "caso 2 non valido";
        assert (combo1(2, 2) == 1) : "caso 3 non valido";
        assert (combo1(2, 3) == 2) : "caso 4 non valido";
        assert (combo1(3, 3) == 1) : "caso 5 non valido";
        assert (combo1(2, 1) == -1) : "caso 6 non valido";
        assert (combo1(1, -1) == -1) : "caso 7 non valido";


    }//end main

    private static int combo1(int i, int j) {
        if (i == j) return 1;
        if (i < j) return 2;
        else return -1;
    }
}//end class
