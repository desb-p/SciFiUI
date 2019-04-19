package ie.tudublin;

import processing.core.PApplet;

public class Grid 
{

    private UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    
    private int col = 10;
    private int row = 10;

    public Grid(UI ui, float x, float y,float width,float height)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    
    public void render()

    {
        for(int i = 1; i < col; i++)
        {
            for(int j = 1; j < row; j++)
            {
                ui.fill(255,255,255);
                ui.ellipse(i * (width/col), j * (height/row), 1 , 1);
            }
        }
    }
    
   

}