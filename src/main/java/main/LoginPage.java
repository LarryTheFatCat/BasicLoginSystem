package main;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;


public class LoginPage implements ActionListener{

    JFrame frame = new JFrame();
    JButton registerButton = new JButton("Register");
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JLabel usernameLabel = new JLabel("Username");
    JTextField usernameText = new JTextField("");
    JLabel passwordLabel = new JLabel("Password");
    JPasswordField passwordField = new JPasswordField("");
    JCheckBox saveInfo = new JCheckBox("SaveInfo");

    LoginPage(){
        frame.add(registerButton);
        frame.add(loginButton);
        frame.add(usernameLabel);
        frame.add(usernameText);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(resetButton);
        frame.add(saveInfo);

        frame.getContentPane().setBackground(Color.darkGray);
        frame.setTitle("Login");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,300);
        frame.setLayout(null);
        frame.setVisible(true);

        usernameLabel.setBounds(0, 100, 100, 20);
        usernameLabel.setFont(new Font(null, Font.PLAIN, 12));
        usernameLabel.setForeground(Color.white);
        usernameText.setBounds(55, 100, 700, 20);

        passwordLabel.setBounds(0, 140, 100, 20);
        passwordLabel.setFont(new Font(null, Font.PLAIN, 12));
        passwordField.setBounds(55, 140, 700, 20);
        passwordLabel.setForeground(Color.white);

        registerButton.setBounds(0, 220, 100, 20);
        registerButton.setFocusable(false);
        registerButton.addActionListener(this);

        saveInfo.setBounds(0, 180, 100, 20);
        saveInfo.setFocusable(false);
        saveInfo.addActionListener(onClick -> {
            String user = usernameText.getText();
            String password = String.valueOf(passwordField.getPassword());
            creatUserFile(user, password);
        });
        // store password in text file

        loginButton.setBounds(0,240,700,20);
        loginButton.setFont(new Font(null, Font.PLAIN, 10));
        loginButton.addActionListener(evt -> JOptionPane.showMessageDialog(null, "Successful Login"));



        resetButton.setBounds(0, 200, 100, 20);
        resetButton.setFont(new Font(null, Font.PLAIN, 10));
        resetButton.addActionListener(onClick -> {
            usernameText.setText("");
            passwordField.setText("");
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==registerButton) {
            RegisterPage myWindow = new RegisterPage();
        }
    }

    private void creatUserFile(String username, String password) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Auth-Info" + ".json"))) {
            bufferedWriter.write(username + ", " + password);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}