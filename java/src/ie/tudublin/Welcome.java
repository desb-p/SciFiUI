package ie.tudublin;


import processing.data.TableRow;

public class Welcome
{

    private String name;
    
    public Welcome(TableRow row)
    {
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


}