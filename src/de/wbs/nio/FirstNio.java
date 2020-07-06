package de.wbs.nio;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FirstNio {
    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();
//        System.out.println(fs.getPath("D:/"));

        for(Path p : fs.getRootDirectories()){
            System.out.println(p.getFileName());
            System.out.println(p);
            System.out.println(p.toUri());
            System.out.println(p.toAbsolutePath());
            try {
                System.out.println(p.toRealPath());
            } catch (IOException e) {


            }
        }
        System.out.println("Nun die FileStores:");
        for(FileStore fst : fs.getFileStores()){
            try {
                System.out.println("Name: " + fst.name() + " Type: " + fst.type() + " Speicher: " + fst.getUsableSpace());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }




    }
}
