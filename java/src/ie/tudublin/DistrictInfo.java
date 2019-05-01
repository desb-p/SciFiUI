package ie.tudublin;

import processing.core.PApplet;
import processing.data.TableRow;

public class DistrictInfo
{
    
    private float CoordX;
    private float CoordY;
    private String districtOne;
    PApplet UI;


boolean hover = false;

    public DistrictInfo(TableRow row)
    {
        
        this.CoordX = row.getFloat("CoordX");
        this.CoordY = row.getFloat("CoordY");
        this.districtOne = row.getString("District1");
    }

    public String toString()
    {
        return CoordX + "\t" + CoordY + "\t" + districtOne;

    }

    public void hover(float x,float y)
    {
        float d = UI.dist(CoordX,CoordY,x,y);
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
     * @return the coordX
     */
    public float getCoordX() {
        return CoordX;
    }

    /**
     * @param coordX the coordX to set
     */
    public void setCoordX(float coordX) {
        CoordX = coordX;
    }

    /**
     * @return the coordY
     */
    public float getCoordY() {
        return CoordY;
    }

    /**
     * @param coordY the coordY to set
     */
    public void setCoordY(float coordY) {
        CoordY = coordY;
    }

    /**
     * @return the districtOne
     */
    public String getDistrictOne() {
        return districtOne;
    }

    /**
     * @param districtOne the districtOne to set
     */
    public void setDistrictOne(String districtOne) {
        this.districtOne = districtOne;
    }

    /**
     * @return the uI
     */
    public PApplet getUI() {
        return UI;
    }

    /**
     * @param uI the uI to set
     */
    public void setUI(PApplet uI) {
        UI = uI;
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

   
}

