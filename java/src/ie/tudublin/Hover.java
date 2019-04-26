package ie.tudublin;

import processing.core.PApplet;

public class Hover
{
    private float x,y, diameter;
    private String name;
    PApplet ui;


    boolean hover = false;

    public void rollover(float rx, float ry)
    {
        float d = ui.dist(rx,ry,x,y);

        if(d < diameter /2)
        {
            hover = true;
        }
        else
        {
            hover = false;
        }
        

    }
}