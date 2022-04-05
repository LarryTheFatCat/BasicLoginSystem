package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class LoginPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton register = new JButton("Register");
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JLabel username = new JLabel("Username");
    JTextField userInput = new JTextField("");
    JLabel password = new JLabel("Password");
    JPasswordField passwordField = new JPasswordField("");
    JCheckBox saveInfo = new JCheckBox("SaveInfo");

    LoginPage() {
        // If new appearance, add below.
        frame.add(register);
        frame.add(loginButton);
        frame.add(username);
        frame.add(userInput);
        frame.add(password);
        frame.add(passwordField);
        frame.add(resetButton);
        frame.add(saveInfo);

        frame.getContentPane().setBackground(Color.darkGray);
        frame.setTitle("Login");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        username.setBounds(0, 100, 100, 20);
        username.setFont(new Font(null, Font.PLAIN, 12));
        username.setForeground(Color.white);
        userInput.setBounds(55, 100, 700, 20);

        password.setBounds(0, 140, 100, 20);
        password.setFont(new Font(null, Font.PLAIN, 12));
        passwordField.setBounds(55, 140, 700, 20);
        password.setForeground(Color.white);

        register.setBounds(0, 220, 100, 20);
        register.setFocusable(false);
        register.addActionListener(this);

        saveInfo.setBounds(0, 180, 100, 20);
        saveInfo.setFocusable(false);
        saveInfo.addActionListener(onClick -> {
            String user = userInput.getText();
            String password = String.valueOf(passwordField.getPassword());
            creatUserFile(user, password);        // store password in text file
        });

        loginButton.setBounds(0, 240, 700, 20);
        loginButton.setFont(new Font(null, Font.PLAIN, 10));
        loginButton.addActionListener(evt -> JOptionPane.showMessageDialog(null, "Successful Login"));

        resetButton.setBounds(0, 200, 100, 20);
        resetButton.setFont(new Font(null, Font.PLAIN, 10));
        resetButton.addActionListener(onClick -> {
            userInput.setText("");
            passwordField.setText("");
        });
    }

    public static void main(String[] args) {

        LoginPage launchPage = new LoginPage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == register) {
            RegisterPage myWindow = new RegisterPage();
        }
    }

    // create user file when jbuttonclick refer to line 56 to 60.
    private void creatUserFile(String username, String password) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Auth-Info" + ".json"))) {
            bufferedWriter.write(username + ", " + password);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}