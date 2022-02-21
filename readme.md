# SwingGUI Rewrite 
- I will be porting everything to here with some modifications.

# Notes
- Due to me fucking up the old one with so many things, I've decided to port most things to here.
- Reason? Because old method looks too complicated and I want to simplify and expand my development.
- Why am I doing this? I like java, it's simple and understandable. Swing is very understandable and
lots of people should be able to read it with my code that I have ported. 

# Features
- Launch page.
- The launch page has a loginButton and registerButton, the register button goes into a new window (that's why there's the NewWindowClass)
and displays the code that should eventually say Username:, Password:, Activation Code:, Register:. Once you click register,
it should pop a text that says: Register Successful. Hopefully in the future I can figure out how to save the preset to a database.


- NewWindow.
- The NewWindow Class is the popUp that shows after you click Register. 


- Main.
- Not fully developed. Soon^TM


# Requirements
- A brain
- Java 15 
- If you really want this to work, you would have to link this to a dataBase, when you link it with sqr, then have the auth jar generate a code
that if you input it into here, it checks the main dataBase and if it's checked and it is correct it allows the user to pass through the auth. Obviously this is a lot easier
if you just use NetBeans IDE and JFX, but this is your choice but I honestly wouldn't use this nor will anyone lol.

# Images 

So I'm just going to show the Register because I hate the other parts as it's not done and I plan on finishing the most
difficult part first. 
![image](https://user-images.githubusercontent.com/83801755/154786867-e7467720-8380-4835-adab-88e91ef24a13.png)

# Updates

- Day 1:
- Built the entire System
- Focusing on Register until further notice 
- Made background on register darkgrey 
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
- Part 1 of moving to sql Database!