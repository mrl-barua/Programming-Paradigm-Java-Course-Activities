
package findcost3;

import java.util.Scanner;

public class Findcost3 
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner (System.in);
        double price, tax;
        System.out.println("*** Product Price Check ***");
        System.out.print("Enter initial price: ");
        price = keyboard.nextDouble();
        System.out.print("Enter tax rate: ");
        tax = keyboard.nextDouble(); 
        price = price * (1 + tax/100); 
        System.out.println("Cost after tax = " + price);       
    }
    
}
