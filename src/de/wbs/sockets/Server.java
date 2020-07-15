package de.wbs.sockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try ( ServerSocket server = new ServerSocket(1234);
        Socket connection = server.accept();
              InputStream in = connection.getInputStream();
              OutputStream out = connection.getOutputStream()){
            System.out.println("angekommen :" + in.read());
            System.out.println("von: " + connection.getInetAddress());
            System.out.println("Clientport: " + connection.getPort());
            System.out.println("Serverport: " + connection.getLocalPort());
            out.write(127 + 1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
