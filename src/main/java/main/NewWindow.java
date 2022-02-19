package main;

import java.awt.*;
import javax.swing.*;

public class NewWindow {

    JFrame frame = new JFrame();
    JLabel usernamelabel = new JLabel("Username");
    JLabel passwordLabel = new JLabel("Password");
    JLabel activationCode = new JLabel("activationCode");
    JTextField textUsername = new JTextField("Username");
    JPasswordField textPassword = new JPasswordField("Password");
    JPasswordField activationCodeInput = new JPasswordField("activationCode");
    NewWindow(){
        // represent x,y,z,w,h
        usernamelabel.setBounds(0,0,100,20);
        usernamelabel.setFont(new Font(null,Font.PLAIN,10));
        textUsername.setBounds(47,0,100,20);

        frame.getContentPane().setBackground(Color.darkGray);

        activationCode.setForeground(Color.white);
        usernamelabel.setForeground(Color.white);
        passwordLabel.setForeground(Color.white);

        passwordLabel.setBounds(0,20,100,20);
        passwordLabel.setFont(new Font(null,Font.PLAIN,10));
        textPassword.setBounds(47,20,100,20);

        activationCode.setBounds(0,40,100,20);
        activationCode.setFont(new Font(null,Font.PLAIN,10));
        activationCodeInput.setBounds(67,40,100,20);

        frame.add(usernamelabel);
        frame.add(textUsername);
        frame.add(passwordLabel);
        frame.add(textPassword);
        frame.add(activationCode);
        frame.add(activationCodeInput);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}