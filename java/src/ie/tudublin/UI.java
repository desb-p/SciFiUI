package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.core.PImage;
import processing.data.Table;
import processing.data.TableRow;
import ddf.minim.AudioInput;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;



public class UI extends PApplet
{

    ArrayList<Welcome> WelcomeMsg = new ArrayList<Welcome>();
    ArrayList<Map> M  = new ArrayList<Map>();
    //ArrayList<Map> District1 = new ArrayList<Map>();
    ArrayList<District> districts = new ArrayList<District>();
    ArrayList<DistrictInfo> D1 = new ArrayList<DistrictInfo>();
    


    Button startButton;

    Button button1;
    Button button2;
    Button button3;
    Button button4; 

   
    PImage Mockingjay;
    PImage Panem;
    PImage weapon1;
    PImage weapon2;
    PImage weapon3;
    PImage weapon4;
    PImage weapon5;
    
    
    Circle c;
    Grid g;
    Weapons weapon;
    Welcome welcome;

    Map district1;
 
  
    String[] weapons = 
    {
        "axe.png", 
        "bowarrow.png",
        "spear.png",
        "sword.png",
        "trident.png"

    };

    String[] childWeapons = 
    {
        "axe.png", 
        "bowarrow.png",
        "spear.png",
        "sword.png",
        "trident.png"
    };

    // description of the weapons 
    String[] weaponDesc = 
    {
        "Axe : Use to shape and cut wood.",
        "Bow and Arrow : Most common weapon used. ",
        "Spear : May be sharpened or head of spear maybe be used for other materials such as stone, bone, metal.",
        "Sword : For cutting or thrusting.",
        "Trident : Can also be used for spear fishing.",
    };

    PImage[] images = new PImage[weapons.length];
    PImage[] childImages = new PImage[childWeapons.length];
    int startTime;
    int passedTime;
    int waitTime;

    int index = 0;

    int currImage = 0;
    boolean showChildImg;
  

    int set = 0;
    boolean draw = false;
    boolean hover = false;

    // sound.
    AudioPlayer whistle;
    Minim minim;
    AudioInput ai;


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
        button2 = new Button(this, 1000, 200, 100, 50, "Weapons");
        button3 = new Button(this, 300, 700, 100,50,  "Clock");
        button4 = new Button(this, 1000, 700, 100, 50, "Exit");
        
      
        // Loading Images

        Mockingjay = loadImage("mockingjay.jpeg");
        Panem = loadImage("map2.png");
        

        for(int i = 0; i < weapons.length; i++)
        {
            images[i] = loadImage(weapons[i]);
            childImages[i] = loadImage(childWeapons[i]);

        }

        
        showChildImg = false;

        
        startTime = millis();
        passedTime = 0;
        waitTime = 3000;
    
        c = new Circle(width/2, 500, this);
        g = new Grid(this, width/2,500, width, height);
       
       
        //hover = false;

        loadWelcomeMessage();

        // sound
        minim = new Minim(this);
        whistle = minim.loadFile("whistle.mp3");

