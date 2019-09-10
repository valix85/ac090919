/** Classe per rappresentare un punto su di un piano cartesiano bidimensionale (2D)
 * @author Valerio Radice
 * @see NextreEngineering srl
 * */
//1 PACKAGE
package it.nextre.academy.geometria;

//2 IMPORT




//3 CLASSE
public class Punto {
    //Membri/variabili/proprietà
    public double x,y;

    //Costruttori
    public Punto(){
        x = 0;
        y = 0;
    }
    public Punto(double x, double y){
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

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}//end class
