/** Classe per rappresentare un punto su di un piano cartesiano bidimensionale (2D)
 * @author Valerio Radice
 * @see NextreEngineering srl
 * */
//1 PACKAGE
package it.nextre.academy.geometria;

//2 IMPORT


import it.nextre.academy.geometria.forme.Punto3D;

import java.util.Objects;

//3 CLASSE
public class Punto {




    //Membri/variabili/proprietà
    public double x,y;
    {
        System.out.println("Inizializzatore di istanza Punto");
    }
    static {
        System.out.println("Inizializzatore di classe Punto");
    }

    //Costruttori
    public Punto(){
        //super();
        //x = 0;
        //y = 0;
        this(0,0);
    }
    public Punto(double xy){
        //super();
        this(xy,xy);
    }
    public Punto(double x, double y){
        super();
        this.x=x;
        this.y=y;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null)return false;
        if (!(obj instanceof Punto))return false;
        Punto tmp = (Punto)obj;
        //System.out.println("controllo le ccords");
        return this.x==tmp.x && this.y==tmp.y;
    }

    //di istanza
    //farò il quadrato di me stesso (this)
    public Punto alQuadrato(){
        return new Punto(this.x*this.x, this.y*this.y );
    }

    //di classe
    //dato un punto tornerò il suo quadrato (static)
    public static Punto alQuadrato(Punto p){
        return new Punto(p.x*p.x, p.y*p.y );
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}//end class
