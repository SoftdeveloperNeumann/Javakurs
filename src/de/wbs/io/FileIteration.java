package de.wbs.io;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileIteration {
    static File dir = new File("G:/javademo");
    static FileFilter filter;
    static FilenameFilter nameFilter;

    public static void main(String[] args) {


// for(String filename:dir.list()){
//            System.out.println(filename);
//        }
        // verbesserter Code:
        System.out.println("___________________ Alle Dateien und Verzeichnisse im Verzeichnis "+dir +" ---------------");
        Arrays.stream(dir.list()).forEach(System.out::println);

        System.out.println("__________________ Endung .7z__________");
        nameFilter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".7z");
            }
        };
        for (String filename : dir.list(nameFilter)) {
            System.out.println(filename);
        }
        for (File file : dir.listFiles((dir1, name) -> {
            if (name.endsWith(".7z")) {
                return true;
            }
            return false;
        })) {
            System.out.println(file.getName());

        }

//        filter = new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                if (pathname.getName().endsWith(".txt"))
//                    return true;
//                return false;
//            }
//        };
// ImtelliJ hat verbessert:

        System.out.println("________________ Endung .txt _______________");
        filter = pathname -> {
            return pathname.getName().endsWith(".txt");
        };
        for (File file : dir.listFiles(filter)) {
            System.out.println(file.getName());
        }
        System.out.println("_____________________Christian`s .png______________");
        for (File file : dir.listFiles(
                pathname -> pathname.getName().endsWith("png")
        )) {
            System.out.println(file.getName());
        }
        System.out.println("_________Franks .png______________");
        for (File file : dir.listFiles((dir1, name) -> name.endsWith(".png"))) {
            System.out.println(file.getName());
        }
        System.out.println("__________________Ch_______________");
        Arrays.asList(dir.listFiles(gibmir -> gibmir.getName().endsWith("txt"))).forEach(file -> System.out.println(file));
        System.out.println("_______________2nd__________");
        Arrays.asList(dir.listFiles(gibmir -> gibmir.getName().endsWith("txt"))).forEach(System.out::println);
        System.out.println("Test");
    }
}
