package it.nextre.academy.basi.thread;

import it.nextre.academy.myutils.MyInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Random;

public class MainThread {

    private static int cont=0;
    public static synchronized int getnext(){
        return cont++;
    }


    public static void main(String[] args) throws IOException {


/*
        Runnable task = new Runnable() {
            @Override
            public void run() {
                int pos = MainThread.getnext();
                System.out.println(pos + " Inizio...");
                Random r = new Random();
                Runtime runner = Runtime.getRuntime();
                try {
                    Thread.sleep(1000+r.nextInt(3000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                try {
                    //runner.exec("C:\\Programmi Portable\\nc\\nc.exe www.google.com 80");
                    //runner.exec("C:\\Windows\\System32\\cmd.exe");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("...fine di " + pos);
            }
        };

        Thread[] tasks = new Thread[0];
        for(int i = 0; i<tasks.length;i++){
            tasks[i]=new Thread(task);
        }


        for(int i = 0; i<tasks.length;i++){
            tasks[i].start();
        }


        Runtime runner = Runtime.getRuntime();
        try {
            //runner.exec("C:\\Programmi Portable\\nc\\nc.exe www.google.com 80");
            //runner.load("C:\\Windows\\System32\\cmd.exe");
        } catch (Exception e) {
            e.printStackTrace();
        }


        //Runtime.getRuntime().exec(new String[] {"cmd", "/K", "Start", ""});

*/

        String hostName = "216.58.205.100";
        hostName = "google.com";
        hostName = "localhost";
        //hostName = "192.168.10.222";
        int portNumber = 80;
        Socket echoSocket = new Socket(hostName, portNumber);

        //Scrive sulla Socket
        PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
        //legge dalla Socket
        BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));

        //echoSocket.getKeepAlive();

        out.println("GET / HTTP/1.1");
        //out.println("Host: google.com");
        String txt = "";
        System.out.println("extra header, doppio invio per fermare");
        while ( (txt=MyInput.leggiRiga()).length()>0){
            out.println(txt);
        }
        out.println("\n");

        String output="";
        while((output=in.readLine())!=null ){
            System.out.println(output);
            System.out.println(output.length());
        }
        //in.lines().forEach(System.out::println);

        echoSocket.close();
        in.close();
        out.close();
        System.out.println("chiuso tutto");















    }//end main

}//end class
