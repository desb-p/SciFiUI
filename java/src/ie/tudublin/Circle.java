package ie.tudublin;

import processing.core.PApplet;

public class Circle extends UIElement

{
private  int CircleX = 700;
private  int CircleY = 550;

    int rotate = 1;
    int rotate2 = 1;
    int rotate3 = 1;

    //PApplet ui;

    // public Circle (float x, float y,int circleX, int circleY, PApplet UI)
    public Circle (float x, float y, PApplet UI)
    {
        super(x, y, UI);
        // this.CircleX = circleX;
        // this.CircleY= circleY;
        
    }

    // public Circle (float x, float y, PApplet UI)
    // {
    //     super(x, y, UI);
    //     //this.CircleX = circleX;
    //     //this.CircleY= circleY;
    // }

    public void render()
    {
        
    rotate = rotate + 1;
    rotate2 = rotate + 2;
    rotate3  = rotate + 3;
    
    ui.noStroke();
    ui.fill(50);
    ui.ellipse(x, y, 100, 100);

    ui.fill(255);
    ui.text("Start", x - 15, y + 10);

    ui.noFill();
    ui.strokeWeight(4);
    ui.stroke(0, 200, 255);
    ui.arc(x, y, 120, 120, ui.radians(rotate), ui.radians(rotate + 180));

    ui.stroke(0, 0, 255);
    ui.arc(x, y, 180, 180, ui.radians(rotate3), ui.radians(rotate3 + 300));

    ui.stroke(255, 0, 0);
    ui.arc(x, y, 210, 210, ui.radians(-rotate2), ui.radians(-rotate2 + 280));
  
    }
}