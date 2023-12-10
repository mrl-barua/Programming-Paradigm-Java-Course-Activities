
package quiz2_barua;


public class Restaurant
{
    private String restauName;
    private String restauLoc;
    private int restauShares;
    private int restauUnits;

    
  public Restaurant(String opt) 
    {     
    restauName = opt;
    }

   public Restaurant()
    {      
    }
    public String getName()
    {
        return restauName;
    }
    public void setName(String name)
    {
    restauName = name;   
    }
    public String getLoc()
    {
        return restauLoc;
    }
    public void setLoc(String Loc)
    {
    restauLoc = Loc;   
    }    
    public int getShare()
    {
        return restauShares;
    }
    public void setShares(int shares)
    {
    restauShares = shares;   
    }    
    public int getUnits()
    {
        return restauUnits;
    }
    public void setUnits(int units)
    {
    restauUnits = units;   
    }    

}
