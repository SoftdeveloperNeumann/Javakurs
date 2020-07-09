package de.wbs.gui;

import javax.swing.*;
import java.awt.*;

public class SimpleSwingGeruest extends JFrame {

    public SimpleSwingGeruest()  {
        super("Swing-Gerüst");
        JLabel label = new JLabel("Hello World");
        this.add(label);
        this.add(new JLabel("Hallo neue Welt!"));
    }

    public static void main(String[] args) {
        JFrame rahmen = new SimpleSwingGeruest();
        rahmen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rahmen.setLocationRelativeTo(null);
        rahmen.pack();
        rahmen.setVisible(true);
    }
}
