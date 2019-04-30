package ie.tudublin;

import processing.core.PApplet;
import processing.data.TableRow;

public class District
{

    private String district;
    private int locationX;
    private int locationY;
    PApplet UI;

    public District(TableRow row)
    {
        this.district = row.getString("District");
        this.locationX = row.getInt("locationX");
        this.locationY = row.getInt("locationY");
    }

    /**
     * @return the district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * @param district the district to set
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * @return the locationX
     */
    public int getLocationX() {
        return locationX;
    }

    /**
     * @param locationX the locationX to set
     */
    public void setLocationX(int locationX) {
        this.locationX = locationX;
    }

    /**
     * @return the locationY
     */
    public int getLocationY() {
        return locationY;
    }

    /**
     * @param locationY the locationY to set
     */
    public void setLocationY(int locationY) {
        this.locationY = locationY;
    }

    

    

}