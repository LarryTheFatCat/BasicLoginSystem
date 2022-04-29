import javax.swing.*



/**
 * @author TwoOneTwo
 * @creditsForHelp ily bush
 * This is the Register; this supports the mainClass ("LoginPage")
 */
class RegisterPage {

    var frame = JFrame()
    var usernameLabel = JLabel("Username:")
    var passwordLabel = JLabel("Password:")
    var activationCode = JLabel("Activation Code:")
    var usernameText = JTextField("")
    var passwordField = JPasswordField("")
    var activationInput = JPasswordField("")
    var registerButton = JButton("Register")
    var resetButton = JButton("Reset")
    var saveInfo = JCheckBox("Remember Me")
}