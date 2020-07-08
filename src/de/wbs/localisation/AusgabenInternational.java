package de.wbs.localisation;

import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class AusgabenInternational {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault().getDisplayLanguage());

//        Locale.setDefault(new Locale("en","US"));
//        Locale.setDefault(new Locale("hi","In"));
        Locale.setDefault(new Locale("de","CH"));
        ResourceBundle rb = ResourceBundle.getBundle("de.wbs.resources.hello");
        Calendar c = Calendar.getInstance();
        Date d = c.getTime();
        System.out.println(d);

        DateFormat df = DateFormat.getDateInstance();
        System.out.println(df.format(d));

        double wert = 123_456.2346;

        System.out.println(wert);
        System.out.println(NumberFormat.getInstance().format(wert));
        System.out.println(NumberFormat.getCurrencyInstance().format(wert));

        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("more"));
        System.out.println(rb.getString("appName"));
        System.out.println(rb.getString("notranslation"));

        char mw ='w';
        String anrede = null;
        String name  = "Neumann";
        if(mw == 'm'){
            anrede = rb.getString("mr");
        }else{
            anrede = rb.getString("mrs");
        }
        String output = MessageFormat.format(rb.getString("sayHello"),anrede,name);
        System.out.println(output);

    }
}
