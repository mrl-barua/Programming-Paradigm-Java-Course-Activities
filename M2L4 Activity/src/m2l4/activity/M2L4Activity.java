
package m2l4.activity;

import java.util.*;
public class M2L4Activity {

    public static void main(String[] args) {
        
   ArrayList<Oblong> rooms = new ArrayList<>();
   
   rooms.add(new Oblong(4.7, 5.2));
   rooms.add(new Oblong(5.2, 5.7));
   rooms.add(new Oblong(8.1, 5.0));
   
   System.out.println(rooms.get(2).calculateArea());// the code to display the room no. 3
   
   
        
    }
    
}


class Oblong {

    // the attributes
    private double length;
    private double height;

    // the methods
    // the constructor
    public Oblong(double lengthIn, double heightIn) {
        length = lengthIn;
        height = heightIn;
    }

    // this method allows us to read the length attribute
    public double getLength() {
        return length;
    }

    // this method allows us to read the height attribute
    public double getHeight() {
        return height;
    }

    // this method allows us to write to the length attribute
    public void setLength(double lengthIn) {
        length = lengthIn;
    }

    // this method allows us to write to the height attribute
    public void setHeight(double heightIn) {
        height = heightIn;
    }

    // this method returns the area of the Oblong
    public double calculateArea() {
        return length * height;
    }

    // this method returns the perimeter of the Oblong
    public double calculatePerimeter() {
        return 2 * (length + height);
    }

}



