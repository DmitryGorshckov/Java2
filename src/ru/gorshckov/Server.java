package ru.gorshckov;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        ServerSocket server = null;

        Socket socket = null;


        try {

            server = new ServerSocket(1000);

            System.out.println("Server created. Waiting for client...");


            while (true) {

                socket = server.accept();

                System.out.println("Client connected");

                new Thread(new ClientThread(socket)).start();

            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                socket.close();

                server.close();

                System.out.println("Server closed");

            } catch (IOException e) {

                e.printStackTrace();

            }

        }

    }
}
