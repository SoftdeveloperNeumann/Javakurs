package de.wbs.gui;

import javax.swing.*;
import java.awt.*;

public class SwingGeruest extends JFrame{

    private  void createAndShowGui(){
//        JFrame.setDefaultLookAndFeelDecorated(true);
//        JFrame frame = new JFrame("Swing-Gerüst");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        JLabel lable = new JLabel("Hello World!");
//        frame.getContentPane().setLayout(new FlowLayout());
//        frame.getContentPane().add(lable);
//        frame.getContentPane().add(new JLabel("noch ein Textnoch ein Textnoch ein Textnoch ein Textnoch ein Text"));
//        frame.getContentPane().add(new JLabel("noch ein Text"));
//        JPanel cp = new JPanel(new FlowLayout());
//        cp.add(lable);
//        cp.add(new JLabel("noch ein Text"));
//        frame.setContentPane(cp);
//        frame.setSize(280,480);
//        frame.pack();
//        frame.setVisible(true);
        JButton jButton1 = new JButton();
        JButton jButton2 = new JButton();
        JButton jButton3 = new JButton();
        JButton jButton4 = new JButton();
        JButton jButton5 = new JButton();
        JButton jButton6 = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout());

        jButton1.setText("jButton1");
        getContentPane().add(jButton1);

        jButton2.setText("jButton2");
        getContentPane().add(jButton2);

        jButton3.setText("jButton3");
        getContentPane().add(jButton3);

        jButton4.setText("jButton4");
        getContentPane().add(jButton4);

        jButton5.setText("jButton5");
        getContentPane().add(jButton5);

        jButton6.setText("jButton6");
        getContentPane().add(jButton6);

        pack();
        setVisible(true);
    }



    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(()->new SwingGeruest().createAndShowGui());
    }
}
