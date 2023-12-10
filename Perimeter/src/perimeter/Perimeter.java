
package perimeter;

import java.util.Scanner;

public class Perimeter
{
     public static void main(String[] args)
    {
        Scanner keyboard = new  Scanner (System.in);
        double length, width, perimeter;
        
        System.out.println("Enter the length of the rectangle: ");
        length = keyboard.nextDouble();
        
        System.out.println("Enter the width of the rectangle");
        width= keyboard.nextDouble();
        
        perimeter = (length  + width) *  2;
        System.out.println("The perimeter of the rectangle is " +perimeter);        
    }
    
}
