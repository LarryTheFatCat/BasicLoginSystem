import java.awt.*
import java.io.BufferedWriter
import java.io.FileWriter
import java.net.PasswordAuthentication
import javax.swing.*

/**
 * @author TwoOneTwo
 * @creditsForHelp ily bush
 * This is the LoginPage AKA the mainClass
 */
class LoginPage {

    private var frame = JFrame()
    private var register = JButton("Register")
    private var loginButton = JButton("Login")
    private var resetButton = JButton("Reset")
    private var username = JLabel("Username:")
    private var password = JLabel("Password:")
    private var userInput = JTextField("")
    private var passwordField = JPasswordField("")
    private var saveInfo = JCheckBox("Remember")


    fun loginpage() {

        frame.add(register)
        frame.add(loginButton)
        frame.add(username)
        frame.add(userInput)
        frame.add(password)
        frame.add(passwordField)
        frame.add(resetButton)
        frame.add(saveInfo)

        frame.title = "Login"
        frame.isResizable = false
        frame.defaultCloseOperation = (JFrame.EXIT_ON_CLOSE)
        frame.setSize(700, 300)
        frame.isVisible = true

        username.setBounds(20, 100, 100, 20)
        username.font = Font(null, Font.PLAIN, 12)
        userInput.setBounds(120, 100, 700, 20)

        password.setBounds(20, 140, 100, 20)
        password.font = Font(null, Font.PLAIN, 12)
        passwordField.setBounds(120, 140, 700, 20)

        register.setBounds(0, 220, 100, 20)
        register.isFocusable = true

        saveInfo.setBounds(0, 180, 100, 20)
        saveInfo.isFocusable = false
        saveInfo.addActionListener {
            val user = userInput.text
            val password = String(  )
            creatUserFile(user, password)
        }

        fun main() {
            val launchPage = LoginPage()
        }
    }

    private fun creatUserFile(username: String, password: String) {
        BufferedWriter(FileWriter("Login-Info" + ".json")).use {
            it.write("$username, $password")
        }
    }
}