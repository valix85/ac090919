package it.nextre.academy.designpattern.PublisherSubscriber_Observable;

public class Player implements ObserverInterface {

    private String nome;
    private Integer numVincente;

    public Player(String nome, Integer numVincente) {
        this.nome = nome;
        this.numVincente = numVincente;
    }

    @Override
    public void doAction(Integer numero) {
        if (this.numVincente==numero){
            System.out.println(this.nome + " con il numero: " + numero);
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "nome='" + nome + '\'' +
                '}';
    }
}//end class
