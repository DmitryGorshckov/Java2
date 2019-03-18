package ru.gorshckov;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {


    private final String SERVER_ADDRESS = "localhost";

    private final int SERVER_PORT = 1000;

    private Socket socket;

    private Scanner in;

    private PrintWriter out;

    public Client() {

        try {

            socket = new Socket(SERVER_ADDRESS, SERVER_PORT);

            in = new Scanner(socket.getInputStream());

            out = new PrintWriter(socket.getOutputStream());

        } catch (IOException e) {

            e.printStackTrace();
        }

        new Thread(new Runnable() {

            @Override

            public void run() {

                try {

                    while (true) {

                        if (in.hasNext()) {

                            String w = in.nextLine();

                            if (w.equalsIgnoreCase("end session")) break;

                            System.out.println(w);
                        }
                    }
                } catch (Exception e) {

                    System.out.println("Good bye!");

                }
            }
        }).start();

        startMessage();
    }


    private void startMessage() {

        String message;

        Scanner console = new Scanner(System.in);

        System.out.println("Enter message:");

        while (true) {

            message = console.next();

            out.println(message);

            out.flush();

            if (message.equalsIgnoreCase("END")) {

                try {

                    console.close();

                    out.close();

                    in.close();

                    socket.close();

                    return;

                } catch (IOException e) {

                    e.printStackTrace();
                }
            }
        }
    }
}