        loadDistricts();
        loadDistrict1();
       

    }

    public void Clock()
    {
            int hr = hour();
            int min = minute();
            int sec = second();

            int ClockX = width - 805;
            int ClockY = 440;
            
            float hourR;
            float minutesR;
            float secondR;
            
            //int c = color(200, 130, 220);
            
            String hour_display = nf(hr,2);
            String min_display = nf(min,2);
            String sec_display = nf(sec,2);

            
            
            int radius = min(width,height)/2;
            secondR = (float) (radius * 0.35);
            minutesR = (float) (radius * 0.35);
            hourR = (float) (radius * 0.25);
           
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

            // // smaller bottom arc
            stroke(120, 115, 120);
            strokeWeight(5);
            arc(ClockX, ClockY, 135, 135, radians(50), radians(95));

            // // left arc
            stroke(255, 255, 255);
            strokeWeight(5);
            arc(ClockX, ClockY, 135, 135, radians(105), radians(260));

            // // biggest arc
            stroke(190, 200, 200);
            strokeWeight(5);
            arc(ClockX, ClockY, 150, 150, radians(60), radians(360));

            // // Angles for sin() and cos() start at 3 o'clock;
            // // subtract HALF_PI to make them start at the top
            float s = map(second(), 0, 60, 0, TWO_PI) - HALF_PI;;
            float m = map(minute() + norm(second(), 0, 60), 0, 60, 0, TWO_PI) - HALF_PI; 
            float h = map(hour() + norm(minute(), 0, 60), 0, 24, 0, TWO_PI * 2) - HALF_PI;

            
            // // seconds of clock
            // stroke(255);
            strokeWeight(1);
            line(ClockX, ClockY, ClockX + cos(s) * secondR, ClockY + sin(s) * secondR);

            strokeWeight(2); 
            line(ClockX, ClockY, ClockX + cos(m) * minutesR, ClockY + sin(m) * minutesR);

            strokeWeight(4);
            line(ClockX, ClockY, ClockX + cos(h) * hourR, ClockY + sin(h) * hourR);
            
            strokeWeight(3);

            // minutes of clock - outline of clock shape
            beginShape(POINTS);
            for (int a = 0; a < 360; a = a + 6) 
            {
              float angle = radians(a);
              float x = ClockX + cos(angle) * secondR;
              float y = ClockY + sin(angle) * secondR;
              vertex(x, y);
            }
            endShape();
            
            textSize(14);
            fill(255);
            text(hour_display+":" + min_display + ":" + sec_display, ClockX - 6, ClockY + 6);

            if(keyPressed)
            {
                if(key == 'b' || key == 'B')
                {
                    set = 1;
                }
            }
    }


        public void loadWelcomeMessage()
        {
            //int welcome_index = 0;

            Table table = loadTable("welcome.csv", "header");
            for(TableRow row : table.rows())
            {
                Welcome msg = new Welcome(row);
                WelcomeMsg.add(msg);

            }

        }

        float wx = 0;

        public void drawWelcomeMessage()
        {
        
            for(Welcome msg : WelcomeMsg)
            {
                noFill();
                stroke(255);
                fill(random(0,255), random(0,255), random(0,255));
                textSize(15);
                text(msg.getName(),wx,850);
                noFill();
                noStroke();

            }
            wx+=5;
                if (wx > width + 100)
                {
                    wx = 0;
                }
          
        }

        public void loadDistricts()
        {
            Table table = loadTable("info.csv", "header");
            for(TableRow row : table.rows())
            {
                District dist = new District(row);
                District lX = new District(row);
                District lY = new District(row);
                districts.add(dist);
                districts.add(lX);
                districts.add(lY);
                
            }
        }

       int dist = 7;
        public void drawDistricts()
        {
            for(District d: districts)
            {
                noFill();
                stroke(255,128,128);
                fill(255);
                
                textSize(15);
               
                text(d.getDistrict(),d.getLocationX(),d.getLocationY());
                ellipse(d.getLocationX(),d.getLocationY(),7,7);

                
            
                
                noFill();
                noStroke();
            }
        }

        public void loadDistrict1()
        {
            Table table = loadTable("district1.csv", "header");
            for(TableRow row : table.rows())
            {
                DistrictInfo district1 = new DistrictInfo(row);
                DistrictInfo X = new DistrictInfo(row);
                DistrictInfo Y = new DistrictInfo(row);
                D1.add(district1);
                D1.add(X);
                D1.add(Y);
            

            }
        }

        public void drawDistrict1()
        {
            for(DistrictInfo distr1 : D1)
            {
                noFill();
                stroke(255);
                fill(255);
                textSize(15);
                //text(distr1.getDistrictOne(),0, height/2);
                if(distr1.hover)
                {

                    strokeWeight(3);
                    stroke(77,255,166);
                    //rect(distr1.getCoordX() - 240, distr1.getCoordY() - 50, 106, 106, 10;

                    //district 1
                 if (distr1.getCoordX() == 590) 
          
                {
                    
                    //text(distr1.getDistrictOne(),320,367,100,100);
                    textSize(10);
                    text(distr1.getDistrictOne(),distr1.getCoordX(),distr1.getCoordY(),100,100);
                    
                    ellipse(distr1.getCoordX(),distr1.getCoordY(),7,7);
                }
                
                //district 2
                 else if(distr1.getCoordX() == 662)
                {
                    textSize(8);
                    text(distr1.getDistrictOne(),distr1.getCoordX(),distr1.getCoordY(),100,100);
                    ellipse(distr1.getCoordX(),distr1.getCoordY(),7,7);
                }
                
                //district 3
                else if(distr1.getCoordX() == 738)
                {
                    textSize(8);
                    text(distr1.getDistrictOne(),distr1.getCoordX(),distr1.getCoordY(),100,100);
                    ellipse(distr1.getCoordX(),distr1.getCoordY(),7,7);
                }

                //district4
                else if(distr1.getCoordX() == 538)
                {
                    textSize(8);
                    text(distr1.getDistrictOne(),distr1.getCoordX(),distr1.getCoordY(),100,100);
                    ellipse(distr1.getCoordX(),distr1.getCoordY(),7,7);
                }

                //district5
                else if(distr1.getCoordX() == 551)
                {
                    textSize(8);
                    text(distr1.getDistrictOne(),distr1.getCoordX(),distr1.getCoordY(),100,100);
                    ellipse(distr1.getCoordX(),distr1.getCoordY(),7,7);
                }

                //district6
                else if(distr1.getCoordX() == 712)
                {
                    textSize(8);
                    text(distr1.getDistrictOne(),distr1.getCoordX(),distr1.getCoordY(),100,100);
                    ellipse(distr1.getCoordX(),distr1.getCoordY(),7,7);
                }

                //district7
                else if(distr1.getCoordX() == 579)
                {
                    textSize(8);
                    text(distr1.getDistrictOne(),distr1.getCoordX(),distr1.getCoordY(),100,100);
                    ellipse(distr1.getCoordX(),distr1.getCoordY(),7,7);
                }

                //district8
                else if(distr1.getCoordX() == 787)
                {
                    textSize(8);
                    text(distr1.getDistrictOne(),distr1.getCoordX(),distr1.getCoordY(),100,100);
                    ellipse(distr1.getCoordX(),distr1.getCoordY(),7,7);
                }

                //district9
                else if(distr1.getCoordX() == 660)
                {
                    textSize(8);
                    text(distr1.getDistrictOne(),distr1.getCoordX(),distr1.getCoordY(),100,100);
                    ellipse(distr1.getCoordX(),distr1.getCoordY(),7,7);
                }

                //district10
                else if(distr1.getCoordX() == 643)
                {
                    textSize(8);
                    text(distr1.getDistrictOne(),distr1.getCoordX(),distr1.getCoordY(),100,100);
                    ellipse(distr1.getCoordX(),distr1.getCoordY(),7,7);
                }

                //district11
                else if(distr1.getCoordX() == 748)
                {
                    textSize(8);
                    text(distr1.getDistrictOne(),distr1.getCoordX(),distr1.getCoordY(),100,100);
                    ellipse(distr1.getCoordX(),distr1.getCoordY(),7,7);
                }

                //district12

                else if(distr1.getCoordX() == 809)
                {
                    textSize(8);
                    text(distr1.getDistrictOne(),distr1.getCoordX(),distr1.getCoordY(),60,100);
                    ellipse(distr1.getCoordX(),distr1.getCoordY(),7,7);
                }

                //capitol
                else if(distr1.getCoordX() == 619)
                {
                    textSize(8);
                    text(distr1.getDistrictOne(),distr1.getCoordX(),distr1.getCoordY(),100,100);
                    ellipse(distr1.getCoordX(),distr1.getCoordY(),7,7);
                }

                }

                // noFill();
                // noStroke();
                
               
            }

    
        }

        

    public void draw()
    {
        //println(mouseX,mouseY);

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
            c.render(); // draws Circle
            

            // stroke(255);
            // line(100,100,mouseX, mouseY);
            // println(mouseX, mouseY);

        
        }
        
        // buttons page.
        else if (set == 1)
        {
            whistle.play();

            background(0);
            //background(255,255,230);
            stroke(255,128,128);
           

                fill(255);
                button1.render();
                button2.render();
                button3.render();
                button4.render();

                stroke(255);
                g.render(); // Draws grid.

                 //Statistics Graph
                float x = 800;
                float y = 300;

               
                line(x+340,40,x+340,260);
                line(x+340,260, x+560, 260);
                text("Kill Rate Statistics", x+450, 280);
                
                text("80%",x+380,70);

                line(x+360,70,x+380,200); // move left, length down, move right,length up
                ellipse(x+360,70,4,4); // position of dot, length, size of dot(x and y)
                
                line(x+380,200,x+410,90);
                ellipse(x+380,200,4,4);
                text("20%", x+400, 200);

                text("75%",x+430,90);
                line(x+410,90,x+425,230);
                ellipse(x+410,90,4,4);


                line(x+425,230,x+440,170);
                ellipse(x+425,230,4,4);
                text("10%", x+440, 230);

                line(x+440,170, x+470, 140);
                ellipse(x+440, 170, 4,4);
                text("40%", x+460, 170);

                line(x+470,140,x+520,215);
                ellipse(x+470,140,4,4);
                text("50%",x+490,140);

                line(x+520,215,x+540,60);
                ellipse(x+520,215,4,4);
                text("15%",x+540,215);
                ellipse(x+540,60,4,4);
                text("90%",x+560,60);



                for(int w = 0; w < WelcomeMsg.size(); w++)
                {
                     drawWelcomeMessage();
                }

        

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
            //noFill();
            text("PANEM",x2-30,240);
            stroke(255,0,0);

            drawDistricts();

            for(int i = 0; i <D1.size(); i++)
            {
                D1.get(i).hover(mouseX,mouseY);
            }

            for(int i = 0; i <D1.size(); i++)
            {
                drawDistrict1();
            }

        }


            // when clock button is clicked.
        else if(set == 3)
        {
               
            background(0);
            Clock();

            if(keyPressed)
            {
                if(key == 'b' || key == 'B')
                {
                        set = 1;
                }
            }
                
        }
            // weapons
        else if (set == 4)
        {
            background(0);

            if (!showChildImg) 
            {
                image(images[currImage], width/2-250, height/2-200, 400, 400);
                text(weaponDesc[index],600,700);
            }
            else 
            {
                image(childImages[currImage], width/2-250, height/2-200, 400, 400);
                text(weaponDesc[index],600,700);
            }
            
            //text(weaponDesc[index],600,700);
            passedTime = millis() - startTime;

            if (passedTime > waitTime) 
            {
                currImage++;
                index++;
                showChildImg = false;
                startTime = millis();
            }


            if (currImage>weapons.length-1)
            {
                currImage = 0;
            }

            if(index > weaponDesc.length-1)
            {
                index = 0;
            }

            if(keyPressed)
            {
                if(key == 'b' || key == 'B')
                {
                    set = 1;
                }
            }
               
           
        }
    }
            


	public void mousePressed()
    {
        // press start 
        if(mouseX > 669 && mouseX < 768 && mouseY > 448 && mouseY < 550)
        {
            set = 1;
            
        }

        // press map
        else if(mouseX > 249 && mouseX < 350 && mouseY > 152 && mouseY < 251)
        {
            set = 2;

            
            
        }

        // press clock
        else if(mouseX > 249 && mouseX < 350 && mouseY > 652 && mouseY < 753)
        {
            set = 3;
        }

        // press weapons
       else if(mouseX > 949 && mouseX < 1050 && mouseY > 152 && mouseY < 252)
       {
           set = 4;
           showChildImg = true;
       }

       //press exit 
       else if(mouseX > 950 && mouseX < 1050 && mouseY > 652 && mouseY < 753)
       {
           set = 0;
       }

    }

            



}
