package de.wbs.resources;

import java.util.ListResourceBundle;

public class MyListBundle extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        Object[][] bundle = new Object[][]{
                {"wert","ein String"},
                {"zahl", 2},
                {"array", new String[]{"A","B","C"}}
        };
        return bundle;
    }
}
