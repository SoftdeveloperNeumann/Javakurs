package de.wbs.io;

import java.io.*;

public class PersonSpeichern {

    public static void main(String[] args) {
        File file = new File("D:/javatmp/MyObj.ser");
        Person p = new Person("Neumann","Frank");
        System.out.println("Der Name lautet: " + p.getName());
        p.setAdress(new Adress("Berlin"));
        p.setPwd("qwert");
        p.setAge(33);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(p);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}