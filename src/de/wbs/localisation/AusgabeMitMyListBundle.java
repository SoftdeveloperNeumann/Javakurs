package de.wbs.localisation;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class AusgabeMitMyListBundle {

    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("de.wbs.resources.MyListBundle",Locale.US);
        System.out.println(rb.getString("wert"));
//        System.out.println(rb.getString("zahl")); // Fehler weil ein Integer vorliegt
        System.out.println((Integer)rb.getObject("zahl") + 2);
        if(rb.containsKey("array")) {
            String[] werte = (String[]) rb.getObject("array");
            for (String val : werte) {
                System.out.println(val);
            }
        }
        Enumeration<String> en = rb.getKeys();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
}
