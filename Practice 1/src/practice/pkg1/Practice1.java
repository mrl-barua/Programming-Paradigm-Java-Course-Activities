
package practice.pkg1;

import java.util.Scanner;

public class Practice1 
{
   public static void main(String[] args)
   {
       Scanner keyboard = new Scanner (System.in);
     int temperature;
        
   System.out.println("What is the temperature today:");
      temperature = keyboard.nextInt();
      
      if (temperature == 37)
          
      {
          System.out.println("The temperature is normal");
      }
      else if (temperature < 37)
      {
          System.out.println("The temperature is below normal");
      }
      else if (temperature > 37)
      {
          System.out.println("The temperature is above normal");
      }
    }
    
}
