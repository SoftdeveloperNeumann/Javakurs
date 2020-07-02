package de.wbs.io;

import java.awt.color.ICC_Profile;
import java.io.File;
import java.io.IOException;

public class TmpFile {
//    File tmpFile;

    public static void main(String[] args) {


        try {
            File tmpFile = File.createTempFile("mytmp", ".tmp"); // oder null statt ".tmp"
            System.out.println(tmpFile.getAbsolutePath());
//            File f = new File("x");
//            System.out.println(f.getAbsolutePath());
//            System.out.println(TmpFile.class.getName().replace('.','\\'));  // dieverse Verzeichnis Infos, m,al checken
            tmpFile.deleteOnExit(); // eben angelegte tmp Datei wird wieder gelöscht
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
