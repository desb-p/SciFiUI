package ie.tudublin;

import java.util.ArrayList;

//import javafx.scene.shape.Circle;
import processing.core.PApplet;
import processing.core.PImage;

public class UI extends PApplet
{
    Button startButton;
    // Button button1;
    // Button button2;
    // Button button3;
    // Button button4; 

    ArrayList<Button>buttons = new ArrayList<>();

    PImage Mockingjay;
    PImage Panem;

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

        buttons.add(new Button(this, 300, 200, 100, 50, "Map"));
       // buttons.add(new Button(this, 1000, 200, 100, 50, "Info"));
        //buttons.add(new Button(this, 300, 700, 100,50,  "Weapons"));
        //buttons.add(new Button(this, 1000, 700, 100, 50, "Exit"));

        
      
        // Loading Images

        Mockingjay = loadImage("mockingjay.jpeg");
        Panem = loadImage("map.png");
        
        

        
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

        
        }
        // when buttons are clicked
        else if (set == 1)
        {
            background(0);
            stroke(255,128,128);

            for(Button b: buttons)
            {
                b.render();
            }
            if(draw == true)
            {
                int x2 = width/2;
                int y2 = height/2;
                int dot = 3;
                int dist = 3;
                image(Panem,width/2-200,height/2-200,400,400);
                pushMatrix();
                translate(x2-200,y2-100);

                ellipse(85,5,dot,dot);
                text("District 7", 90+dist,20);

                ellipse(150,20,dot,dot);
                text("District 1", 150+dist,30);

                ellipse(76,45,dot,dot);
                text("District 3", 90+dist,50);

                ellipse(103,90,dot,dot);
                text("District 2", 105+dist,100);

                ellipse(130,130,dot,dot);
                text("District 4", 135+dist,140);

                ellipse(160,100,dot,dot);
                text("District 10", 165+dist,105);
               
                ellipse(160,100,dot,dot);
                text("District 9", 165+dist,105);

               









                popMatrix();
            }


        

        }

  
     
    }

    public void mousePressed()
    {
        if(mouseX > 669 && mouseX < 768 && mouseY > 448 && mouseY < 550)
        {
            set = 1;
        }

        for(int i =0; i < buttons.size();i++)
        {
            Button b = buttons.get(i);
            if(dist(mouseX,mouseY,b.getX(),b.getY()) < (b.getWidth())/2)
            {
                draw = true;
            }
        }


    }
}
