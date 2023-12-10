
package cinematicket;

import java.util.Scanner;
public class CinemaTicket{

    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner (System.in);
        
        int x;
        
        System.out.println("Enter a number: ");
        x = keyboard.nextInt();
        
        switch (x)
        {
            case 1: case 2: System.out.println("Green"); break;
            case 3: case 4: System.out.println("Blue"); break;
            default: System.out.println("Red");
        }
    }
    
}

 
