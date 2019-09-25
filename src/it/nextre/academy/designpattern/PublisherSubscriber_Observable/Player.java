package it.nextre.academy.designpattern.PublisherSubscriber_Observable;

public class Player implements ObserverInterface {

    private String nome;
    private Integer numVincente;
    private boolean haVinto;
    private boolean inGioco;

    public Player(String nome, Integer numVincente) {
        this.nome = nome;
        this.numVincente = numVincente;
        this.inGioco=true;
    }

    public boolean haVinto() {
        return haVinto;
    }

    public boolean inGioco() {
        return inGioco;
    }

    public void setInGioco(boolean inGioco) {
        this.inGioco = inGioco;
    }

    @Override
    public Boolean doAction(Object numero) {
        if (numero instanceof Integer){
            numero = (Integer)numero;
            if (inGioco==true && this.numVincente==numero){
                System.out.println(this.nome + " con il numero: " + numero);
                haVinto=true;

                return true;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nome='" + nome + '\'' +
                '}';
    }
}//end class
