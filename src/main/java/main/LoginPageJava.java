package main;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * This is the LoginPage
 */
public class LoginPageJava extends JFrame implements ActionListener {

    public static void main(String[] args) {
        LoginPageJava launchPage = new LoginPageJava();

    }

    /**
     * The Frame.
     */
    JFrame frame = new JFrame("Login");
    /**
     * The Register.
     */
    JButton register = new JButton("Register");
    /**
     * The Login button.
     */
    JButton loginButton = new JButton("Login");
    /**
     * The Reset button.
     */
    JButton resetButton = new JButton("Reset");
    /**
     * The Username.
     */
    JLabel username = new JLabel("Username:");
    /**
     * The User input.
     */
    JTextField userInput = new JTextField("");
    /**
     * The Password.
     */
    JLabel password = new JLabel("Password:");
    /**
     * The Password field.
     */
    JPasswordField passwordField = new JPasswordField("");
    /**
     * The Save info.
     */
    JCheckBox saveInfo = new JCheckBox("SaveInfo");

    /**
     * Instantiates a new Login page.
     */

    LoginPageJava() {

        frame.add(register);
        frame.add(loginButton);
        frame.add(username);
        frame.add(userInput);
        frame.add(password);
        frame.add(passwordField);
        frame.add(resetButton);
        frame.add(saveInfo);

        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setSize(700, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        username.setBounds(20, 100, 100, 20);
        username.setFont(new Font(null, Font.PLAIN, 12));
        userInput.setBounds(120, 100, 700, 20);
        username.setForeground(Color.WHITE);

        password.setBounds(20, 140, 100, 20);
        password.setFont(new Font(null, Font.PLAIN, 12));
        passwordField.setBounds(120, 140, 700, 20);
        password.setForeground(Color.WHITE);

        register.setBounds(0, 220, 100, 20);
        register.setFocusable(true);
        register.addActionListener(this);

        saveInfo.setBounds(0, 180, 100, 20);
        saveInfo.setFocusable(false);
        saveInfo.addActionListener(onClick -> {
            String user = userInput.getText();
            String password = String.valueOf(passwordField.getPassword());
            creatUserFile(user, password);
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


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == register) {
            frame.dispose();
            RegisterPageJava myWindow = new RegisterPageJava();
        }
    }

    private void creatUserFile(String username, String password) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Login-Info" + ".json"))) {
            bufferedWriter.write(username + ", " + password);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

}