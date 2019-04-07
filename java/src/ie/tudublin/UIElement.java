
package ie.tudublin;


import processing.core.PApplet;;

public abstract class UIElement
{
    protected float x;
    protected float y;
    protected PApplet UI;

// constructor 
public UIElement(float x, float y, PApplet UI)
{
    this.x = x;
    this.y = y;
    this.UI = UI;
}

public abstract void render();
{

}


}