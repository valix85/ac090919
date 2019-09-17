package it.nextre.academy.myutils;

public class ListaS {

    private String mem[];

    public ListaS(){
        mem=new String[0];
    }

    public void add(String str){
        String[] tmp = new String[mem.length + 1];
        for (int i = 0; i < mem.length; i++) {
            tmp[i]=mem[i];
        }//end for
        tmp[tmp.length-1]=str;
        mem = tmp;
    }

    public boolean contains(String str){
        for (int i = 0; i < mem.length; i++) {
           if (mem[i].equals(str))
               return true;
        }//end for
        return false;
    }

    public void clear() {
        mem=new String[0];
    }

    public int size(){
        return mem.length;
    }

    //todo get(int pos)
    //todo remove(int pos)
    //todo remove(String str)

}//end class
