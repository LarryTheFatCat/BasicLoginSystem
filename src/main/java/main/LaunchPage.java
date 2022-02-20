package main;

import java.awt.event.*;
import java.io.File;
import java.util.Objects;
import javax.swing.*;

public class LaunchPage implements ActionListener{

    JFrame frame = new JFrame();
    JButton myButton = new JButton("Register");
    JButton loginButton = new JButton("Login");
    

    LaunchPage(){
        frame.setTitle("Main 1.0");
        frame.setResizable(false);

        myButton.setBounds(20,40,100,20);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        loginButton.setBounds(20,20,100,20);


        frame.add(myButton);
        frame.add(loginButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==myButton) {
            frame.dispose();
            NewWindow myWindow = new NewWindow();
        }
    }
}