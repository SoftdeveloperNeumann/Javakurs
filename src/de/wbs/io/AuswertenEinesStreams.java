package de.wbs.io;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AuswertenEinesStreams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner("ein Inhalt,12,werte,23,true,12.56");
        scanner.useDelimiter(",");
        if(",".equals(Pattern.compile(",").pattern()))
        scanner.useLocale(Locale.ENGLISH);
        while(scanner.hasNext()){
            if(scanner.hasNextInt()){
                int wert1 = scanner.nextInt();
                System.out.println("Wert1: " + wert1);
            }else if(scanner.hasNextDouble()){
                double wert3 = scanner.nextDouble();
                System.out.println("Wert3: " + wert3);
            }else if(scanner.hasNextBoolean()){
                boolean bool = scanner.nextBoolean();
                System.out.println("Boolean: " + bool);
            }else {
                System.out.println("String gefunden: " + scanner.next());
            }
        }

    }
}
