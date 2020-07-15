package de.wbs.sockets;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ObjServer {
    public static void main(String[] args) {
        boolean isActive = true;
        try(ServerSocket server = new ServerSocket(1234)) {
            server.setReceiveBufferSize(10);
            while(isActive) {
                System.out.println("Warte auf Anfrage!");
                Socket connection = server.accept();
                Thread t = new Thread(new ObjServer().new Handler(connection));
                t.start();
                try {
                    Thread.sleep(100000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private class Handler implements Runnable {
        Socket connection;
        ObjectInputStream in;
        ObjectOutputStream out;
        public Handler(Socket connection) {
            this.connection=connection;
            try {
                in = new ObjectInputStream(connection.getInputStream());
                out = new ObjectOutputStream(connection.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            try {
                Object obj = in.readObject();
                if(obj instanceof ObjSample){
                    ObjSample sample = (ObjSample) obj;
                    System.out.println(sample.getName());
                    sample.setName("Frank Neumann");
                    Thread.sleep(10);
                    out.writeObject(sample);
                    out.flush();
                }else{
                    System.out.println("Objekt konnte nicht verarbeitet werden");
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                try {
                    in.close();
                    out.close();
                    connection.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
