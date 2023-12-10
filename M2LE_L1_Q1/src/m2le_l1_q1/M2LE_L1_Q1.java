
package m2le_l1_q1;
import java.util.Scanner;

public class M2LE_L1_Q1 
{ 
    public static void main(String[] args) 
    {     
        Scanner keyboard = new Scanner(System.in);
        double price, tax;
        System.out.println("*** Product Price Check ***");
        System.out.print("Enter initial price: ");
        price = keyboard.nextDouble();
        System.out.print("Enter tax rate: ");
        tax = keyboard.nextDouble();
        price = addTax(price, tax); // call the addTax method
        System.out.println("Cost after tax = " + price);
            }
    static double addTax(double priceIn, double taxIn)
       {
          
           return priceIn * (1 + taxIn/100);
       }
}
