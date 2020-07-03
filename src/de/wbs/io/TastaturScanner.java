package de.wbs.io;

import java.util.Scanner;

public class TastaturScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Namen eingeben: ");
        String name = scanner.next();
        System.out.println(name);
        while (scanner.hasNext()){
            System.out.println(scanner.next());
            System.out.println("next:Frank");
        }
        System.out.println("und das Alter:");

            int alter = scanner.nextInt();
        if(scanner.hasNextInt()) {
            System.out.println("Rentenbeginn in " + (68 - alter) + "Jahren");
        }else{
            System.out.println("Falscher Wert: " + scanner.next());
        }
    }
}
