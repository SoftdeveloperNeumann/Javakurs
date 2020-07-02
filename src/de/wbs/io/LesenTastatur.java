package de.wbs.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LesenTastatur {
    public static void main(String[] args) {
        InputStream is=System.in;   // Byteorientierter Stream
        InputStreamReader isr=new InputStreamReader(is); // Inputstreamreader erweitert auf Zeichenorientierter Stream

        System.out.println("Zeichen eingeben ");
        // try catch Block notwendigm weil immer Fehler entstehen können
        try {
            int i= isr.read();
            char c=(char)i;      // "Zahl", also der eingelesenen Charakter wieder zum char gemacht
            System.out.println(i+" "+c);
            String os=System.getProperty("os.name").toLowerCase();
            System.out.println(os);;
            if (os.contains("win")){
                isr.skip(1);
            }else {
                isr.skip(2);        // wird ein Zeichen geskipped
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("____________________________________________");
        BufferedReader br=new BufferedReader(isr);
        System.out.println("SAtz eingeben ");
        try {
            String satz=br.readLine();
            System.out.println(satz);       // nur der Rest des oben eingelesenen Streams wird ausgegeben
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
