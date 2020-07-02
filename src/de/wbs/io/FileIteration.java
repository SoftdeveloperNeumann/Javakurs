package de.wbs.io;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileIteration {
    static File dir = new File("D:/Kurse");

    static FilenameFilter nameFilter;
    static FileFilter filter;


    public static void main(String[] args) {
        for(String filename : dir.list()){
            System.out.println(filename);
        }

        nameFilter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.endsWith(".7z"))
                    return true;
                return false;
            }
        };

        for(String filename : dir.list(nameFilter)){
            System.out.println(filename);
        }


        filter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.getName().endsWith(".pdf"))
                    return true;
                return false;
            }
        };

        for(File file : dir.listFiles(filter)){
            System.out.println(file.getName());
        }

        for (File file : dir.listFiles((dir1, name) -> {
            if(name.endsWith(".7z"))
                return true;
            return false;
        })){
            System.out.println(file.getName());
        }

        for (File file : dir.listFiles((dir1, name) -> name.endsWith(".7z"))){
            System.out.println(file.getName());
        }
    }
}
