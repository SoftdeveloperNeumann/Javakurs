package de.wbs.io;

import java.io.*;

public class LeseFehlerDateiNeu {
    static File log = new File("D:/javatmp/error.log");

    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(log);
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }
        InputStreamReader isr = new InputStreamReader(fis);


        String line = null;
        try(BufferedReader buff = new BufferedReader(isr)) {
//            buff.mark(5);  // geändert in Java 1.8
            while (true) {
                if (!((line = buff.readLine()) != null)) break;
//                buff.mark(5);
                System.out.println(line);
            }

//            System.out.println(buff.readLine());
            System.out.println(buff.markSupported());

//            buff.reset();

            System.out.println(buff.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
