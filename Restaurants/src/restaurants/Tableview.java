
package restaurants;


public class Tableview {
    private String id;
    private String name;
    private String location;
    private String shares;
    private String units;

    public Tableview(String id, String name, String location, String shares, String units) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.shares = shares;
        this.units = units;
    }



    
    public void setId(String id, String name, String location, String shares, String units) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.shares = shares;
        this.units = units;
    }
 

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getShares() {
        return shares;
    }

    public String getUnits() {
        return units;
    }
    
    
}
