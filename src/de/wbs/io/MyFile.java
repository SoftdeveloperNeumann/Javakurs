package de.wbs.io;

import java.io.File;
import java.io.IOException;

public class MyFile {

    private static File file;

    public static void main(String[] args) {
        file = new File("D:\\javatext.txt");
        file = new File("D:/javatext.txt");
        String separator = File.separator;
        char separatorChar = File.separatorChar;
        file = new File("D:" + separator + "javatext.txt");

        String path= "D:/";
        String file= "javatxt.txt";
        File f1 = new File(path,file);


        File dir = new File("D:/");
        File f2 = new File(dir,file);

        System.out.println(f2.exists());
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());

        dir = new File("D:/javademo");
        f1 = new File(dir , "subordner");

        if(dir.exists() && dir.isDirectory()){
            if(!f1.exists()){
                f1.mkdir();
            }
        }

        dir = new File("D:/javademo/ordner1/ordner2");
        f1 = new File(dir,"ordner3");

//        System.out.println(f1.mkdir());
        System.out.println(f1.mkdirs());

        f2 = new File(f1,"datei.txt");

        try {
            f2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
