package it.nextre.academy.geometria.forme;

import it.nextre.academy.geometria.Punto;

public class Rettangolo {
    private double base,altezza;
    public Rettangolo(double base){
        this.base=base;
        this.altezza=base;
    }
    public Rettangolo(double base, double altezza){
        this.base=base;
        this.altezza=altezza;
    }


    public void setBase(double base){
        this.base=base;
        calcolaPerimetro();
        calcolaArea();
    }

    public void setAltezza(double altezza){
        this.altezza=altezza;
        calcolaPerimetro();
        calcolaArea();
    }


    private double perimetro;
    public void calcolaPerimetro(){
       perimetro=(base+altezza)*2;
    }
    private double area;
    public void calcolaArea(){
        area=(base+altezza)*2;
    }

    public double getArea(){
        return area;
    }
    public double getPerimetro(){
        return perimetro;
    }






    /*
    public double getArea(){return base*altezza;}
    public double getPerimetro(){return (base+altezza)*2;}
    */

    public void test() {

        int lanci = 05;
        int lanci2 = 07;
        int tiri = 0B10010;
        int quad = 0x34Fe9;

    }



}//end class
