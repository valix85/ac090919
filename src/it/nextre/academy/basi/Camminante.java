package it.nextre.academy.basi;

public interface Camminante {

    public abstract void cammina();
    //final void cammina1(); no final e abstract
    //static void cammina2(){};
    //default void cammina3(){};
    //default void cammina4(){};
    //private void cammina5(){};
    //private static void cammina6(){};
    //public static final int k = 8;
    void ferma();

    static String password = "parolaSegretaCamminante";

}//end class
