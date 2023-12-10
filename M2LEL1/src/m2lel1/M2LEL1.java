
package m2lel1;

import java.util.Scanner;

public class M2LEL1
{
    public static void main(String[] args) 
    {
      Scanner keyboard = new Scanner (System.in);
      int gum, chocolate, popcorn, juice;
      gum = 0;
      chocolate = 0;
      popcorn = 0;
      juice = 0;
      int food;
      char repeat1;
     do {
      System.out.println();
      System.out.println("Press a deignated number if you want to avail the product");
      System.out.println("[1] Get gum");
      System.out.println("[2] Get chocolate");
      System.out.println("[3] Get popcorn");
      System.out.println("[4] Get juice");
      System.out.println("[5] Display total sold so far");
      System.out.println("[6] Quit");
      System.out.println();
      food = keyboard.nextInt();
              
     while( food <1 || food >6)
     {
         System.out.println("Error, options 1-6 only!");
         food = keyboard.nextInt();
     }
    
      switch (food)
      {
          case 1: System.out.println("Here is your gum");
                    gum = gum + 1;
                break;
          case 2: System.out.println("Here is your chocolate"); 
                    chocolate = chocolate + 1;
                break;
          case 3: System.out.println("Here is your popcorn");
                    popcorn = popcorn + 1;
                break;
          case 4: System.out.println("Here is your juice");
                    juice = juice + 1;
                break;
          case 5: System.out.println("The items that is sold so far"); 
                    System.out.println(gum+ " items of gum sold");
                    System.out.println(chocolate+ " items of chocolate sold");
                    System.out.println(popcorn+ " items of popcorn sol1d");
                    System.out.println(juice+ " items of juice sold");       
                break;
          default: System.out.println("Thank you for buying, have a good day");
         }
      
        } while(food == 1 || food == 2 || food == 3 || food == 4 || food == 5);
        
    } 
}
