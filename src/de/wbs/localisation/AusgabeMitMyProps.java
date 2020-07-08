package de.wbs.localisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AusgabeMitMyProps {

    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("src/de/wbs/resources/hello.properties");
            MyProps props = new MyProps(in);
            System.out.println(props.getString("hello"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
