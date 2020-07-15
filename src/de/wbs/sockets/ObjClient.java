package de.wbs.sockets;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;

public class ObjClient {
    public static void main(String[] args) {
        int i = 0;

        try (Socket client = new Socket("127.0.0.1", 1234);

             ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
             ObjectInputStream in = new ObjectInputStream(client.getInputStream())) {
            client.setSoTimeout(10000);
            ObjSample obj = new ObjSample();
            out.writeObject(obj);
            out.flush();
            ObjSample resp = (ObjSample) in.readObject();
            System.out.println(resp.getName());
            System.out.println(obj.getName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
