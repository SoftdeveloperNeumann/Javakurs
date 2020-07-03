package de.wbs.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeseDateiMitScanner {
    public static void main(String[] args) {
        File log = new File("D:/javatmp/error.log");
        try {
            Scanner scanner = new Scanner(log);
            while(scanner.hasNextLine()){
                System.out.println(scanner.findInLine("java"));
                scanner.nextLine();
//                System.out.println(scanner.nextLine());
            }
            System.out.println("Ende der Datei");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
