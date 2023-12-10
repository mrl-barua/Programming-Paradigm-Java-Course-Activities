
package javaapplication25;

import java.util.Scanner;
public class JavaApplication25 {

   
    public static void main(String[] args) {
     
        Scanner keyboard = new Scanner (System.in);
        char group;
        
        System.out.println("Enter your group (A,B,C)");
        group = keyboard.next().charAt(0);
        
        if (group == 'A')
        {
            System.out.println("Your schedule is at 10:00 am");
        }
        else if (group == 'B')
        {
            System.out.println("Your schedule is at 10:30 am");
        }
        else if (group == 'C' )
        {
            System.out.println("Your schedule is at 11:00 am");
        }
        else
        {
            System.out.println("There is no such group");
        }       
    }
    
}
