package it.nextre.academy.props;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class MainProps {

    public static void main(String[] args) {
        Properties props = System.getProperties();
        //Set<Object> keys = props.keySet();
        var keys = props.keySet();
        /*
        for(Object key : keys){
            System.out.println(key+" -> "+props.get(key));
            System.out.println(key+" -> "+props.getProperty(key.toString()));
            System.out.println(key+" -> "+props.getProperty(key.toString(),"aaa"));
        }*/

        String key = "java.vendor1";
        System.out.println(key+" -> "+props.get(key));
        System.out.println(key+" -> "+props.getProperty(key.toString()));
        System.out.println(key+" -> "+props.getProperty(key.toString(),"aaa"));
        System.out.println(key+" -> "+props.getOrDefault(key,"bbb"));


        //Custom properties
        System.out.println("\n".repeat(15));

        File preferenze = new File("./preferenze.properties");
        Properties customProps = new Properties();

        if (!preferenze.exists())
            try {
                preferenze.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }


        try(Reader reader = new FileReader(preferenze)) {
            customProps.load(reader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println(customProps.get("pippo"));

        customProps.setProperty("macchina","true");
        customProps.put("pausa",Boolean.FALSE.toString());

        try(Writer fw = new FileWriter(preferenze)){
            customProps.store(fw,"commento");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }//end main

}//end class
