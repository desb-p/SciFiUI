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

                // button1.render();

            }
            // when clock button is clicked.
            else if(set == 3)
            {
               
                
                int hr = hour();
                int min = minute();
                int sec = second();

                int ClockX = width - 805;
                int ClockY = 450;

                float hourR;
                float minutesR;
                float secondR;
                
                int c = color(200, 130, 220);
                
                String hour_display = nf(hr,2);
                String min_display = nf(min,2);
                String sec_display = nf(sec,2);

                
                int radius = min(width, height) / 2;
                hourR = (float) (radius * 0.35);
                secondR = (float)(radius * 0.4);
                minutesR = (float)(radius * 0.35);
               
                
                
                
                //outer circle
                stroke(204,0,102);
                noFill();
            
                arc(ClockX, ClockY, 100, 100, 0, 2 * PI);

                // inner circle
                stroke(102, 0, 102);
                strokeWeight(5);
                arc(ClockX, ClockY, 120, 120, 0, 2 * PI);

                // small right arc
                stroke(133, 133, 173);
                strokeWeight(5);
                arc(ClockX, ClockY, 125, 125, radians(20), radians(40));

                // smaller bottom arc
                stroke(120, 115, 120);
                strokeWeight(5);
                arc(ClockX, ClockY, 135, 135, radians(50), radians(95));

                // left arc
                stroke(255, 255, 255);
                strokeWeight(5);
                arc(ClockX, ClockY, 135, 135, radians(105), radians(260));

                // biggest arc
                stroke(190, 200, 200);
                strokeWeight(5);
                arc(ClockX, ClockY, 150, 150, radians(60), radians(360));

                float s = map(second(), 0, 60, 0, TWO_PI) - HALF_PI;;
                float m = map(minute() + norm(second(), 0, 60), 0, 60, 0, TWO_PI) - HALF_PI;
                float h = map(hour() + norm(minute(), 0, 60), 0, 24, 0, TWO_PI * 2) - HALF_PI;


                // seconds 
                stroke(c);
                strokeWeight(1);
                line(ClockX, ClockY, ClockX + cos(s) * secondR, ClockY + sin(s) * secondR);

                strokeWeight(2);
                line(ClockX, ClockY, ClockX + cos(m) * minutesR, ClockY + sin(m) * minutesR);
 
                strokeWeight(4);
                line(ClockX, ClockY, ClockX + cos(h) * hourR, ClockY + sin(h) * hourR);
                
                // minutes 
                beginShape(POINTS);
                for (int i = 0; i < 360; i = i + 6) 
                {
                  float a = radians(i);
                  float x = ClockX + cos(a) * secondR;
                  float y = ClockY + sin(a) * secondR;
                  vertex(x, y);
                }
            
                endShape();
                
                
                textSize(14);
                
                text(hour_display+":" + min_display + ":" + sec_display, ClockX-10, ClockY+5);
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

        // clock
        if(mouseX > 249 && mouseX < 350 && mouseY > 652 && mouseY < 753)
        {
            set = 3;
        }

        
       

        





    }
}
