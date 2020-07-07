package de.wbs.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class VerzeichnisseAnlegen {
    public static void main(String[] args) {
        Path path = Paths.get("D:/javatmp");

        if(Files.exists(path)){
            try {
                if(!Files.exists(path.resolve("Verzeichnis"))) {
                    Files.createDirectory(path.resolve("Verzeichnis"));
                }
                if(!Files.exists(path.resolve("OrdnerA/OrdnerB"))) {
                    Files.createDirectories(path.resolve("OrdnerA/OrdnerB"));
                }
                Files.createFile(path.resolve("Verzeichnis").resolve("Daten.txt"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
