package ie.tudublin;

//import javafx.scene.shape.Circle;
import processing.core.PApplet;
import processing.core.PImage;

public class UI extends PApplet
{
    Button startButton;
    PImage Mockingjay;
    Boolean press;
    Map map;
    Circle c;


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
        startButton = new Button(this, 50, 100, 100, 50, "Start");
        map = new Map();
        Mockingjay = loadImage("mockingjay.jpeg");
        //cir = new Circle(100,100, 720, 550, this);
        c = new Circle(width/2, 500, this);
        
    }

    

    public void draw()
    {
        
        background(0);
        fill(0);
        stroke(51,102,255);
        strokeWeight(1);
        rect(30,20, width - 50, height - 50); // x = 30, y = 20.
        rect(40,30, width - 70, height - 70);
        image(Mockingjay, 550, 180);
        
        c.render();

        // if(press == true)
        // {
            
        // }
        
    }

  
  
    public void mousePressed()
    {
       
    }
     
}

