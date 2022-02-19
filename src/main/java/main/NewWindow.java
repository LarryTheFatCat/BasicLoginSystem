package main;

import javax.swing.*;
import java.awt.*;

public class NewWindow {

    JFrame frame = new JFrame();
    JLabel usernamelabel = new JLabel("Username");
    JLabel passwordLabel = new JLabel("Password");
    JLabel activationCode = new JLabel("activationCode");
    JTextField textUsername = new JTextField("Username");
    JPasswordField textPassword = new JPasswordField("Password");
    JPasswordField activationCodeInput = new JPasswordField("activationCode");
    JLabel successLabel = new JLabel("Success!");
    JButton registerButton = new JButton("Register");
    JCheckBox checkBox1 = new JCheckBox("SavePassword");
    NewWindow() {
        // username
        usernamelabel.setBounds(0, 0, 100, 20);
        usernamelabel.setFont(new Font(null, Font.PLAIN, 10));
        textUsername.setBounds(67, 0, 100, 20);

        // password
        passwordLabel.setBounds(0, 20, 100, 20);
        passwordLabel.setFont(new Font(null, Font.PLAIN, 10));
        textPassword.setBounds(67, 20, 100, 20);

        // activation code
        activationCode.setBounds(0, 40, 100, 20);
        activationCode.setFont(new Font(null, Font.PLAIN, 10));
        activationCodeInput.setBounds(67, 40, 100, 20);

        // register button
        registerButton.setBounds(67, 60, 100, 20);
        registerButton.setFont(new Font(null, Font.PLAIN, 10));
        registerButton.addActionListener(onClick -> {
            String user = textUsername.getText();
            String password = textPassword.getText();
            String activationcode = activationCodeInput.getText();
            System.out.println(user + ", " + password + ", " + activationcode);
        });

        // SuccessLabel
        successLabel.setBounds(67, 60, 100, 20);
        successLabel.setFont(new Font(null, Font.PLAIN, 10));

        //  checkbox settings
        checkBox1.setBounds(67, 80, 120, 20);

        frame.getContentPane().setBackground(Color.darkGray);
        activationCode.setForeground(Color.white);
        usernamelabel.setForeground(Color.white);
        passwordLabel.setForeground(Color.white);

        frame.add(usernamelabel);
        frame.add(textUsername);
        frame.add(passwordLabel);
        frame.add(textPassword);
        frame.add(activationCode);
        frame.add(activationCodeInput);
        frame.add(registerButton);
        frame.add(checkBox1);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}