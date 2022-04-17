package main;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * The type Register page.
 */
public class RegisterPage {

    /**
     * The Frame.
     */
    JFrame frame = new JFrame();
    /**
     * The Username label.
     */
    JLabel usernameLabel = new JLabel("Username:");
    /**
     * The Password label.
     */
    JLabel passwordLabel = new JLabel("Password");
    /**
     * The Activation code.
     */
    JLabel activationCode = new JLabel("Code:");
    /**
     * The Username text.
     */
    JTextField usernameText = new JTextField("");
    /**
     * The Password field.
     */
    JPasswordField passwordField = new JPasswordField("");
    /**
     * The Activation input.
     */
    JPasswordField activationInput = new JPasswordField("");
    /**
     * The Register button.
     */
    JButton registerButton = new JButton("Register");
    /**
     * The Reset button.
     */
    JButton resetButton = new JButton("Reset");
    /**
     * The Save info.
     */
    JCheckBox saveInfo = new JCheckBox("SaveCode");

    /**
     * Instantiates a new Register page.
     */
    RegisterPage() {
        frame.add(usernameLabel);
        frame.add(usernameText);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(activationCode);
        frame.add(activationInput);
        frame.add(registerButton);
        frame.add(resetButton);
        frame.add(saveInfo);

        frame.setTitle("Register");
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setSize(700, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        usernameText.setBounds(55, 100, 700, 20);
        usernameLabel.setBounds(0, 100, 100, 20);
        usernameLabel.setFont(new Font(null, Font.PLAIN, 12));
        usernameLabel.setForeground(Color.white);

        passwordField.setBounds(55, 140, 700, 20);
        passwordLabel.setBounds(0, 140, 100, 20);
        passwordLabel.setFont(new Font(null, Font.PLAIN, 12));
        passwordLabel.setForeground(Color.white);

        activationInput.setBounds(60, 180, 700, 20);
        activationCode.setBounds(0, 180, 100, 20);
        activationCode.setFont(new Font(null, Font.PLAIN, 12));
        activationCode.setForeground(Color.white);

        saveInfo.setBounds(0, 200, 120, 20);
        saveInfo.addActionListener(onClick -> {
            passwordField.getPassword();
            String activeCode = String.valueOf(activationInput.getPassword());
            creatUserFile(activeCode);
        });

        registerButton.setBounds(0, 240, 700, 20);
        registerButton.setFont(new Font(null, Font.PLAIN, 10));
        registerButton.addActionListener(evt -> JOptionPane.showMessageDialog(null, "Successful Register"));

        resetButton.setBounds(0, 220, 120, 20);
        resetButton.setFont(new Font(null, Font.PLAIN, 10));
        resetButton.addActionListener(onClick -> {
            usernameText.setText("");
            passwordField.setText("");
            activationInput.setText("");
        });
    }


    private void creatUserFile(String activeCode) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Register-Info" + ".json"))) {
            bufferedWriter.write(activeCode);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}