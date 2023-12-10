
package javaapplication63;

import java.util.Scanner;
public class JavaApplication63 
{
  public static void main(String[] args)
    {
       Scanner keyboard = new Scanner (System.in);
       System.out.println("How many student do you have: ");
       int i = keyboard.nextInt();
       int [] javastudents = new int [i];
      
       enterExamMarks(javastudents);
       increaseMarks(javastudents);
      
       boolean passed = allHavePassed(javastudents);
      
      if(passed)
      {
          System.out.println("Congrats, All have passed");
      }
      else
      {
          System.out.println("Sorry, better luck next time");
      }
    } 
    static void enterExamMarks(int [] examResults)
    {
        Scanner keyboard = new Scanner (System.in);
        for(int i = 0; i < examResults.length; i++)
        {
            System.out.println("Student no. " +(i+1)+ " results : ");
            examResults[i] = keyboard.nextInt();  
        }
    }
    static void increaseMarks (int [] examResults)
    { 
        System.out.println();
        for(int i = 0; i < examResults.length; i ++)
        {
            System.out.println("student no. " + (i+1) + " = " + (examResults[i]+5)); 
        }
    }
    
    static boolean allHavePassed (int [] examResults)
    {
        int passingRate = 40;
        for(int x: examResults)
        {
            if(x < passingRate)
            {
                return false;
            }     
        }
        return true;
    }
}
