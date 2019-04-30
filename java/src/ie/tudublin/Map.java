package ie.tudublin;


import processing.core.PImage;

public class Map 
{

    UI ui;
    float x;
    float y;
    float width;
    float height;
    float posX;
    float posY;

    boolean hover = false;

    private PImage panem;

    public Map(UI ui, float x, float y,float width,float height,PImage Panem,float posX, float posY)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.panem = panem;
        this.posX = posX;
        this.posY = posY;
        
    }
    public void render()
    {
        
        ui.image(panem, x, y, width,height );

        
       
    }

    public void hover(float posX, float posY)
    {
        float d = ui.dist(x,y,posX,posY);

        if(d < 10/2)
        {
            hover = true;
        }

        else 
        {
            hover = false;
        }

    }

    /**
     * @return the ui
     */
    public UI getUi() {
        return ui;
    }

    /**
     * @param ui the ui to set
     */
    public void setUi(UI ui) {
        this.ui = ui;
    }

    /**
     * @return the x
     */
    public float getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public float getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * @return the width
     */
    public float getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(float width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * @return the posX
     */
    public float getPosX() {
        return posX;
    }

    /**
     * @param posX the posX to set
     */
    public void setPosX(float posX) {
        this.posX = posX;
    }

    /**
     * @return the posY
     */
    public float getPosY() {
        return posY;
    }

    /**
     * @param posY the posY to set
     */
    public void setPosY(float posY) {
        this.posY = posY;
    }

    /**
     * @return the hover
     */
    public boolean isHover() {
        return hover;
    }

    /**
     * @param hover the hover to set
     */
    public void setHover(boolean hover) {
        this.hover = hover;
    }

    /**
     * @return the panem
     */
    public PImage getPanem() {
        return panem;
    }

    /**
     * @param panem the panem to set
     */
    public void setPanem(PImage panem) {
        this.panem = panem;
    }
}
