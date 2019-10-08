package it.nextre.academy.network;

import it.nextre.academy.myutils.DummyData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class MyPing {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 20; i++) {
            ping("mail.google.com");
            Thread.sleep(2000);  //passare offline
        }//end for
        portScan("127.0.0.1",130,135);
        checkPort("127.0.0.1",3306);

    }

    private static boolean ping(String ipAddress){
        try {
            InetAddress inet = InetAddress.getByName(ipAddress);
            System.out.print("Sending Ping Request to " + ipAddress+" ... ");
            long start = System.currentTimeMillis();
            if (inet.isReachable(2000)) {
                long end = System.currentTimeMillis();
                System.out.print(ipAddress + " is reachable in "+(end-start)+"ms.\n");
                return true;
            } else {
                System.out.print(ipAddress + " NOT reachable.\n");
            }
        } catch (Exception e) {
            System.out.println("\nException:" + e.getMessage());
        }
        return false;
    }

    public static List<Integer> portScan(String ipAddress, int from, int to ){
        if (from<=0){
            System.err.println("Port from is invalid (>=1)");
            return null;
        }
        if (to>65536){
            System.err.println("Port to is invalid (<=65536)");
            return null;
        }
        if (from>to){
            System.err.println("Port to is lower than from");
            return null;
        }
        List<Integer> openPort = new ArrayList<>();
        for (int port = from; port <= to; port++) {
            try {
                Socket socket = new Socket();
                socket.connect(new InetSocketAddress(ipAddress, port), 100);
                socket.close();
                System.out.println("Port " + port + " is OPEN !!!");
                openPort.add(port);
            } catch (Exception ex) {
                //System.out.println("Port " + port + " is CLOSE");
            }
        }
        return openPort;
    }

    public static void checkPort(String ipAddress, int port){
        if (port<=0 || port>65536){
            System.err.println("Port param is invalid (>=1 && <=65536) ");
            return;
        }
        try (
                Socket socket = new Socket(ipAddress,port);
                //Socket echoSocket = ssf.createSocket(hostName, portNumber);
                //Scrive sulla Socket
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                //legge dalla Socket
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        ) {
            //socket.connect(new InetSocketAddress(ipAddress, port), 1000);
            //out.write("CONNECT");
            //out.write("\n\n\n");
//            while(true){
//                out.println("X-test: "+ DummyData.getPassword(12));
//                if (false)break;
//            }
            String output = "";
            while ((output = in.readLine()) != null) {
                System.out.println(output);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}//end class
