package it.nextre.academy.basi.thread;

import it.nextre.academy.myutils.MyInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainThread {

    private static int cont = 0;
    private static int contComplete = 0;

    public static synchronized int getnext() {
        return cont++;
    }
    public static synchronized int getComplete() {
        return contComplete++;
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

//        String hostName = "216.58.205.100";
//        hostName = "google.com";
//        hostName = "localhost";
//        int portNumber = 80;
//        Socket echoSocket = new Socket(hostName, portNumber);
//
//        //Scrive sulla Socket
//        PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
//        //legge dalla Socket
//        BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
//
//        //echoSocket.getKeepAlive();
//
//        //GET /nomeRisorsa HTTP/1.1
//        out.println("GET /phpinfo.php HTTP/1.1");
//        //out.println("Host: google.com");
//        out.println("Host: localhost");
//        //out.println("Request URL: phpinfo.php");
//        //out.println("path: http://localhost/phpinfo.php");
//        String txt = "";
//        System.out.println("extra header, doppio invio per fermare");
//        while ( (txt=MyInput.leggiRiga()).length()>0){
//            out.println(txt);
//        }
//        out.println("\n");
//
//        String output="";
//        while((output=in.readLine())!=null ){
//            System.out.println(output);
//            //System.out.println(output.length());
//        }
//        //in.lines().forEach(System.out::println);
//
//        echoSocket.close();
//        in.close();
//        out.close();
//        System.out.println("chiuso tutto");





/*
        Thread[] tasks = new Thread[5000];
        for(int i = 0; i<tasks.length;i++){
            tasks[i]=new Thread(new Task());
        }
        for(int i = 0; i<tasks.length;i++){
            tasks[i].start();
        }
*/
        ExecutorService ex = Executors.newFixedThreadPool(3000);
        //ex.execute(new Task());
        for (int i = 0; i < 10_000; i++) {
            ex.submit(new Task());
            //ex.execute(Task::new);
        }//end for

        System.out.println("a");
        /*
        try {

            ex.awaitTermination(5, TimeUnit.SECONDS);
            ex.shutdown();
            ex.awaitTermination(2, TimeUnit.SECONDS);
            System.out.println("b");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            if (!ex.isTerminated()){
                System.out.println("forzo l'interruzione");
                ex.shutdownNow();
            }
        }*/
        System.out.println("c");
        ex.shutdown();

        while(!ex.isTerminated()){
            try {
                ex.awaitTermination(30000, TimeUnit.MILLISECONDS);
                System.out.println("...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        ex.shutdown();



    }//end main

}//end class


class Task implements Runnable {
    @Override
    public void run() {
        //System.out.println("Task Running...");
        String hostName = "krunker.io";
        int portNumber = 80;
        try (Socket echoSocket = new Socket(hostName, portNumber);
             //Scrive sulla Socket
             PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
             //legge dalla Socket
             BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
             ) {


            //echoSocket.getKeepAlive();
            //GET /nomeRisorsa HTTP/1.1
            out.println("GET /?game=FRA:qi7dy HTTP/1.1\n");
            //out.println("Host: localhost");
//            String txt = "";
//            System.out.println("extra header, doppio invio per fermare");
//            while ((txt = MyInput.leggiRiga()).length() > 0) {
//                out.println(txt);
//            }


            //Random r = new Random();
            //Thread.sleep(1000 + r.nextInt(3000));

            //out.println("\n"); //<- NON FATTA PER RESTARE IN ATTESA!!!


            String output = "";
            while ((output = in.readLine()) != null) {
                System.out.println(output);                     }


            //echoSocket.close();
            //in.close();
            //out.close();
            //System.out.println("chiuso tutto");

            System.out.println("TEST: "+ MainThread.getComplete()+"OK");
        } catch (IOException e) {
            System.out.println("Errore numero: " + MainThread.getnext());
            //e.printStackTrace();
            System.out.println(e.getMessage());
            System.exit(500);
        } catch (RuntimeException e) {
            System.out.println("Errore Interrupt numero: " + MainThread.getnext());
        }


        //System.out.println("task end");
    }
}