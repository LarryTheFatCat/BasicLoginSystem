package main;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class RegisterPage {

    JFrame frame = new JFrame();
    JLabel usernameLabel = new JLabel("Username");
    JLabel passwordLabel = new JLabel("Password");
    JLabel activationCode = new JLabel("ActivationCode");
    JTextField textUsername = new JTextField("");
    JPasswordField textPassword = new JPasswordField("");
    JPasswordField activationCodeInput = new JPasswordField("");
    JButton registerButton = new JButton("Register");
    JButton resetButton = new JButton("Reset");
    JCheckBox saveInfo = new JCheckBox("Save Code");


    RegisterPage() {
        frame.add(usernameLabel);
        frame.add(textUsername);
        frame.add(passwordLabel);
        frame.add(textPassword);
        frame.add(activationCode);
        frame.add(activationCodeInput);
        frame.add(registerButton);
        frame.add(resetButton);
        frame.add(saveInfo);

        frame.setTitle("Register");
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setSize(700, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        textUsername.setBounds(67, 0, 100, 20);
        usernameLabel.setBounds(0, 0, 100, 20);
        usernameLabel.setFont(new Font(null, Font.PLAIN, 10));
        usernameLabel.setForeground(Color.white);

        textPassword.setBounds(67, 20, 100, 20);
        passwordLabel.setBounds(0, 20, 100, 20);
        passwordLabel.setFont(new Font(null, Font.PLAIN, 10));
        passwordLabel.setForeground(Color.white);

        activationCodeInput.setBounds(67, 40, 100, 20);
        activationCode.setBounds(0, 40, 100, 20);
        activationCode.setFont(new Font(null, Font.PLAIN, 10));
        activationCode.setForeground(Color.white);
        
        saveInfo.setBounds(0, 200, 120, 20);
        saveInfo.addActionListener(onClick -> {
            String e = String.valueOf(textPassword.getPassword());
            String activeCode = String.valueOf(activationCodeInput.getPassword());
            creatUserFile(activeCode);
        });

        registerButton.setBounds(0, 240, 700, 20);
        registerButton.setFont(new Font(null, Font.PLAIN, 10));
        registerButton.addActionListener(evt -> JOptionPane.showMessageDialog(null, "Successful Register"));

        resetButton.setBounds(0, 220, 120, 20);
        resetButton.setFont(new Font(null, Font.PLAIN, 10));
        resetButton.addActionListener(onClick -> {
            textUsername.setText("");
            textPassword.setText("");
            activationCodeInput.setText("");
        });
    }

    private void creatUserFile(String activeCode) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Info" + ".json"))) {
            bufferedWriter.write(activeCode);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}