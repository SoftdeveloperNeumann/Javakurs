package de.wbs.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class FehlerInDateiSchreiben {
    static File log=new File("G:/javademo/error.log");
    public static void main(String[] args) {
        try {
//            FileOutputStream out=new FileOutputStream(log); // Bei jeder Ausfuehrung wird Datei neu angelegt
            FileOutputStream out=new FileOutputStream(log,true); // Bei jeder Ausfuehrung wird Text hinzugefügt
            PrintStream pr=new PrintStream(out);
            System.setErr(pr);
//            throw new FileNotFoundException();
            throw  new RuntimeException();  // braucht nicht gehandeled werden
        } catch (FileNotFoundException e) {
            System.err.println("Weitere Informationen, Datum, Rechnersystem...");
            e.printStackTrace();
        }

    }
}
