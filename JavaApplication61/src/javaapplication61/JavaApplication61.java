
package javaapplication61;

import java.util.Scanner;
public class JavaApplication61 
{

   
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner (System.in);
        int choice;
        int i; 
        System.out.println("Number you want to have in your array: ");
        i = keyboard.nextInt();
        int someArray [] = new int [i];
      
        
        do{
        
        System.out.println();
        System.out.println("[1]Enter Values \n"
                         + "[2]Find Maximum\n"
                         + "[3]Calculate sum\n"
                         + "[4]Check membership\n"
                         + "[5]Search array\n"
                         + "[6]Display Values\n"
                         + "[7]Exit\n"
                         + "\n"
                         + "Enter choice [1-7]: ");
        choice = keyboard.nextInt();
        while(choice < 1 || choice > 7)
        {
            System.out.println("OPTIONS [1-7] ONLY");
            choice = keyboard.nextInt();
        }
        switch (choice)
        {
            case 1: enterVal(someArray);
                break;
            case 2: int max = findMax(someArray);
                    System.out.println("The maximum number in your array is " +max);
                break;
            case 3: int sum = calSum(someArray);
                    System.out.println("The total sum of your array is " +sum);
                break;
            case 4: System.out.print ("Enter value to find: ");
                    int value = keyboard.nextInt();
                    boolean found = contains(someArray, value);
                    if (found)
                        {
                            System.out.println(value + " is in the array");
                        }
                    else
                        {
                            System.out.println(value + " is not in the array");
                        }
                break;
            case 5: System.out.print ("Enter value to find: ");
                    int item = keyboard.nextInt();
                    int index = search(someArray, item);
                        if (index == -999) // indicates value not found
                            {
                                System.out.println ("This value is not in the array");
                            }
                        else
                            {
                                System.out.println ("This value is at array index " + index);
                            }
                break;
            case 6:   System.out.println("Array values");
                      displayArray(someArray);                
        }       
        }while(choice != 7);
        
    }
    
    static void enterVal (int [] enter )
    {
        for(int i = 0 ; i < enter.length; i ++)
        {
            Scanner keyboard = new Scanner (System.in);
            System.out.println("Enter your desired number for value " +(i+1));
            enter[i] = keyboard.nextInt();
        }
        System.out.println();
        System.out.println("the value you have inputted is ");
        for(int i = 0; i < enter.length; i ++)
        {
            System.out.println("For value "+ (i+1) + " is " +enter[i]);
        }
        System.out.println();
    }
    
    static int findMax (int [] enter)
    {
        int result = enter[0];
       
            for (int i=0; i < enter.length; i++)
                {
                    if (enter[i] > result)
                        {
                            result = enter[i]; 
                        }
                }
        return result;
    }

    static int calSum (int [] enter )
    {
        int total = 0;
        for(int x: enter)
        {
            total = total + x;
        }
     return total;   
    }
    
    // checks if a given item is contained within the array
    static boolean contains (int[] arrayIn, int valueIn)
        {
// enhanced 'for' loop used here
            for (int currentElement : arrayIn)
                {
                    if (currentElement == valueIn)
                        {
                            return true; // exit loop early if value found
                        }
                }
            return false; // value not present
        }
       /* returns the position of an item within an array or -999 if the value is not present within the array */
    static int search (int[] arrayIn, int valueIn)
        {
            for (int i = 0; i < arrayIn.length; i++)
                {
                    if (arrayIn[i] == valueIn)
                        {
                            return i;
                        }
                }
            return -999;
        }
    
    // displays the array values on the screen
    static void displayArray(int[] arrayIn)
        {
            System.out.println();
            // standard 'for' loop used here as the array index is required
                for (int i = 0; i < arrayIn.length; i++)
                    {
                        System.out.println("array[" + i + "] = " + arrayIn[i]);
                    }
}
    
}
