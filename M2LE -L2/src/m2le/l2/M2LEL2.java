
package m2le.l2;

import java.util.Scanner; 

public class M2LEL2
{
    public static void main(String[] args)
    {
      Scanner keyboard = new Scanner (System.in);
      int choose;
      do
      { 
      System.out.println();
      System.out.println("***Temperature Converter***");
      System.out.println();
      System.out.println("[1] Convert celsius to fahrenheit");
      System.out.println("[2] Convert fahrenheit to celsius");
      System.out.println("[3] Quit");
      System.out.println();
      System.out.println("Enter a number from 1 - 3");
      System.out.println();
      choose = keyboard.nextInt();
      while(choose < 1 || choose > 3)
      {
          System.out.println();
          System.out.println("Please input option 1 - 3 only");
          choose = keyboard.nextInt();
          System.out.println();
      }
      
      switch (choose)
      {
          case 1: option1();
              break;
          case 2: option2();
              break;
          default: System.out.println("Thank you for using the program");
                      
      }
     }while(choose != 3);
      
    }
    
    static double option1()
        {
        System.out.println();
        Scanner keyboard = new Scanner (System.in);
        double c, f;
        System.out.println("Input your celcius value: ");
        c = keyboard.nextDouble();
       while (c < -272.15)
            {
            System.out.println("This program does not allow below absolute zero temperature, please try again");
            c = keyboard.nextDouble();
            }
        f = ((9 * c ) / 5) + 32;
        System.out.print("The value you had inputted will become " +f);
        System.out.print(" fahrenheit");
        System.out.println();
        return f;
        }
    
    static double option2 ()
        {
        System.out.println();
        Scanner keyboard = new Scanner (System.in);
        double f, c;
        System.out.println("Input your fahrenheit value: ");
        f = keyboard.nextDouble();
        while (f < -458.67)
            {
            System.out.println("This program does not allow below absolute zero temperature, please try again");
            f = keyboard.nextDouble(); 
            }
        c = (5 * ( f - 32)) / 9;
        System.out.print("The value you had inputted will become " +c);
        System.out.print(" celcius");
        System.out.println();
        return c;
            
        }

}
