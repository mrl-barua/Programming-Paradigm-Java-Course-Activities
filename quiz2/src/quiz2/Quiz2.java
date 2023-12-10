
package quiz2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz2 {

 
    public static void main(String[] args) {
        //Restaurant Ranking and Status
        //Developers: Marlo L. Barua
        //            Mecca Cristel T. Allego
        

       //Initialize an ArrayList of objects
       ArrayList <Restaurant> restaurant = new ArrayList<>(); 
   
       System.out.println("\t\t***RESTAURANT RANKINGS AND SHARES***");
       System.out.println("----------------------------------------------------------------------------");
       System.out.println();
       

       System.out.println();
                //method to input datas and values
                input(restaurant, Restaurant.class);
                //method to display the data and values
                display(restaurant, Restaurant.class);
                
        LocalDateTime current = LocalDateTime.now(); //getting the current date and time
        
        DateTimeFormatter frmttr = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT); //formatter
        String frmttd = current.format(frmttr); //String formatted
        
        System.out.println("CURRENT DATE AND TIME: " + frmttd);
        System.out.println("Thank you for using the program, show enthusiasm always and stay safe!");
   }
    //method to display the data and values    
    static void display(ArrayList restaurant, Class RestaurantIn)
    { 

               ArrayList <Restaurant> restaurantIn = new ArrayList<>(); 
               restaurantIn = restaurant;
               int number = 1;
               for(Restaurant r: restaurantIn)
                 {
                        System.out.println("Top " + number + " Restaurant " ); 
                        System.out.println("Name: " + r.getName() + "\nLocation: " + r.getLoc()+ "\nShares: " + r.getShares()+ "\nUnits: " + r.getUnits());
                        System.out.println();
                        number = number + 1;
                       System.out.println("-----------------------------------------------------------"); 
                 }               
               
               System.out.println("Name\t\tLocation\tShares\tUnits");
               for(Restaurant r: restaurantIn)
                 {
  
                        System.out.print(r.getName() + "\t" );
                        System.out.print(r.getLoc() + "\t");
                        System.out.print(r.getShares() + "\t");
                        System.out.print(r.getUnits() + "\t");
                        System.out.println();
                        number = number + 1;
                       
                 }                
               System.out.println();

    }
                //method to input datas and values    
    static void input(ArrayList restaurant, Class RestaurantIn)
    {

               //Scanner for String data type
               Scanner keyboardString = new Scanner (System.in);
               //Scanner for other data types
               Scanner keyboard = new Scanner (System.in);
                      boolean isRunning = true;
        
       while(isRunning)
       {
          
              System.out.print("Enter the Name of the restaurant(quit to exit program): ");
              String name = keyboardString.nextLine();
              System.out.println();

              //String type in which it will ignore any Sring value except for the word associated with it
                if(name.equalsIgnoreCase("quit"))
                     {
                        break;
                     }
              System.out.print("Enter the Location of the restaurant: ");
                 String loc = keyboardString.nextLine();
              System.out.println();
              System.out.print("Enter the Shares of that restaurant: ");
                 int shares = keyboard.nextInt();
                 System.out.println();
                 System.out.print("Enter the Units of that restaurant: ");
                 int units = keyboard.nextInt();
                 System.out.println();
                 System.out.println("----------------------------------------------------------------------------");
              Restaurant a = new Restaurant(name, loc, shares, units);
              restaurant.add(a);
        }    
            {
                System.out.println("-----------------------***DATA SETS COMBINED***-----------------------------");
            }
    
    }
    
  
    }
//the class Restaurant
 class Restaurant{ 
 //attributes of the objects
     private String name;
     private String loc;
     private int shares;
     private int units;
          
     
  public Restaurant(String name, String loc, int shares, int units)
        {
            this.name = name;
            this.loc = loc;
            this.shares = shares;
            this.units = units;
        }
  
  public String getName()
        {
            return this.name;
        }
  public String getLoc()
        {
            return this.loc;
        }        
  public int getShares()        
        {
            return this.shares;
        }   
        public int getUnits()
        {
            return this.units;
        }              
 }

  
  
