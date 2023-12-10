
package swapattempt;

import java.util.Scanner;

public class SwapAttempt
{  
    public static void main(String[] args) 
    {
       Scanner keyboard = new Scanner (System.in);
       int x, y, finalX, finalY;
       System.out.print("Enter value for x "); 
       x = keyboard.nextInt(); 
       System.out.print("Enter value for y "); 
       y = keyboard.nextInt();
       
       finalX = y;
       finalY = x;
       System.out.println("x = " + finalX);
       System.out.println("y = " + finalY);       
    }
    
}

