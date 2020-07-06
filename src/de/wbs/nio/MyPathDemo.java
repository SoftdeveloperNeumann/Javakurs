package de.wbs.nio;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class MyPathDemo {

    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();

        Path path = fs.getPath("D:/", "workspace","/StartProjekt/fileundio");
        System.out.println(path.toAbsolutePath());
        System.out.println(path.toUri());
        path = fs.getPath("D:/", "workspace","/StartProjekt","\\fileundio");
        System.out.println(path.toAbsolutePath());
        System.out.println(path.toUri());
        path = fs.getPath("src");
        System.out.println(path.toAbsolutePath());
        Path path2 = path.resolve("de");
        System.out.println(path2.toAbsolutePath());
        path2 = path.resolve("com");
        System.out.println(path2.toAbsolutePath());
        Path pathParent = path2.getParent();
        System.out.println(pathParent.toAbsolutePath());
        System.out.println(pathParent.getNameCount());
        path = fs.getPath("D:/", "workspace","/StartProjekt/src/fileundio");
        System.out.println(path.toAbsolutePath());
        System.out.println("..." + path.getName(2).toAbsolutePath());

//        System.out.println(path.getNameCount());
//        path2 = path.getName(1).resolve("Gui");
//        System.out.println(path2.getParent());

    }
}
