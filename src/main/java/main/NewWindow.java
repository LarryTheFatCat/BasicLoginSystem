package main;

import java.awt.*;
import javax.swing.*;
public class NewWindow {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Username");
    JTextField text = new JTextField("Username");
    NewWindow(){
        // represent x,y,z,w,h
        label.setBounds(0,0,100,20);
        label.setFont(new Font(null,Font.PLAIN,20));
        text.setBounds(50,10,100,20);


        frame.add(label);
        frame.add(text);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}