package de.wbs.io;

import java.io.File;
import java.io.IOException;

public class TmpFile {

    public static void main(String[] args) {

        try {
            File tmpFile = File.createTempFile("mytmp",".tmp");
            System.out.println(tmpFile.getAbsolutePath());
//            File f = new File("x");
//            System.out.println(f.getAbsolutePath());
//            System.out.println(TmpFile.class.getName().replace('.','\\'));
//            System.out.println(TmpFile.class.getProtectionDomain().getCodeSource().getLocation().getPath());
            tmpFile.deleteOnExit();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
