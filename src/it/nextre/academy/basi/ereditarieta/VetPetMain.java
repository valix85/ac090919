package it.nextre.academy.basi.ereditarieta;

public class VetPetMain {
    public static void main(String[] args) {

        Animale c = new Cane();
        Animale g = new Gatto();
        Domestico d = new Gatto();
        Gatto micio = new Gatto();
        Cane fufi = new Cane();

        if (c instanceof Cane){
            ((Cane)c).abbaia();
        }

        //g=((Cane)g); //SEMPRE CONTROLLARE IL TIPO

        System.out.println("1 "+(c instanceof Cane));
        System.out.println("2 "+(c instanceof Gatto));
        System.out.println("3 "+(c instanceof Domestico));
        System.out.println("4 "+(c instanceof Animale));


    }//end main
}//end class
