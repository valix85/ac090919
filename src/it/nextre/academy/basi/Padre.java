package it.nextre.academy.basi;

public class Padre {

    private static class Innestata{}
    private class Interna{
        int k=0;
        @Override
        public String toString() {
            return "Son classe figlia";
        }
    }

    private abstract class Demo{}
    private class testDemo extends Demo{};
    //classe anonima
    private Demo d1 = new Demo() {  };

    @Override
    public String toString() {
        //non posso usare modificatori di visibilità a livello locale
        class locale{
            @Override
            public String toString() {
                return "son classe locale al metodo toString di Padre";
            }
        }
        return "Son classe Padre, ho una locale: \n\t"+new locale().toString();
    }
}//end class
