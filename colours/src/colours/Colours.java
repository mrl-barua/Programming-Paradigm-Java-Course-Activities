
package colours;

import java.util.Scanner;

public class Colours
{

    
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner (System.in);
        int x;
        
        System.out.println("Enter a number: ");
        x = keyboard.nextInt();
        
        if (x > 10)
        {
            System.out.println("Green");
        }
        else 
        {
            System.out.println("Blue");
        }
        System.out.println("Red");
            
                
                
                
                
    }
    
}
