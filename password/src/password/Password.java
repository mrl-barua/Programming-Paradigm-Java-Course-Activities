
package password;

import java.util.Scanner;

public class Password 
{

 
    public static void main(String[] args)
    {
       Scanner keyboard = new Scanner (System.in);
       
      
   String A = "A";
   String B;
   boolean guessed = false;
   
   System.out.println("Password: ");
   B = keyboard.nextLine();
    
   while (B != A)
   {
       System.out.println("Repeat again");
       B = keyboard.nextLine();
  
   }
   
   System.out.println("congrats");
   
      

      
    }
    
}
