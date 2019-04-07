package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;

public class UI extends PApplet
{
    Button startButton;
    
    PImage Mockingjay;

    boolean b;

    boolean[] keys = new boolean[1024];

    public void keyPressed()
    {
        keys[keyCode] = true;
    }
    
    public void keyReleased()
    {
        keys[keyCode] = false;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }
    

    public void settings()
    {
        //size(800, 800);
        // Use fullscreen instead of size to make your interface fullscreen
        fullScreen();

    }

    public void setup()
    {
       startButton = new Button(this, 50, 100, 100, 50, "Start");
       
       //mc = new MovingCircle(this, width / 2, height * .75f, 50);
        
        Mockingjay = loadImage("mockingjay.jpeg");

    }

    Radar radar;

    public void draw()
    {
        
        background(0);
        fill(0);
        stroke(51,102,255);
        strokeWeight(1);
        rect(30,20, width - 50, height - 50); // x = 30, y = 20.
        rect(40,30, width - 70, height - 70);
        
        image(Mockingjay, 550, 180);
        
        circle();
       
    }

    float circleX = 720;
    float circleY = 500;

    int rotate = 1;
    int rotate2 = 1;
    int rotate3 = 1;

    
// Circle motion.
  void circle()
  {
    
    rotate = rotate + 1;
    rotate2 = rotate + 2;
    rotate3  = rotate + 3;
    
    noStroke();
    fill(50);
    ellipse(circleX,circleY,100,100);

    fill(255);
    text("Start", circleX-15, circleY+10);
  

    noFill();
    strokeWeight(4);
    stroke(0,200,255);
    arc(circleX,circleY,120,120,radians(rotate), radians(rotate + 180));
    
    stroke(0,0,255);
    arc(circleX,circleY,180,180,radians(rotate3),radians(rotate3 + 300));

    stroke(255,0,0);
    arc(circleX,circleY,210,210,radians(-rotate2),radians(-rotate2 + 280));
  

  } 
    

    
}