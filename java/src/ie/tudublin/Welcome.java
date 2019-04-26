package ie.tudublin;

import processing.core.PApplet;
import processing.data.TableRow;

public class Welcome
{
    // private float width;
    // PApplet UI;

    private String name;

    // float x = width - 280;

    //public void Button(PApplet UI, float width, float x)
    public Welcome(TableRow row)
    {
    // // this.UI = row.getString("Facts:");
    //  this.width = width;
    //  this.x = x;
    this.name = row.getString("Name");

    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    // public void render()
    // {
    //     UI.fill(180);

        
    // }
}