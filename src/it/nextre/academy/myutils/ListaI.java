package it.nextre.academy.myutils;

public class ListaI {

    int mem[];

    public ListaI(){
        mem=new int[0];
    }

    public void add(int n){
        int[] tmp = new int[mem.length + 1];
        for (int i = 0; i < mem.length; i++) {
            tmp[i]=mem[i];
        }//end for
        tmp[tmp.length-1]=n;
        mem = tmp;
    }

    public boolean contains(int num){
        for (int i = 0; i < mem.length; i++) {
           if (mem[i]==num)
               return true;
        }//end for
        return false;
    }

    public void clear() {
        mem=new int[0];
    }
}//end class
