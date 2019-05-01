package ie.tudublin;

import processing.core.PApplet;
import processing.data.TableRow;

public class District2
{
    private String districtTwo;
    private int CX;
    private int CY;
    PApplet UI;

    public District2(TableRow row)
    {
        this.districtTwo = row.getString("District2");
        this.CX = row.getInt("CX");
        this.CY = row.getInt("CY");
    }

    /**
     * @return the districtTwo
     */
    public String getDistrictTwo() {
        return districtTwo;
    }

    /**
     * @param districtTwo the districtTwo to set
     */
    public void setDistrictTwo(String districtTwo) {
        this.districtTwo = districtTwo;
    }

    /**
     * @return the cX
     */
    public int getCX() {
        return CX;
    }

    /**
     * @param cX the cX to set
     */
    public void setCX(int cX) {
        CX = cX;
    }

    /**
     * @return the cY
     */
    public int getCY() {
        return CY;
    }

    /**
     * @param cY the cY to set
     */
    public void setCY(int cY) {
        CY = cY;
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

}



