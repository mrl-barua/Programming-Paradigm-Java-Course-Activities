import java.util.*;
public class Practice 
{


  public static void main(String[] args)
  {
      Scanner keyboard = new Scanner (System.in);
      
      ArrayList<String>cars = new ArrayList<>();
      
     /* System.out.println("Enter car models");
    do 
      {
          cars.add(keyboard.nextLine()); 
          
      } while(!keyboard.hasNextDouble());
     
            
      System.out.println(cars);
      
      */

     cars.add("Volvo");
      cars.add("BMW");
      cars.add("Ford"); 
      cars.add("Mazda");
      
      Collections.sort(cars);
      System.out.println(cars);
     
      
      //ystem.out.println(cars);
      // System.out.println(cars.get(0));//use class.get to access a specific item in the class
      //cars.set(0, "Kia"); // use class.set to change a specific item in the class
      //System.out.println(cars);
      
//
//      int removeOpt; 
//      removeOpt = keyboard.nextInt();
//      removeOpt = removeOpt - 1;
//      while(removeOpt >= cars.size() || removeOpt < 0)
//      {
//      removeOpt = keyboard.nextInt();
//      removeOpt = removeOpt - 1;
//      }
//      cars.remove(removeOpt);
//      System.out.println(cars);
  
     
//     
//     // for loop verion 1
     Collections.sort(cars); // use sort in order tos sort the object in the ArrayList
     for(int i = 0; i<cars.size(); i++)
     {
         System.out.println(cars.get(i));
     }
//     System.out.println();
//     // for loop version 2
//     for(String i : cars)
//     {
//         System.out.println(i);
//     }
//     
//     // foor loop version 3
//     System.out.println();
//     cars.forEach((i) -> 
//     {
//         System.out.println(i);
//     }
//     );     
  }

}
    
            
 class cars
{
    
}