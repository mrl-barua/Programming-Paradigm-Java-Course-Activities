
package practice101;

import java.util.Scanner;


public class Practice101 {

    
    public static void main(String[] args) 
    {
     Scanner keyboard = new Scanner (System.in);
     int year, month, date;
     
     System.out.println("What year you are born");
     theMessage();
     year = keyboard.nextInt();
     
     System.out.println();
     
     System.out.println("What month you are born");
     theMessage();
     month = keyboard.nextInt();
     System.out.println();
     
     System.out.println("Ehat day you are born");
     theMessage();
     date = keyboard.nextInt();
     System.out.println();
     
    
     
        
        
    }
     static void theMessage()
     {
         System.out.println("TRIAL TRIAL TRIAL");
     }
    
}

