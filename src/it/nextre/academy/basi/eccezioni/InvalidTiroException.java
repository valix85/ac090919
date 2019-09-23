package it.nextre.academy.basi.eccezioni;

public class InvalidTiroException extends Exception{
    public InvalidTiroException(){
        this("Tiro non valido");
    }
    public InvalidTiroException(String msg){
        super(msg);
    }
}//end class
