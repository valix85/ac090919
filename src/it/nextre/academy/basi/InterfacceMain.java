package it.nextre.academy.basi;

public class InterfacceMain {

    public static void main(String[] args) {
        Rover mars1 = new Rover();
        mars1.cammina();
        mars1.ferma();

        Camminante camm = mars1;
        camm.cammina();
        camm.ferma();
        System.out.println(camm.password);
        System.out.println(
                ((Robot)mars1).password);
        //System.out.println(mars1.password); //password è ambiguo


    }//end main
}//end class
