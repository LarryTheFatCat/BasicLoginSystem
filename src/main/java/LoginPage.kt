import javax.swing.*

/**
 * @author TwoOneTwo
 * @creditsForHelp ily bush
 * This is the LoginPage AKA the mainClass
 */
class LoginPage {

    var frame = JFrame()
    var register = JButton("Register")
    var loginButton = JButton("Login")
    var resetButton = JButton("Reset")
    var username = JLabel("Username:")
    var password = JLabel("Password:")
    var userInput = JTextField("")
    var passwordField = JPasswordField("")
    var saveInfo = JCheckBox("Remember")

}