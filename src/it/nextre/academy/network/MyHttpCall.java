package it.nextre.academy.network;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MyHttpCall {

    public static void main(String[] args) {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest req = HttpRequest
                .newBuilder( URI.create("http://www.tropicalacquapark.it/"))
                .build();
        try {
            System.out.println(req.toString());

            HttpResponse res = client.send(req, HttpResponse.BodyHandlers.ofString());
            System.out.println(res.statusCode());
            System.out.println(res.headers().toString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }//end main

}//end class
