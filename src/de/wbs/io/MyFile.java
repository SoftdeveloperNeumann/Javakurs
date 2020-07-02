package de.wbs.io;

import java.io.File;
import java.io.IOException;

public class MyFile {
    private static File file;

    public static void main(String[] args) {
        file = new File("D:\\javatext.txt");
        file = new File("D:/javatext.txt");	// ist dasselbe wie oben, funktioniert für Win und Linux
        String separator     = File.separator;
        char   separatorChar = File.separatorChar;
        file = new File("D:" + separator + "javatext.txt");
        System.out.println(file);		// D:\javatext.txt
        String path = "D:/";
        String file = "javatext.txt";
        File   f1   = new File(path, file);
        System.out.println(f1);		// D:\javatext.txt
        File dir = new File("G:/");
        File f2  = new File(dir, file);
        System.out.println(f2);		// D:\javatext.txt
        System.out.println(f2.exists());		// false, Verzeichnis nicht vorhanden
        System.out.println(f2.isDirectory());	// false, Ist Ordner - Ordner nicht vorhanden
        System.out.println(f2.isFile());		// false, ist Datei vorhanden
        System.out.println(f2.lastModified());	// liefert die Zeit in Millisekunden
        dir = new File("G:/javademo");
        f1  = new File(dir, "javademo_sub");
        if (dir.exists() && dir.isDirectory()) {
            if (!f1.exists()) {
                f1.mkdir();
            }

        }

        dir = new File("G:/javademo/ordner1/ordner2");
        f1  = new File(dir, "ordner3");
        // f1.mkdir();
        System.out.println(f1.mkdirs());	// erstellt mehere Verzeichnisse
        f2 = new File(f1, "datei.txt");		// neue Datei erstellen
        try {
            f2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
