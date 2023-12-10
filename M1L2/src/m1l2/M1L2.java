
package m1l2;

import java.util.Scanner;

public class M1L2
{
    
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        final int year = 2020;
        int age, bornIn;        
        System.out.println("How old are you this year?: ");
        age = keyboard.nextInt();
        bornIn = year - age;             
        System.out.println("I think you were born in " + bornIn);             
    }
    
}
