package io.journal.javatutorials.simpleserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Date;

public class MySimpleServer {
    public static void main(String[] args) throws IOException {
        final ServerSocket server = new ServerSocket(8080);
        System.out.println("Server is listening on port 8080");
        while (true) {
            try (Socket socket = server.accept()) {
                System.out.println("Client connected");
                InputStreamReader isr = new InputStreamReader(socket.getInputStream());
                BufferedReader reader = new BufferedReader(isr);
                String line = reader.readLine();

                while (!line.isEmpty()) {
                    System.out.println(line);
                    line = reader.readLine();
                }

                String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + "Hello, World! \n" + new Date();
                socket.getOutputStream().write(httpResponse.getBytes(StandardCharsets.UTF_8));
            }
        }
    }
}
