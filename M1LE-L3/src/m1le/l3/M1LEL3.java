
package m1le.l3;
import java.util.Scanner;
public class M1LEL3 
{
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
         case 'A': case 'a': case 'C': case 'c': 
         if (money >= 250)
                  {
                   interest = money * (1.5/100);
                  }
         else
                  {
                   System.out.println("Did not reach the minimum value, please try again");
                  }
         break;
         case 'B': case 'b':
         if (money >= 1000)
                  {
                   interest = money * (2.0/ 100);
                  }
         else
                  {
                   System.out.println("DId not reach the minimum value, please try again");
                  }
         break;
         case 'X': case 'x':
         if (money >=5000)    
                  { 
                    interest = money * (5.0/ 100);  
                  }
         else
                  {
                   System.out.println("Did not reach the minimum value, please try again");
                  }
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
