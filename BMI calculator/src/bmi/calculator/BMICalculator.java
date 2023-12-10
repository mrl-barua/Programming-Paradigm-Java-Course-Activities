
package bmi.calculator;

import java.util.Scanner;

public class BMICalculator 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner (System.in);
        double height, newHeight, weight, bmiResult;
        
        System.out.println("How much do you weigh in kg: ");
        weight = keyboard.nextDouble();  
        System.out.println("How tall are you in meters: ");
        height = keyboard.nextDouble();  
        newHeight = height * height;
        bmiResult = weight / newHeight;
               
        System.out.println("Your BMI value is =" +bmiResult); 
        
        if (bmiResult < 18.5)
        {
            System.out.println("The bmi results indicate that you are underweight");
        }
        else if (bmiResult >= 18.5 && bmiResult <= 24.9)
        {
            System.out.println("The bmi results indicate that you are healthy");
        }
        else
        {
            System.out.println("The bmi results indicate that you are overweight");
        }
    }
}
