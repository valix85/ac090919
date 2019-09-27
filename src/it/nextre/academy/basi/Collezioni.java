package it.nextre.academy.basi;

import it.nextre.academy.myutils.DummyData;
import it.nextre.academy.myutils.MySupport;

import java.util.*;

public class Collezioni {
    public static void main(String[] args) {

        /*
        LinkedList<String> nomi = new LinkedList<>();
        Deque<String> dek = nomi;

        nomi.poll(); // no eccez torna null, prende e toglie dalla testa
        nomi.peek(); // no eccez torna null, prende ma non toglie dalla testa
        nomi.pop();  // SI eccez torna null, prende e toglie dalla testa
        nomi.remove(); // alias di pop
        nomi.offer(""); //inserisce in coda
        */


        List<Umano> popolazione = new LinkedList<>();

        popolazione.add(Umano.getRandomUmano());
        popolazione.add(Umano.getRandomUmano());
        popolazione.add(Umano.getRandomUmano());
        popolazione.add(Umano.getRandomUmano());
        popolazione.add(Umano.getRandomUmano());
        popolazione.add(Umano.getRandomUmano());
        popolazione.add(Umano.getRandomUmano());
        popolazione.add(Umano.getRandomUmano());
        popolazione.add(Umano.getRandomUmano());
        popolazione.add(Umano.getRandomUmano());
        popolazione.add(Umano.getRandomUmano());
        popolazione.add(Umano.getRandomUmano());
        popolazione.add(Umano.getRandomUmano());
        popolazione.add(Umano.getRandomUmano());
        popolazione.add(Umano.getRandomUmano());

        //System.out.println(popolazione);
        //System.out.println("ordino...");

        Comparator<Umano> compEta = new Comparator<Umano>() {
            @Override
            public int compare(Umano u1, Umano u2) {
                /*
                if (u1.getEta()>u2.getEta()){
                    return 1;
                }else if(u1.getEta()<u2.getEta()){
                    return -1;
                }else{
                    return 0;
                }
                */
                return u1.getEta() - u2.getEta();
            }
        };
        //popolazione.sort(compEta);
        //popolazione.sort((Umano u1, Umano u2)->u1.getEta()-u2.getEta() );
        //popolazione.sort(Comparator.comparingInt(Umano::getEta));
        //popolazione.sort(Comparator.comparingInt((Umano u)->u.getNome().length()));

        /*
        popolazione.sort((Umano u1, Umano u2)->{
            if(u1.getNome().length()-u2.getNome().length()==0){
                return u1.getNome().compareTo(u2.getNome());
            }else{
                return u1.getNome().length()-u2.getNome().length();
            }
        } );
        System.out.println(popolazione);
*/

        //Umano[] umans = (Umano[])popolazione.toArray();
        Umano[] umans2 = new Umano[popolazione.size()];
        popolazione.toArray(umans2);
        //System.out.println(popolazione);
        System.out.println(Arrays.toString(umans2));
        System.out.println("--------------------------");
        Arrays.sort(umans2); //Usa il comparable
        System.out.println(Arrays.toString(umans2));
        System.out.println("--------------------------");

        Arrays.sort(umans2, umans2[0]); //Usa il comparator
        System.out.println(Arrays.toString(umans2));

        System.out.println("--------------------------");
        Arrays.sort(umans2, Umano::compareTo); //Usa il comparator
        System.out.println(Arrays.toString(umans2));

        System.out.println("--------------------------");
        Arrays.sort(umans2, UmanoComparator.etaComparator); //Usa il comparator
        System.out.println(Arrays.toString(umans2));


        System.out.println("--------------------------");
        Arrays.sort(umans2, UmanoComparator.pesoComparator); //Usa il comparator
        System.out.println(Arrays.toString(umans2));


    }//end main





}//end class




