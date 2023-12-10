
package anime;

import java.util.Scanner;


public class Anime {

   
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner (System.in);
       
        
        System.out.println("How many restaurant do you want to be inputted: ");
        int restaurantval = keyboard.nextInt();
        char option;
        
        while(restaurantval <5)
            {
                System.out.println("please enter value of 5 or more: ");
                restaurantval = keyboard.nextInt();
            }
            //String array set
            String [][] restaurant = new String [restaurantval][restaurantval];
            //Integer array set
            int [][] restaurantnum = new int [restaurantval][restaurantval];
            
            

do {
        System.out.println();
        System.out.println("***Restaurant Rankings and Shares***");
        System.out.println();
        System.out.println("Menu: ");
        System.out.println("[1] Display arrays");
        System.out.println("[2] Input Data");
        System.out.println("[3] Get the overall summation of shares");
        System.out.println("[4] Get the Max value");
        System.out.println("[5] Check Membership");
        System.out.println("[6] Search Array");
        System.out.println("[7] Quit");
        System.out.println();
         
            
            
                    
         System.out.println("Which options would you like to choose: ");
         option = keyboard.next().charAt(0);

         System.out.println();
         
         switch (option)
         {
             case '1': displayIt(restaurant, restaurantnum);
                 break;
             case '2': getData(restaurant,restaurantnum);
                 break;
             case '3': int total =  sum(restaurantnum);          
                       System.out.println("Sum of array values = " + total);
                 break;
             case '4': int max = max(restaurantnum);
                       System.out.println("Maximum array value = " + max);
                 break;
             case '5':  System.out.print ("Enter value to find: ");
                        int value = keyboard.nextInt();
                        boolean found = contains(restaurantnum, value);
                             if (found)
                                {
                                     System.out.println(value + " is in the array");
                                }
                             else
                                 {
                                     System.out.println(value + " is not in the array");
                                 }
                 break;
             case '6':  System.out.print ("Enter value to find: ");
                        int item = keyboard.nextInt();
                        int index = search(restaurantnum, item);
                        if (index == -999) // indicates value not found
                        {
                              System.out.println ("This value is not in the array");
                        }
                          else
                            {
                                 System.out.println ("This value is at array index " + index);
                            }  
                 break;
         }

            }while (option != '7');
             System.out.println("Thank you for using the program, Goodbye");

    }
    
        static void displayIt(String [][] restaurantIn,int [][] restaurantnumIn)
            {
                Scanner keyboard = new Scanner(System.in);
                System.out.println();
                System.out.println("***Top Restaurants***");
                System.out.println("");
                System.out.println("Ranks \tRestaurants\tLocation\tShares\t\tUnits");
                
                  for (int i=0; i<restaurantIn[0].length; i++)
                    {
                         //display the rank of the restaurant in Integer data type
                         System.out.print("  " +restaurantnumIn[i][0]);
                         System.out.print("\t");
                         

                         for (int j=0; j<restaurantIn[i].length; j++)
                            {
                           //prohibits to display the coloumn 1 of the String array data type
                                 if (restaurantIn[i][j] == restaurantIn [j][0])
                                    {
                                         continue;
                                    }
                                //displays the inputted String array data type 
                                 System.out.print(restaurantIn[i][j]+" \t\t");
     
                          
                            }    System.out.println("");
                    }
    }
        
        
        static void getData (String [][] restaurantIn, int [][] restaurantnumIn)
        {
                    Scanner keyboard = new Scanner (System.in);
                    
                    //input the value of rank
                    for(int i = 0; i<restaurantIn[0].length; i++)

                      {
                        restaurantnumIn[i][0] = i + 1 ;
                      }
                    
                    //input the name of the restaurant
                    for(int j=0; j<restaurantIn[1].length; j++)
                      {
                         System.out.println("Input Restaurant no. " + (j+1) + " : "); 
                         restaurantIn[j][1] = keyboard.next();
                      }

                     //input the location of the restaurant
                    for(int k=0; k<restaurantIn[2].length; k++)
                      {
                         System.out.println("Input the Location of restaurant no. " + (k+1) + " : ");
                         restaurantIn[k][2] = keyboard.next();
                      }
                     //input the value of shares
                    for(int l = 0; l<restaurantIn[0].length; l++)

                      {
                         System.out.println("Input the Shares of restaurant no. " + (l+1) + " : ");
                         restaurantIn[l][3] = keyboard.next();   
                      }
                    for(int m = 0; m<restaurantnumIn[3].length;m++)
                    {
                        restaurantnumIn[m][3] = Integer.parseInt(restaurantIn[m][3]);
                    }         
                    
                    //input the value of units
                    for(int n = 0; n<restaurantIn[0].length; n++)

                      {
                         System.out.println("Input the Units of restaurant no. " + (n+1) + " : ");
                         restaurantIn[n][4] = keyboard.next();   
                      }
                    for(int o = 0; o<restaurantnumIn[3].length;o++)
                    {
                        restaurantnumIn[o][4] = Integer.parseInt(restaurantIn[o][4]);
                    }  
                    
                    
        }
        
        
        static int sum (int[][] restaurantnumIn)
    {
        int total = 0;
        for(int i = 0; i<restaurantnumIn[3].length;i++)
        {
        total = total + restaurantnumIn[i][3] + restaurantnumIn[i][4] ;    
        }
        return total;
    }
        
        
        //returns the maximum value in the array
        static int max (int[][] restaurantnumIn)
    {
        int result; // set result to the first value in the array
        result = restaurantnumIn[0][3];
        // this loops runs from the 2nd item to the last item in the array
        for (int i=1; i < restaurantnumIn[3].length; i++)
            {
                if (restaurantnumIn[i][3] > result)
                    {
                        result = restaurantnumIn[i][3]; // reset result to new maximum
                    }
            }
                for (int i=1; i < restaurantnumIn[4].length; i++)
            {
                if (restaurantnumIn[i][4] > result)
                    {
                        result = restaurantnumIn[i][4]; // reset result to new maximum
                    }
            }
        return result;
    }
        
            // checks if a given item is contained within the array
static boolean contains (int[][] restaurantnumIn, int valueIn)
    {
    // enhanced 'for' loop used here
        for (int i = 0; i<restaurantnumIn[3].length;i++)
            {
                if (restaurantnumIn[i][3] == valueIn)
                    {      
                        return true; // exit loop early if value found
                    }
                if (restaurantnumIn[i][4] == valueIn)
                    {      
                        return true; // exit loop early if value found
                    }                
            }
        return false; // value not present
    }

    /* returns the position of an item within an array or -999 if the value is not present within the array */
static int search (int[][] restaurantnumIn, int valueIn)
    {
        for (int i = 0; i<restaurantnumIn[3].length;i++)
            {
                if (restaurantnumIn[i][3] == valueIn)
                    {
                        return i;
                    }
                if (restaurantnumIn[i][4] == valueIn)
                    {
                        return i;
                    }               
            }
        return -999;
    }
 
}




