
package discrete.math;

import java.util.Scanner;
public class DiscreteMath {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Question and Answer Game");
        System.out.println("Math Edition");
        System.out.println();
        
        
       char enter;
       boolean ting = true;
       boolean engk = false;
       int trueResult, falseResult;
       trueResult = 0;
       falseResult = 0;
        
        System.out.println("Do you want to play this game?");// uses the "or" logic
        System.out.print("Press Y or N: ");
        enter = keyboard.next().charAt(0);
        System.out.println();
        
        while(enter != 'Y' && enter != 'N'){
            System.out.println("The program does not recognize this key!");
            System.out.println("Please try again!");
            enter = keyboard.next().charAt(0);
        }
        
        if(enter == 'Y'){
            //the first question
            System.out.println();
            System.out.println("The first question is: ");
            System.out.println("What is 2 x 9?");
            System.out.print("Your Answer: ");
            int answer1 = keyboard.nextInt();
                if(answer1 == 18){
                    System.out.println(ting);
                    trueResult = trueResult + 1;
                }
                else if(answer1 != 18){
                    System.out.println(engk);
                    falseResult = falseResult + 1;
                
                }
            //the second question
            System.out.println();
            System.out.println("The second question is: ");
            System.out.println("What is 90 / 3?");
            System.out.print("Your Answer: ");
            int answer2 = keyboard.nextInt();
                if(answer2 == 30){
                    System.out.println(ting);
                    trueResult = trueResult + 1;
                }
                else if(answer2 != 30){
                    System.out.println(engk);
                    falseResult = falseResult + 1;
                }           
              
            //the third question
            System.out.println();
            System.out.println("The third question is: ");
            System.out.println("What is the two prime number between 1 and 4?");
            System.out.print("Your first Answer: ");
            int answer3a = keyboard.nextInt();
            System.out.print("Your second Answer: ");
            int answer3b = keyboard.nextInt();
                if(answer3a == 2 && answer3b == 3){
                    System.out.println(ting);
                    trueResult = trueResult + 1;
                }
                else if(answer3a != 2 && answer3b != 3){
                    System.out.println(engk);
                    falseResult = falseResult + 1;
                }                
            //the fourth question
            System.out.println();
            System.out.println("The fourth question is: ");
            System.out.println("What is 13 * 5?");
            System.out.print("Your Answer: ");
            int answer4 = keyboard.nextInt();
                if(answer4 == 65){
                    System.out.println(ting);
                    trueResult = trueResult + 1;
                }
                else if(answer4 != 65){
                    System.out.println(engk);
                    falseResult = falseResult + 1;
                }                
            //the fifth question
            System.out.println();
            System.out.println("The fifth question is: ");
            System.out.println("What is 54 + 23?");
            System.out.print("Your Answer: ");
            int answer5 = keyboard.nextInt();
                if(answer5 == 77){
                    System.out.println(ting);
                    trueResult = trueResult + 1;
                }
                else if(answer5 != 77){
                    System.out.println(engk);
                    falseResult = falseResult + 1;
                }           
                
                System.out.println();
                System.out.println("The Correct answers you got are " + trueResult );
                System.out.println("The Wrong answers you got are " + falseResult);
            
            
        }
        else if(enter == 'N'){
            System.out.println("Thank you for using the program");
        }

            
        
        
        
    }
    
}
