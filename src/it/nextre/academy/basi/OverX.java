package it.nextre.academy.basi;

public class OverX {

    @Override
    public String toString() {
        return super.toString(); //richiamo al metodo toString di Object
    }

    public int somma(int ...a){
        System.out.println("somma ...int varargs");
        int tot = 0;
        for (int i = 0; i < a.length; i++) {
            tot+=a[i];
        }//end for
        return tot;
    };


    public int somma(int a, int b){
        System.out.println("somma int int");
        return a+b;
    }

    public long somma(long a, long b){
        System.out.println("somma long long");
        return a+b;
    }

    public float somma(float a, float b){
        System.out.println("somma float float");
        return a+b;
    }

    public double somma(double a, double b){
        System.out.println("somma double double");
        return a+b;
    }


    public static void main(String[] args) {
        OverX tmp = new OverX();
        System.out.println(tmp.somma(100L,5.0f));
        System.out.println(tmp.somma(3,4,5,6,7,8,9));

    }//end main



}//end class
