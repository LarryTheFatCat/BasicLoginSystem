package main;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class RegisterWindow {

    JFrame frame = new JFrame();
    JLabel usernamelabel = new JLabel("Username");
    JLabel passwordLabel = new JLabel("Password");
    JLabel activationCode = new JLabel("ActivationCode");
    JTextField textUsername = new JTextField("Username");
    JPasswordField textPassword = new JPasswordField("Password");
    JPasswordField activationCodeInput = new JPasswordField("Code");
    JButton registerButton = new JButton("Register");
    JLabel errorLabel = new JLabel("Error!");
    JCheckBox checkBox1 = new JCheckBox("SavePassword");

    RegisterWindow() {
        frame.add(usernamelabel);
        frame.add(textUsername);
        frame.add(passwordLabel);
        frame.add(textPassword);
        frame.add(activationCode);
        frame.add(activationCodeInput);
        frame.add(registerButton);
        frame.add(checkBox1);
        frame.add(errorLabel);

        frame.setTitle("Register 1.0");
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        textUsername.setBounds(67, 0, 100, 20);
        usernamelabel.setBounds(0, 0, 100, 20);
        usernamelabel.setFont(new Font(null, Font.PLAIN, 10));
        usernamelabel.setForeground(Color.white);

        textPassword.setBounds(67, 20, 100, 20);
        passwordLabel.setBounds(0, 20, 100, 20);
        passwordLabel.setFont(new Font(null, Font.PLAIN, 10));
        passwordLabel.setForeground(Color.white);

        activationCodeInput.setBounds(67, 40, 100, 20);
        activationCode.setBounds(0, 40, 100, 20);
        activationCode.setFont(new Font(null, Font.PLAIN, 10));
        activationCode.setForeground(Color.white);

        // x y w h
        checkBox1.setBounds(0, 240, 120, 20);
        checkBox1.addActionListener(onClick -> {
        });

        registerButton.setBounds(67, 60, 100, 20);
        registerButton.setFont(new Font(null, Font.PLAIN, 10));
        registerButton.addActionListener(onClick -> {
            String user = textUsername.getText();
            String password = textPassword.getText();
            String activationcode = activationCodeInput.getText();
            creatUserFile(user, password, activationcode);

        });
    }

    private void creatUserFile(String username, String password, String activeCode) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Saved Passwords" + ".txt"))) {
            bufferedWriter.write(username + ", " + password + ", " + activeCode);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}