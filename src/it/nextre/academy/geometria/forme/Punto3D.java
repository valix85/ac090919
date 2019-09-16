package it.nextre.academy.geometria.forme;

import it.nextre.academy.geometria.Punto;

public class Punto3D extends Punto {

    protected double z;

    public Punto3D(){
        super.x=0;
        super.y=0;
        this.z=0;
    }
    public Punto3D (double xyz){
        super(xyz);
        this.z=xyz;
    }
    public Punto3D(double x, double y, double z){
        super(x,y);
        this.z=z;
    }

}//end class
