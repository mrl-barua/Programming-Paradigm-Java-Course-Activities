
package convert;

import java.util.Scanner;

public class Convert
{

  
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner (System.in);
        double pounds, kilos;
        
        System.out.println(" How much pounds would you like to convert: ");
        pounds = keyboard.nextDouble();
        pounds = pounds / 2.2;
        kilos = pounds;
       System.out.print("The value will be = " +kilos);
       System.out.println("kg");
    }
}
