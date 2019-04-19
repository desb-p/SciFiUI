package ie.tudublin;


import processing.core.PImage;

public class Map 
{

    UI ui;
    float x;
    float y;
    float width;
    float height;

    private PImage panem;

    public Map(UI ui, float x, float y,float width,float height,PImage Panem)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.panem = panem;
    }
    public void render()
    {
        
        ui.image(panem, x, y, width,height );
        

    }
}
