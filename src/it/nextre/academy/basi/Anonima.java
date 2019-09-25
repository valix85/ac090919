package it.nextre.academy.basi;


//è un'interfaccia funzionale quindi la posso annotare con @FunctionalInterface
//@FunctionalInterface
interface Cliccabile{
    void doClick();
    //void m1();
}

abstract class Button implements Cliccabile{};

class CounterWrapper{
    private int cont=0;
    public int getCont() {
        return cont;
    }
    public void cont() {
        this.cont+=1;
    }
    @Override
    public String toString() {
        return "CounterWrapper{" +
                "cont=" + cont +
                '}';
    }
}


public class Anonima {


    String saluto = "Nextre Engineering S.R.L. ti da il benvenuto";

    public static void main(String[] args) {
        Anonima an1 = new Anonima();
        an1.begin();
    }//end main

    public void begin(){


        //vado a costruire l'interfaccia grafica...
        Button btnSave = new Button() {
            @Override
            public void doClick() {
                System.out.println("Hai cliccato salva");
            }
        };

        int n_click_btnOpen = 0;
        final CounterWrapper c_btnOpen=new CounterWrapper();
        Button btnOpen = new Button() {
            String saluto = "Ciao da Anonima";
            @Override
            public void doClick() {
                //n_click_btnOpen++;
                c_btnOpen.cont();
                System.out.println("Hai cliccato "+c_btnOpen.getCont()+"  volte i lbottone Apri");
                //attivare la finestra di scelta file
                apriFinestra();
                //System.out.println(this.saluta); //il this è della classe anonima
                System.out.println(this.saluto); //il this è della classe anonima
                System.out.println(Anonima.this.saluto); //il this è della classe anonima
                chiudiFinestra();
            }

            public void apriFinestra(){
                System.out.println("Aperta la finestra di scelta file");
            }
            public void chiudiFinestra(){
                System.out.println("Chiusa la finestra di scelta file");
            }
        };//end btnOpen



        Cliccabile btn1 = ()-> System.out.println("Ho cliccato btn1");

        final int n_click_btn2 = 0;

        Cliccabile btn2 = ()->{
            //n_click_btn2++; //deve essere final o immutabile
            System.out.println("Cliccato btn2 "+n_click_btn2+" volte");
            System.out.println(this.saluto); //il this è quello della classe in cui è dichiarata

        };

        //n_click_btn2++; //occhio a final nella dichiarazione per uso in lambda e anonime

        btn1.doClick();
        btnOpen.doClick();
        btn2.doClick();

    }


}//end class
