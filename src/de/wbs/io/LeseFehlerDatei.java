package de.wbs.io;

import java.io.*;

public class LeseFehlerDatei {

    public static void main(String[] args) {
        File log = new File("D:/javatmp/error.log");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(log);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader buff = new BufferedReader(isr);

        String line = null;
        try {
//            buff.mark(5);  // geändert in Java 1.8
            while (true) {
                if(!((line = buff.readLine()) != null)) break;
//                buff.mark(5);
                System.out.println(line);
            }

//            System.out.println(buff.readLine());
            System.out.println(buff.markSupported());

//            buff.reset();

            System.out.println(buff.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                buff.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


