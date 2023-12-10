
package quiz2_barua;

import java.util.Scanner;
import java.util.ArrayList;


public class Quiz2_BARUA 
{

    public static void main(String[] args) 
    {
      Scanner keyboard = new Scanner(System.in);  
      String opt; 
      
      System.out.println("How many restaurant do you want to be inputted: ");
      int restaurantval = keyboard.nextInt();

        
//        while(restaurantval <5)
//            {
//                System.out.println("please enter value of 5 or more: ");
//                restaurantval = keyboard.nextInt();
//            }
             Restaurant [][]res = new Restaurant [restaurantval][restaurantval];


       
       
            for (int i = 0; i < res.length; i++)
                {
                        System.out.println("Input Restaurant no. " + (i+1) + " Name: ");
                        opt = keyboard.nextLine();
                        res[i][1] = new Restaurant();
                        res[i][1].setName(opt);
                }

    System.out.println("The restaurants are");
            for(int i = 0; i < res.length; i++)
                {
                    System.out.println(res[i][1].getName());            
                }
//
//            for (int i = 0; i < res.length; i++)
//                {
//                    System.out.println("Input Restaurant Name: ");
//                    opt = keyboard.nextLine();
//                    res[i] = new Restaurant();        
//                    res[i].setLoc(opt);
//                }

        
//    System.out.println("The restaurants are located ");
//        for(int i = 0; i < res.length; i++)
//        {
//            System.out.println(res[i].getLoc());
//        }


    }    
}





