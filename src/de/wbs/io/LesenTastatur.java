package de.wbs.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LesenTastatur {

    public static void main(String[] args) {
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);

        System.out.println("Zeichen eingeben:");
        try {
           int i = isr.read(); // Frank Neumann \r\n
           char c = (char)i;   // F ausgeben, im Stream rank Neumann \n
            System.out.println(i + " " + c);

            String os = System.getProperty("os.name").toLowerCase();
            System.out.println(os);
            if(os.contains("win"))
                isr.skip(1);

        } catch (IOException e) {
            e.printStackTrace();
        }


        BufferedReader br = new BufferedReader(isr);
        System.out.println("Name eingeben:");
        try {
            String name =  br.readLine(); //rank Neumann \n
            System.out.println(name);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
