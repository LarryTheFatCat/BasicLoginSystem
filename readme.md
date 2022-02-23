# SwingGUI Rewrite 
- I will be porting everything to here with some modifications.

# Notes
- Due to me fucking up the old one with so many things, I've decided to port most things to here.
- Reason? Because old method looks too complicated and I want to simplify and expand my development.
- Why am I doing this? I like java, it's simple and understandable. Swing is very understandable and
lots of people should be able to read it with my code that I have ported. 

# Features
- Login Page
- The launch page has a loginButton and registerButton, the register button goes into a new window (that's why there's the NewWindowClass)
and displays the code that should eventually say Username:, Password:, Activation Code:, Register:. Once you click register,
it should pop a text that says: Register Successful. Hopefully in the future I can figure out how to save the preset to a database.


- Register Window.
- Too "Register an account" you can click this and it opens a new window, once you click 'Register' it creates a txt with the info. 


- Main Manager.
- Manager for LoginPage



# Requirements
- Decent understanding of Swing and Java in general
- Java 15
- If you want this to be a real login system, link it to a sql dataBase, I don't really know how to do it but if you make a pr ab it I would merge it.

# Images 

So I'm just going to show the Register because I hate the other parts as it's not done and I plan on finishing the most
difficult part first. 
![image](https://user-images.githubusercontent.com/83801755/154786867-e7467720-8380-4835-adab-88e91ef24a13.png)

# Updates

- Day 1:
- Built the entire System
- Focusing on Register until further notice 
- Made background on register darkGray 
- made text white
- Added checkBox1

- Day 2
- Implmented a couple lines of code that wheneverClicked register it saves the line of code and creates text file.
- Changed the title of registerMode.
- Changed the title of the launchPage.
- Just tested the clickAction -> creates .txt that stores pword via desktop and works!

- Day 3 
- Added github worflows so anyone can download any commit.
- removed workflows
- Added info page on LaunchPage, will add bounds later today
- Added bounds as of 2022/02/20
- Got rid of terminal outputs.
- Renamed LaunchPage -> MainPage
- Renamed NewWindow -> RegisterWindow

- Day 4
- Made savedInfo .txt -> .json
- added ResetButton to MM and RegisterWindow
- Will not port to SQL server
- Removed photos in resources
- Changed MainWindow -> LoginPage
- Changed RegisterWindow -> RegisterPage
- Not sure what to do now lol
- Changed Main -> LoginManager
- Updated readme.md to accurately display info.
- Finished Register, finished Login. Not to sure what's left.


- Day 5 
- Going to test port to Sql dataBase!