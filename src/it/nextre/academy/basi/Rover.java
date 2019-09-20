package it.nextre.academy.basi;

class Robot{
    public String password = "robot1";
}

public class Rover extends Robot implements Camminante {

    @Override
    public void cammina() {
        System.out.println("ATTENZIONE: Rover in movimento");
    }

    @Override
    public void ferma() {
        System.out.println("IL ROVER SI è FERMATO!");
    }

    public void analizzaAtmosfera(){}
    public void scattaFoto(){}
    public void apriVeleSolari(){}
    public void ChiudiVeleSolari(){}

}//end class
