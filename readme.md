# BasicInstaller

## Features

- This example shows what a basic Login System using Swing would look like.
- Swing GUI is very outdated, I don't recommend taking any ideas from this as it is still a WIP (Work In Progress) and
  is not the best.
- I can recommend that you use JavaFX as it's more modern and a lot better when compiling and using.
- The features that this includes in the Login Page include:
    - Title displayed as "Login"
    - Login Button
    - Username text box
    - Username Label
    - Password text box
    - Password label
    - A popup window when Login is clicked displaying "Successful Login"
    - Save Info <- will create a JSON file that holds your username and password...
    - Reset Button <- Sets the username and password values to 0...
- Now For Register:
    - Title displayed as "Register"
    - Register Button
    - Username text box
    - Username Label
    - Password text box
    - Password label
    - ActivationCode label
    - ActivationCode input
    - A popup window when Register is clicked displaying "Successful Login"
    - Save Info <- will create a JSON file that holds your username and password...
    - Reset Button <- Sets the username and password values to 0...

## Wanting to use this layout?

- If you don't feel like creating a layout and want to use mine, but a question you come upon is what is
  build.gradle.kts & settings.gradle.kts
- build.gradle.kts is like groovy, but it is meant for Kotlin building, obviously you think there's no kotlin anywhere
  in the build. You're right! There is not. I just have this because I really like using it as it is more reliable and
  easier :)
- I get you might not like having this but if you must, I will provide the source code for a groovy version, apparently
  it's easier and such, but I find that hard to believe.

settings.gradle:

`rootProject.name "InstallerLayoutExample" `

build.gradle:

````

apply plugin: 'java'

group 'main.TestingClass'
version '1.0-SNAPSHOT'
archivesBaseName = 'SwingApplication'

jar {
manifest {
attributes "Main-Class": "main.LoginPage"
}

    from {
        configurations.compile.collect { it.isDirectory() ? it : zipTree(it) }
    }
}`
````

# A Guide

#### LoginPageJava() {

- Pretty much initializes anything inside of it, you always have to do this when you are using Java Swing

```
` LoginPageJava() {

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
        frame.setSize(700, 300);
        frame.setLayout(null);
        frame.setVisible(true);  }
```

#### frame.add(....);

- To make anything visible, you first have to create the actual Frame.
- In Swing, go to the LoginPageJava() {, and then create your frame outline.
    - Make sure to create a variable for your frame (meaning JFrame frame = new JFrame(String-Title: "Example" ); )
      `

 ````
    
    JButton registerButton = new RegisterButton("Register");
    JFrame frame = new JFrame("Login");

  - LoginPageJava() {
        // You do not need to add frame.add(frame); as it's already added :)
        
        frame.add(loginButton);
        // Now, we can add the button to initialize it 

        // lets make our first Module for the Swing GUI :)
        // we are going to simplfy how the Register button works here :)
        
        loginButton.setBounds(0, 240, 700, 20); // Again, this just sets the boundries of the button.
        loginButton.setFont(new Font(null, Font.PLAIN, 10)); // This is how you can set the font of the text inside the Button :)
        loginButton.addActionListener(evt -> JOptionPane.showMessageDialog(null, "Successful Login")); // This is a lambda event where when the person who clicks on the JButton, it will send a Box saying "Successful Login".
    


        frame.setResizable(false); // Do you want to make the frame resizable? True -> Yes, false -> No.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // How you want it to close, this is the best way as it force closes the Swing Application.
        frame.setSize(700, 300); // The size of the frame, this is how you can set the width and height of the actual swing application
        frame.setLayout(null); // Prevents NullPointerException? I don't really know I just have it here.
        frame.setVisible(true); // This is very important has this checks if the frame is visible on your computer or not.


}

````

### How to make a Second window Open up :)

- So, this is a complicated process, but I will simplify the process for you :)

 ````

// So, let's create a button to open up the second window
// In this case, we can use the RegisterButton that we already created :)
// If you read the previous document then you would be able to know how this works.


        frame.add(registerButton); // CamelCase is very important in OOP(Object Oriented Programming):)
        
        
        register.setBounds(0, 220, 100, 20);
        register.setFocusable(true);
        register.addActionListener(this);
        
        // Now for the fun stuff :D
        // Check back to a couple lines above, we created a ActionListner for the register Button, now look at the code below.
        // we are just creating a action event where when the Register Button is clicked, it will automatically get rid
        of the login screen, and will open up the new window, there you can create a second class for the info <- AKA RegisterClassJava
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == register) {
                frame.dispose();
                RegisterPageJava myWindow = new RegisterPageJava();
            }
        }
````

### How to save your information with a CheckBox :)

````

// So, you've come this far and you're wondering how to save your information for when users may not remember their password.
// This may be a little complicated but I will walk this through 


// First, we create our CheckBox :)

        saveInfo.setBounds(0, 180, 100, 20);
        saveInfo.setFocusable(false);
        // Now, we create another event where it will get the information that is on UserInput and passwordField.
        saveInfo.addActionListener(onClick -> {
            String user = userInput.getText();
            String password = String.valueOf(passwordField.getPassword());
            creatUserFile(user, password);
        });
        
        Once we do that, we can create the actual information to save the files.
        
        // We use private because it isn't going to be used in any other classes (there's 1 other class)
        // We use Try-Catch statements to debug the process as this is a little unstable...
        // When you save the info then close out of the Swing application 
        // since it's being used in an IDE only, we can just use print to print ou tthe exception that occurs in the process via terminal.
            private void creatUserFile(String username, String password) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Login-Info" + ".json"))) {
            bufferedWriter.write(username + ", " + password);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
````

### How to clear input

- So, this is the final tutorial.

````

// First, we create the JButton called ResetButton...

        frame.add(resetButton);
        
        
        resetButton.setBounds(0, 220, 120, 20); // sets the bounds
        resetButton.setFont(new Font(null, Font.PLAIN, 10)); // font
        // so, on this part, we create another Actoin Listener to set both Username, and password to blank.
        // this will only happen when the user clicks it, refering to the onClick -> {
        // we use an arrow to figure out where the onClick Event will happen. On this part we can see it will be related to
        usernameText.setText("");
        passwordField.setText(""); 
        
        resetButton.addActionListener(onClick -> {
            usernameText.setText("");
            passwordField.setText("");
        });
    }



````
