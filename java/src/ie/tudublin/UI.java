package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.core.PImage;

public class UI extends PApplet
{
    Button startButton;

    Button button1;
    Button button2;
    Button button3;
    Button button4; 

    //ArrayList<Button>buttons = new ArrayList<>();

    PImage Mockingjay;
    PImage Panem;

    PImage weapon1;
    PImage weapon2;
    PImage weapon3;
    PImage weapon4;
    PImage weapon5;

    Circle c;

    int set = 0;
    boolean draw = false;

    // boolean[] keys = new boolean[1024];

    // public void keyPressed()
    // {
    //     keys[keyCode] = true;
    // }
    
    // public void keyReleased()
    // {
    //     keys[keyCode] = false;
    // }

    // public boolean checkKey(int c)
    // {
    //     return keys[c] || keys [Character.toUpperCase(c)];
    // }
    

    public void settings()
    {
        //size(800, 800);
        // Use fullscreen instead of size to make your interface fullscreen
        fullScreen();

    }

    public void setup()
    {
        // Buttons
        startButton = new Button(this, 50, 100, 100, 50, "Start");

        // buttons.add(new Button(this, 300, 200, 100, 50, "Map"));
        // buttons.add(new Button(this, 1000, 200, 100, 50, "Weapons"));
        // buttons.add(new Button(this, 300, 700, 100,50,  "Clock"));
        // buttons.add(new Button(this, 1000, 700, 100, 50, "Exit"));

        button1 = new Button(this, 300, 200, 100, 50, "Map");
        button2 = new Button(this, 1000, 200, 100, 50, "Weapons");
        button3 = new Button(this, 300, 700, 100,50,  "Clock");
        button4 = new Button(this, 1000, 700, 100, 50, "Exit");
        
      
        // Loading Images

        Mockingjay = loadImage("mockingjay.jpeg");
        Panem = loadImage("map.png");
        weapon1 = loadImage("axe.png");
        weapon2 = loadImage("bowarrow.png");
        weapon3 = loadImage("spear.png");
        weapon4 = loadImage("sword.jpg");
        weapon5 = loadImage("trident.jpg");
        
    
        c = new Circle(width/2, 500, this);

        
    }

    

    public void draw()
    {
        
        // When start button is clicked
        if(set == 0)
        {
           
            background(0);
            fill(0);
            stroke(51,102,255);
            strokeWeight(1);
            rect(30,20, width - 50, height - 50); // x = 30, y = 20.
            rect(40,30, width - 70, height - 70);
            image(Mockingjay, 550, 180);
            c.render();

            // stroke(255);
            // line(100,100,mouseX, mouseY);
            // println(mouseX, mouseY);
        
        }
        // when buttons are clicked
        else if (set == 1)
        {
            background(0);
            stroke(255,128,128);

            
            // stroke(255);
            // line(100,100,mouseX, mouseY);
            // println(mouseX, mouseY);


            // for(Button b: buttons)
            // {
            //     b.render();
            // }
            // if(draw == true)
            // {

                
                button1.render();
                button2.render();
                button3.render();
                button4.render();

                


            }
            // when map button clicked.
            else if(set == 2)
            {

            

                int x2 = width/2;
                int y2 = height/2;
                int dot = 3;
                int dist = 3;

            
                image(Panem,width/2-250,height/2-200,400,400);
                
                fill(255);
                text("PANEM",x2-30,240);
                stroke(255,0,0);

                pushMatrix();
                translate(x2-200,y2-150);

                ellipse(50,15,dot,dot);
                text("District 7", 70+dist,25);

                ellipse(105,50,dot,dot);
                text("District 1", 110+dist,55);

                ellipse(25,70,dot,dot);
                text("District 4", 35+dist,80);

                ellipse(80,87,dot,dot);
                text("Capitol", 90+dist,95);

                ellipse(130,100,dot,dot);
                text("District 9", 140+dist,110);

                ellipse(130,142,dot,dot);
                text("District 2", 140+dist,152);

                ellipse(50,150,dot,dot);
                text("District 5", 60+dist,160);

                ellipse(125,205,dot,dot);
                text("District 10", 135+dist,215);

                ellipse(240,240,dot,dot);
                text("District 11", 250+dist,250);

                ellipse(260,210,dot,dot);
                text("District 8", 270+dist,220);
                
                ellipse(280,180,dot,dot);
                text("District 12", 290+dist,190);

                ellipse(250,100,dot,dot);
                text("District 6", 260+dist,110);

                ellipse(251,130,dot,dot);
                text("District 3", 261+dist,140);

                popMatrix();

            }
            // when clock button is clicked.
            else if(set == 3)
            {

            }
            
        }

  
     
  // }

    public void mousePressed()
    {
        // start 
        if(mouseX > 669 && mouseX < 768 && mouseY > 448 && mouseY < 550)
        {
            set = 1;
        }

        // for(int i =0; i < buttons.size();i++)
        // {
        //     Button b = buttons.get(i);
        //     if(dist(mouseX,mouseY,b.getX(),b.getY()) < (b.getWidth())/2)
        //     {
        //         draw = true;
        //     }
        // }

        // map
        if(mouseX > 249 && mouseX < 350 && mouseY > 152 && mouseY < 251)
        {
            set = 2;
        }

        





    }
}
