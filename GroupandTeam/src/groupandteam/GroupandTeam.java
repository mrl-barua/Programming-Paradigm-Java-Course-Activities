
package groupandteam;

import java.util.Scanner;

public class GroupandTeam
{  
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner (System.in);
        int students, size, groups, remainder;
                
        System.out.println("how many students");
        students = keyboard.nextInt();
        
        System.out.println("Size of the group");
        size = keyboard.nextInt();
        
        groups = students / size;
        remainder = students % size;
        
        System.out.println("The groups that can be formed are = " +groups);
        System.out.println("The students who are left out without a team are = " +remainder);    
    }   
}
