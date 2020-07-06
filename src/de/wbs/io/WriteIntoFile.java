package de.wbs.io;

import java.io.*;

public class WriteIntoFile {

    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        File file = new File("D:/javatmp/text.txt");
        try (BufferedWriter output = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file,true)))) {
            String str = null;
            do {
                System.out.println("Bitte Text eingeben:");
                str = input.readLine();
                output.write(str);
                output.newLine();
                if (true)
                    throw new IOException();
                output.flush();
            } while (str.length() > 0);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
