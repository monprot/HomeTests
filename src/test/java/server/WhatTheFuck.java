package server;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.*;
import java.net.InetSocketAddress;
import java.util.ArrayList;

public class WhatTheFuck {
    public static void main(String[] args) throws Exception {


        HttpServer server = HttpServer.create();

        server.bind(new InetSocketAddress(4446), 0);


        server.createContext("/", new WhatTheFuck.EchoHandler());


        server.createContext("/auf", new WhatTheFuck.EchoHandler2());

        server.setExecutor(null);
        server.start();


    }
    static class EchoHandler implements HttpHandler {

        @Override
        public void handle(HttpExchange exchange) throws IOException {

            StringBuilder builder = new StringBuilder();
            InputStream strim;
            ArrayList<String> headers = new ArrayList<>();
            exchange.getRequestHeaders().values().forEach(o -> headers.add(o.toString()));

            exchange.getRequestHeaders().values().forEach(o -> System.out.println("header =" + o));


            String status = "Pipi pupu check";

            /*
            Проверяем заголовки зщапроса, если в заголовках есть. что это апликатион джейсон
             */
            for (String a : headers) {
                if (a.contains("BeBest")) {

                    strim = exchange.getRequestBody();
                    BufferedReader in = new BufferedReader(new InputStreamReader(strim, "UTF-8"));
                    String line = in.readLine();
                    System.out.println("line=" + line);
                    status = "I doooooooooooooooo!!!!!!!!!!";

                }
            }


            builder.append(status);

            byte[] bytes = builder.toString().getBytes();
            exchange.sendResponseHeaders(200, bytes.length);

            OutputStream os = exchange.getResponseBody();

            os.write(bytes);
            os.close();
            exchange.close();



        }
    }

   static class EchoHandler2 implements HttpHandler {

        @Override
        public void handle(HttpExchange exchange) throws IOException {

            StringBuilder builder = new StringBuilder();
            InputStream strim;
            ArrayList<String> headers = new ArrayList<>();
            exchange.getRequestHeaders().values().forEach(o -> headers.add(o.toString()));

            exchange.getRequestHeaders().values().forEach(o -> System.out.println("header =" + o));


            String status = "<p><font size='100' color='#10baa6'> Vodila protyanyl aux</p>";

            /*
            Проверяем заголовки зщапроса, если в заголовках есть. что это апликатион джейсон
             */
            for (String a : headers) {
                if (a.contains("Vaz")) {

                    strim = exchange.getRequestBody();
                    BufferedReader in = new BufferedReader(new InputStreamReader(strim, "UTF-8"));
                    String line = in.readLine();
                    System.out.println("line=" + line);
                    status = "AUUUF";

                }
                if (a.contains("bmw")) {

                    strim = exchange.getRequestBody();
                    BufferedReader in = new BufferedReader(new InputStreamReader(strim, "UTF-8"));
                    String line = in.readLine();
                    System.out.println("line=" + line);
                    status = "beee";

                }
                if (a.contains("mers")) {

                    strim = exchange.getRequestBody();
                    BufferedReader in = new BufferedReader(new InputStreamReader(strim, "UTF-8"));
                    String line = in.readLine();
                    System.out.println("line=" + line);
                    status = "Fuuu";

                }
            }


            builder.append(status);

            byte[] bytes = builder.toString().getBytes();
            exchange.sendResponseHeaders(200, bytes.length);

            OutputStream os = exchange.getResponseBody();

            os.write(bytes);
            os.close();
            exchange.close();



        }
    }
}






