package de.wbs.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;

public class Attribute {

    public static void main(String[] args) {
        Path file =Paths.get("D:/javatmp/DatenKopie.txt");

        try {
            BasicFileAttributes basicAttributes = Files.readAttributes(file,BasicFileAttributes.class);
            System.out.println(basicAttributes.creationTime());

            //Windows
            DosFileAttributes dosAttributes = Files.readAttributes(file,DosFileAttributes.class);
            System.out.println(dosAttributes.isHidden());

            //Linux
//            PosixFileAttributes posAttributes = Files.readAttributes(file,PosixFileAttributes.class);
//            System.out.println(posAttributes.permissions());

            DosFileAttributeView forChange = Files.getFileAttributeView(file,DosFileAttributeView.class);
            forChange.setHidden(true);
            System.out.println(dosAttributes.isHidden());
            System.out.println(forChange.readAttributes().isHidden());
            System.out.println(dosAttributes.lastModifiedTime());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
