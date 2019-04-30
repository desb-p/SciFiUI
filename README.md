# SciFi UI Project

Name: Desiree Pepito

Student Number: C17770271

Fork this repository and use it a starter project for your assignment

# Description of the assignment
For this assignment, we are asked to implement a Sci Fi User Interface.  I decided to implement a user interface based on one of the Sci Fi movies named The Hunger Games, which is originally based on a book written by Suzanne Collins. This user interface essentially gives the user information, imagining they are in the Hunger Games battle and whenever they are in need of help. The user will be able to find a map to access a district and select which weapons they can use, as well as a clock to let them know how much time they have left in the battle.

# Instructions
 
 To operate this UI, it is fairly quite simple. First of all, the user will see a start up page. They can click start and it will automatically take them to another page. This page will consist of 4 buttons:  "Map", "Weapons", "Clock" and "Exit".

Once the user clicks the "Map" button, a map of the city Panem is displayed and there are red dots scattered indicating which district(or a town) the user can access to. 

When the user clicks the "Weapons" button, a slideshow of each weapon appears. The user can see 5 weapons displayed: Axe, Bow and Arrow, Spear, Sword, Trident. Information is displayed for each weapon in order for the user to be fully aware what the weapon is and how it can be used.

When the user clicks the "Clock" button, it takes the user to another page. An analogue clock will be displayed. The user can use this to be aware of what the current time is and what time is left till the battle is over. A digital clock is also displayed in the middle of clock screen.

If the user wishes to exit the UI, the "Exit" button can be clicked and it will take them user back to the start page.

 A statistics graph is shown at the side of the Buttons Page to display information for the user about the Kill Rate of each district.

# How it works

# What I am most proud of in the assignment

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

