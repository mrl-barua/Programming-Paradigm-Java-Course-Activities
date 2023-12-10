
package circle;

import java.util.Scanner;

public class Circle 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner (System.in);
        double radius , circumference, area;
        final double PI = 3.1416;
        int choose;
        radius = 0;
   
        
      do{ 
        
        System.out.println();
        System.out.println("[1] Set redius");
        System.out.println("[2] Display radius");
        System.out.println("[3] Display area");
        System.out.println("[4] Display perimeter");
        System.out.println("[5] Quit");
        
       System.out.println();
       System.out.println("Please select a number from the list");
       choose = keyboard.nextInt();
       System.out.println();
       
       while(choose <1 || choose >6)
       {
           System.out.println("Choose a nuumber from 1-6 only");
           choose = keyboard.nextInt();
           System.out.println();
       }
       switch(choose)
       {    
           case 1:  System.out.println("Input the radius of the circle: ");
                    radius = keyboard.nextDouble();
                       while(radius < 0)
                           {
                             System.out.println("Input positive number only");
                             radius =  keyboard.nextInt();
                           }
                break;
            case 2: System.out.println("The radius of the circle is " +radius);
                break;
            case 3: area = PI * (radius * radius);
                    System.out.println("The area of the circle is " +area);
                break;    
            case 4: circumference = 2 * PI * radius;  
                    System.out.println("The perimeter of the circle is " +circumference);
                break;
            default: System.out.println("Thank you for using the program");    
       }
      }while ( choose != 5);
      
    }   
}
