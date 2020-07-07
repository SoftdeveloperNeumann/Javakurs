package de.wbs.nio;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class WriteInD {

    public static void main(String[] args) {
        Path file = Paths.get("D:/javatmp/Verzeichnis/Daten.txt");
        String info = "Ein String um in die Datei geschrieben zu werden\n";
        List<String> zeilen = new ArrayList<>();
        for(int i =0 ; i<11; i++){
            zeilen.add("Zeile " + i);
        }
        try {
            Files.write(file,info.getBytes(),StandardOpenOption.APPEND);
            Files.write(file,zeilen,StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            for(String line : Files.readAllLines(file)){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
