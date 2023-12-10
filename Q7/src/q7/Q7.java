
package q7;

import java.util.Scanner;
public class Q7 {
    public static void main(String[] args)
    {
     Scanner keyboard = new Scanner (System.in);
     char bank;
     double money;
     double interest = 0;
     double total = 0;
     
     System.out.println("How much money would you like to deposit? ");
     money = keyboard.nextDouble();
  
     System.out.println("Please choose an account (A, B, C, X)");
     bank = keyboard.next().charAt(0);
     
     switch (bank)
     {
         case 'A': case 'a': case 'C': case 'c':  interest = money * (1.5/100);
         break;
         case 'B': case 'b': interest = money * (2.0/ 100);
         break;
         case 'X': case 'x': interest = money * (5.0/ 100);  
         break;
         default:
        {
         System.out.println("The bank account you input doesn't exist, please try again");
        }
     }
     total = money + interest;
    System.out.println("By one year, you can earn as much " +total);
    System.out.print("for that given bank account");
    } 
}
