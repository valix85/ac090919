package it.nextre.academy.basi;

public class Box<T> {

    private T value;

    public Box(T param){
        this.value=param;
    }

    public T getValue(){
        return value;
    }

}//end class
