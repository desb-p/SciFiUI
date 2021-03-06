# SciFi UI Project

Name: Desiree Pepito

Student Number: C17770271

Fork this repository and use it a starter project for your assignment

# Description of the assignment
For this assignment, we are asked to implement a Sci Fi User Interface.  I decided to implement a user interface based on one of the Sci Fi movies named The Hunger Games, which is originally based on a book written by Suzanne Collins. This user interface essentially gives the user information, to imagine as if they are in the Hunger Games battle. The user will be able to find a map to access a district and select which weapons they can use, as well as a clock to let them know how much time they have left in the battle.

# Instructions
 
 To operate this UI, it is fairly quite simple. First of all, the user will see a start up page. They can click start and it will automatically take them to another page. This page will consist of 4 buttons: 
 - Map
 - Weapons
 - Clock 
 - Exit
 
An audio file 'whistle.mp3' will be playing the background.

Once the user clicks the "Map" button, a map of the city Panem is displayed and there are red dots scattered indicating which district(or a town) the user can access to. The user can also hover over each district and information about the district will present.

When the user clicks the "Weapons" button, a slideshow of each weapon appears. 
The user can see 5 weapons displayed: 
- Axe
- Bow 
- Arrow
- Spear
- Sword 
- Trident

Information is displayed for each weapon in order for the user to be fully aware what the weapon is and how it can be used. The 'B' key is pressed to go exit and it will return to the buttons section.

When the user clicks the "Clock" button, it takes the user to another page. An analogue clock will be displayed. The user can use this to be informed of what the current time is and what time is left till the battle is finished. A digital clock is also displayed in the middle of clock screen.

If the user wishes to exit the UI, the "Exit" button can be clicked and it will take them user back to the start page.

 A statistics graph is shown at the side of the Buttons Page to display information for the user about the Kill Rate of each district.

# How it works

I have created numerous classes for this project: 
 
#### Main

The main class is used to run the program.

#### UIElement

This is the super class which the classes will inherit from.

#### Circle

This class drew the circle and the rotating arcs at the start page. I used arc and ellipse to rotate the direction of the circles.

#### Clock 
This stores the location and position of the clock which is being declared to the UI Class when the clock button is pressed.

#### Grid 

This draws a dotted grid that displays with the buttons. I used two for loops to render the dots as well as an ellipse. 

#### Weapons

The weapons class stores the location of the weapon images to be implemented in the UI Class. 
Two arrays were also created to store the image of each weapon and its description. Again, this is created in the UI class.

#### Map

It takes in 8 parameters which is then declared in UI. The map also renders the x,y, width and height coordinates of map "Panem" image. A CSV file is to be generated so a table row is being passed as a parameter to get the first row of the csv file which is *Name*. 

#### District
This class creates CSV file stores the coordinates of each district. "District", "locationX", "locationY" variables were created.
Getters and setters were generated to access the variables outside of the class.

#### DistrictInfo
This class creates the CSV file stores the information of each district. "CoordX", "CoordY", "districtOne" variables were created.
Once again, Getters and setters were generated to access the variables outside of the class.
The districts in the map can be hovered depending the location of the mouseX, mouseY. Once it is hovered, information is displayed.

#### Welcome 

Creates the CSV file that stores the Welcome message at the botttom of the Buttons page. This is then initialised in UI.
A message "Welcome Human...Accessing Data" will move from side to side. An if statement was created in order for the message to disappear and reappear back on the screen.


The images used are loaded in set up in the UI class as well as the four bottons. 
The audio file is also loaded and initialised in the UI class. It is then declared to be played in the buttons section.

# What I am most proud of in the assignment
What I'm most proud of in doing this assignment was that I was able to choose what kind of user interface I want to design. In my opinion it was a challenging assignment, it was not easy coming up with an idea at first but as time processed I began to think of a lot of ideas. There were some tasks that were okay to implement and some that very difficult that consumed a lot of time but halfway through, I began to realise that this was not just a programming project but there was also a fun side to it. I was very happy with the code I wrote by the end of this project.

In my opinion, I was able to learn a lot from using Processing and Java programming language. I learnt how to implement numerous things such as hoovering buttons, learning new libraries in processing etc. I believe that this project helped me gained better understanding and knowledge of Processing, Java and using git. From the experience of doing this project, I also believe this will help me in the nearby future. 

## Start Page

![An image](java/data/Start.png)

## Buttons Page

![An image](java/data/Buttons.png)

## Map Page
![An image](java/data/Panem.png)


## YouTube Video for my Assignment


[![YouTube](https://github.com/desb-p/SciFiUI/blob/master/java/data/Start.png)](https://www.youtube.com/watch?v=UQNmRxr8QQY&feature=youtu.be)

