package de.wbs.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class FehlerInDateiSchreiben {
   static File log = new File("D:/javatmp/error.log");

    public static void main(String[] args) {
        try {
//            FileOutputStream out = new FileOutputStream(log); // Bei jeder Ausführung wird die Datei neu angelegt
            FileOutputStream out = new FileOutputStream(log,true);
            PrintStream pr = new PrintStream(out);
            System.setErr(pr);
            throw new FileNotFoundException();
//            throw new RuntimeException();
        } catch (FileNotFoundException e) {
            System.err.println("Weitere Informatione, Datum, Rechnersystem...");
            e.printStackTrace();
        }
    }
}
