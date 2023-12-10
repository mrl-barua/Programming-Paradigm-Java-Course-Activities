
package javaapplication66;

import java.util.Scanner;

public class JavaApplication66 {

   
    public static void main(String[] args) 
     {
    char choice;
    Scanner keyboard = new Scanner(System.in);
    int[] someArray;
    System.out.print("How many elements to store?: ");
    int size = keyboard.nextInt();
    someArray = new int [size];
    do
        {
            System.out.println();
            System.out.println("[1] Enter values");
            System.out.println("[2] Find maximum");
            System.out.println("[3] Calculate sum");
            System.out.println("[4] Check membership");
            System.out.println("[5] Search array");
            System.out.println("[6] Display values");
            System.out.println("[7] Display Average");
            System.out.println("[8] Values average: greater than or equal to ");
            System.out.println("[9] Exit");
            System.out.print("Enter choice [1-7]: ");
            choice = keyboard.next().charAt(0);
            System.out.println();
    switch(choice)
        {
            case '1':fillArray(someArray);
                break;
            case '2':int max = max(someArray);
                System.out.println("Maximum array value = " + max);
                break;
            case '3':int total = sum(someArray);
                System.out.println("Sum of array values = " + total); 
                break;
            case '4':
                System.out.print ("Enter value to find: ");
                int value = keyboard.nextInt();
                boolean found = contains(value, someArray);
                    if (found)
                        {
                            System.out.println(value + " is in the array");
                        }
                    else
                        {
                            System.out.println(value + " is not in the array");
                        }
                break;
            case '5':
                System.out.print ("Enter value to find: ");
                int item = keyboard.nextInt();
                int index = search(someArray, item);
                    if (index == -999) 
                        {
                            System.out.println ("This value is not in the array");
                        }
                    else
                        {
                            System.out.println ("This value is at array index " + index);
                        }
                break;
            case '6':
                System.out.println("Array values");
                displayArray(someArray);
                break;
            case '7':System.out.println("***Average of the array is " + average(someArray));
                break;
            case '8':greaterEqual(someArray);
            
        }
        } while (choice != '9');
    
          System.out.println("Goodbye");
    }
    static void fillArray(int[] arrayIn)
        {
        Scanner keyboard = new Scanner (System.in);
            for (int i = 0; i < arrayIn.length; i++)
                {
                    System.out.print("enter value ");
                    arrayIn[i] = keyboard.nextInt();
                }
        }
    static int sum (int[] arrayIn)
        {
        int total = 0;
        for (int currentElement : arrayIn)
            {
                total = total + currentElement;
            }
            return total;
        }
    static int max (int[] arrayIn)
        {
        int result = arrayIn[0]; 
            for (int i=1; i < arrayIn.length; i++)
                {
                    if (arrayIn[i] > result)
                        {
                            result = arrayIn[i]; 
                        }
                }
            return result;
        }
        // checks if a given item is contained within the array
    static boolean contains (int valueIn, int... arrayIn)
        {
            for (int currentElement : arrayIn)
                {
                    if (currentElement == valueIn)
                        {
                            return true; 
                        }
                }
            return false; // value not present
        }
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
    static void displayArray(int[] arrayIn)
        {
            System.out.println();
                    for (int i = 0; i < arrayIn.length; i++)
                        {
                            System.out.println("array[" + i + "] = " + arrayIn[i]);
                        }
        }
    static int average(int [] arrayIn)
    {
        int total = 0;
            for (int sum: arrayIn)
                {
                    total = total + sum;
                }
            total =  total / arrayIn.length;
            return total;
    }
    
   static void greaterEqual (int [] arrayIn)
        {
            int average = average(arrayIn);
            System.out.println("***Values that are greater than or equal to average");
            System.out.println();
            for (int value: arrayIn)
            {
                if (value >= average)
                {
                    System.out.println(value);
                }
            }
        }  
}