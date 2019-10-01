package it.nextre.academy.designpattern.strategy.converter;

@FunctionalInterface
public interface Convertibile {

    String converti(double qta, String from, String to);

}
