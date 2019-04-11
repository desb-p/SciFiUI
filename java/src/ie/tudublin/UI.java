package ie.tudublin;

//import javafx.scene.shape.Circle;
import processing.core.PApplet;
import processing.core.PImage;

public class UI extends PApplet
{
    Button startButton;
    Button button1;
    Button button2;
    Button button3;
    Button button4; 

    PImage Mockingjay;
    PImage Panem;

    Circle c;

    int set = 0;

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

        button1 = new Button(this, 300, 200, 100, 50, "Map");
        button2 = new Button(this, 1000, 200, 100, 50, "Info");
        button3 = new Button(this, 300, 700, 100,50,  "Weapons");
        button4 = new Button(this, 1000, 700, 100, 50, "Exit");

      


        Mockingjay = loadImage("mockingjay.jpeg");
        Panem = loadImage("panem.jpeg");

        
        c = new Circle(width/2, 500, this);

        
    }

    

    public void draw()
    {
        
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
        else if (set == 1)
        {
            background(0);
            stroke(255,128,128);

            button1.render();
            button2.render();
            button3.render();
            button4.render();

           
            
        }

  
     
    }

    public void mousePressed()
    {
        if(mouseX > 669 && mouseX < 768 && mouseY > 448 && mouseY < 550)
        {
            set = 1;
        }
    }
}
