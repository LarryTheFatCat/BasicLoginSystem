package main;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.*;

public class LaunchPage implements ActionListener{

    JFrame frame = new JFrame();
    JButton registerButton = new JButton("Register");
    JButton loginButton = new JButton("Login");
    JLabel usernameLabel = new JLabel("Username");
    JTextField usernameText = new JTextField("Username");
    JLabel passwordLabel = new JLabel("Password");
    JPasswordField passwordField = new JPasswordField("Password");

    LaunchPage(){
        frame.add(registerButton);
        frame.add(loginButton);
        frame.add(usernameText);
        frame.add(passwordLabel);

        frame.getContentPane().setBackground(Color.darkGray);
        frame.setTitle("Main 1.0");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,300);
        frame.setLayout(null);
        frame.setVisible(true);

        usernameLabel.setBounds();
        usernameLabel.setFont(new Font(null, Font.PLAIN, 10));
        usernameText.setBounds();

        passwordLabel.setBounds();
        passwordLabel.setFont(new Font(null, Font.PLAIN, 10));
        passwordField.setBounds();

        registerButton.setBounds(0,40,100,20);
        registerButton.setFocusable(false);
        registerButton.addActionListener(this);

        loginButton.setBounds(0,240,700,20);
        loginButton.setFont(new Font(null, Font.PLAIN, 10));
        loginButton.addActionListener(onClick -> {
            String user = usernameText.getText();
            String password = passwordField.getText();
            System.out.println(user + ", " + password + "Saved!");
            creatUserFile(user, password);

        });

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==registerButton) {
            NewWindow myWindow = new NewWindow();
        }
    }
    private void creatUserFile(String username, String password) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Saved Passwords" + ".txt"))) {
            bufferedWriter.write(username + ", " + password + ", ");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}