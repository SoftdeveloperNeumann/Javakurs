package de.wbs.io;

import java.io.Console;

public class MyConsole {
    static Console c = System.console();

    public static void main(String[] args) {
        if(c != null){
            String user = c.readLine("user: ");
            char[] pwd = c.readPassword("pwd: ");
            c.format("Hallo %s. Dein Passwort: %s",user,new String(pwd));
        }
    }
}
