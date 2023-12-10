
package washot;

import java.util.Scanner;

/**
 *
 * @author Marlo Barua
 */
public class Washot {
    public static void main(String []args)
          {     
            double[] temperature ;
            temperature = enterTemps(); // call new version of this method
            displayTemps(temperature);
            wasHot(temperature);
        }

    static double[] enterTemps()
        {
            Scanner keyboard = new Scanner(System.in);
            double[] temperatureOut = new double[7];
            for (int i = 0; i < temperatureOut.length; i++)
                {
                    System.out.println("enter max temperature for day " + (i+1));
                    temperatureOut[i] = keyboard.nextDouble();
                }
            return temperatureOut;
        }
   static void displayTemps(double[] temperatureIn)
        {
            System.out.println();
            System.out.println("***TEMPERATURES ENTERED***");
            System.out.println();
            for (int i = 0; i < temperatureIn.length; i++)
             {
                 System.out.println("day "+(i+1)+" "+ temperatureIn[i]);
             }    
        }
    static void wasHot(double[] temperatureIn)
        {
            System.out.println();
            System.out.println("The days recorded with over 18 degrees");
            System.out.println();
           for(int i = 0; i<temperatureIn.length; i ++)
           {
             if(temperatureIn[i] <= 17)   
             {
                 continue;   
             }
            System.out.println("day "+ (i+1) + " is " +temperatureIn[i]);
           }
        }

}
