/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops.practice;

import java.util.Scanner;
public class LoopsPractice {

public static void main(String[] args)
{
int num; // to hold user response
Scanner keyboard = new Scanner(System.in);
int mark;
System.out.println("What exam mark did you get?");
mark = keyboard.nextInt();
while (mark < 0 || mark > 100) // check for invalid input
{
// display error message and allow for re-input
System.out.println("Invalid mark: Re-enter!");
mark = keyboard.nextInt();
}
if (mark >= 40)
}
}
