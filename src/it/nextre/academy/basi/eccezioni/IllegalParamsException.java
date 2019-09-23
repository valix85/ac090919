package it.nextre.academy.basi.eccezioni;

//RuntimeException = UNchecked
//Exception o ogni sua altra figlia, tranne RuntimeException = CHECKED!

public class IllegalParamsException extends RuntimeException {
    public IllegalParamsException(String msg){
        super(msg);
    }
    public IllegalParamsException(){
        super("Parametro/i non valido/i");
    }



}//end class
