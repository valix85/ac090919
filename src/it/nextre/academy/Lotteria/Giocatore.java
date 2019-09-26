package it.nextre.academy.Lotteria;

public class Giocatore implements Giocante {

    private Sorteggiatore observable;
    private String nome;
    private Schedina schedina;
    private boolean vinto;

    public Giocatore(Sorteggiatore observable, String nome) {
        this.observable = observable;
        this.nome = nome;
        this.vinto=false;
        this.schedina=new Schedina();
        //System.out.println(schedina);
    }

    public Sorteggiatore getObservable() {
        return observable;
    }

    public String getNome() {
        return nome;
    }

    public boolean haVinto(){return this.vinto;}

    @Override
    public void controlla(Integer value) {
        //System.out.println("IO: "+this.nome+" CONTROLLO IL NUMERO: "+value);
        //controllare se la schedina contiene value
        if (schedina.contiene(value)){
            System.out.println("IO: "+this.nome+" HO IL NUMERO: "+value);
            if (schedina.haFattoUn6()){
                System.out.println("IO: "+this.nome+" HO FATTO 6!");
                this.vinto=true;
            }
        }
    }

    @Override
    public String toString() {
        return "Giocatore{" +
                "nome='" + nome + '\'' +
                ", vinto=" + vinto +
                // ", schedina=\n" + schedina +
                '}';
    }

    public void stampaSchedina(){
        System.out.println(schedina);
    }
}//end class
