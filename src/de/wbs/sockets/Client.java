package de.wbs.sockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {

        try (Socket client = new Socket("localhost", 1234);
             InputStream in = client.getInputStream();
             OutputStream out = client.getOutputStream();) {

            System.out.println("an: " + client.getInetAddress());
            System.out.println("von Clientport: " + client.getLocalPort());
            System.out.println("an Serverport: " + client.getPort());
            out.write(127);
            System.out.println(in.read());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
