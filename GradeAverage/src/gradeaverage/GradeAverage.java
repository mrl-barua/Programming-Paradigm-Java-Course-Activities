
package gradeaverage;

import java.util.Scanner;


public class GradeAverage {

    public static void main(String[] args) {
        // TODO code application logic here
        
        double[][] grade = new double[4][3];
        getGrade(grade);
        displayGrade(grade);
        computeQuizAve(grade);
        //computeStuAve(grade);
    }
    static void getGrade(double[][] gradeIn)
    {
        Scanner keyboard=new Scanner(System.in);
        for(int i=0;i<gradeIn.length;i++){
            for(int j=0;j<gradeIn[i].length;j++){
                System.out.print("Enter Student" +(i+1)+" Quiz "+(j+1)+":");
                gradeIn[i][j]=keyboard.nextDouble();
            }
        }
    }
    
    static void displayGrade(double[][] gradeIn)
    {
        for (int i=0; i<gradeIn.length; i++){
            for (int j=0; j<gradeIn[i].length; j++){
                System.out.print(gradeIn[i][j]+" \t");
            }System.out.println("");
        }
    }
    
    
    
    static void computeQuizAve(double[][] gradeIn)
    {
        double add = 0, quizAve;
             
        for (int i=0; i<gradeIn.length; i++){
            for (int j=0; j<1; j++){
                add = add + (gradeIn[i][j]);
                //compute the sum of the data
                
            }
        } quizAve=add /gradeIn.length;
          System.out.print("Sum "+add);  
          System.out.print(" length "+gradeIn.length);  
          System.out.print(" Quiz Average "+quizAve+"\t");
          
          
          
          
  double add2 = 0, guizAve2;  
  //create an initializer to hold the new value
          
                  for (int i=0; i<gradeIn.length; i++){
            for (int j=1; j<2; j++){
                
               
                add2 = add2 + (gradeIn[i][j]);
                //compute the sum of the data
                
            }
        } quizAve=add2 /gradeIn.length;
          System.out.println();
          System.out.print("Sum "+add2);  
          System.out.print(" length "+gradeIn.length);  
          System.out.print(" Quiz Average "+quizAve+"\t");
          
          
      double add3 = 0, guizAve3;  
  //create an initializer to hold the new value
          
                  for (int i=0; i<gradeIn.length; i++){
            for (int j=2; j<3; j++){
                
               
                add3 = add3 + (gradeIn[i][j]);
                //compute the sum of the data
                
            }
        } quizAve=add3 /gradeIn.length;
          System.out.println();
          System.out.print("Sum "+add3);  
          System.out.print(" length "+gradeIn.length);  
          System.out.print(" Quiz Average "+quizAve+"\t");
          
          
          System.out.println();
          
   double plus = 0, studentAve;  
  //create an initializer to hold the new value
          
                  for (int i=0; i<1; i++){
            for (int j=0; j<3; j++){
                
               
                plus = plus + (gradeIn[i][j]);
                //compute the sum of the data
                
            }
        } studentAve=plus /gradeIn[0].length;
          System.out.println();
          System.out.print("Sum "+plus);  
          System.out.print(" length "+gradeIn[0].length);  
          System.out.print(" student Average "+studentAve+"\t");
          
          
          
             double plus2 = 0, studentAve2;  
  //create an initializer to hold the new value
          
                  for (int i=1; i<2; i++){
            for (int j=0; j<3; j++){
                
               
                plus2 = plus2 + (gradeIn[i][j]);
                //compute the sum of the data
                
            }
        } studentAve2=plus2 /gradeIn[1].length;
          System.out.println();
          System.out.print("Sum "+plus2);  
          System.out.print(" length "+gradeIn[1].length);  
          System.out.print(" student Average "+studentAve2+"\t");
          
          
             double plus3 = 0, studentAve3;  
  //create an initializer to hold the new value
          
                  for (int i=2; i<3; i++){
            for (int j=0; j<3; j++){
                
               
                plus3 = plus3 + (gradeIn[i][j]);
                //compute the sum of the data
                
            }
        } studentAve3=plus3 /gradeIn[2].length;
          System.out.println();
          System.out.print("Sum "+plus3);  
          System.out.print(" length "+gradeIn[2].length);  
          System.out.print(" student Average "+studentAve3+"\t");
          
             double plus4 = 0, studentAve4;  
  //create an initializer to hold the new value
          
                  for (int i=3; i<4; i++){
            for (int j=0; j<3; j++){
                
               
                plus4 = plus4 + (gradeIn[i][j]);
                //compute the sum of the data
                
            }
        } studentAve4=plus4 /gradeIn[3].length;
          System.out.println();
          System.out.print("Sum "+plus4);  
          System.out.print(" length "+gradeIn[3].length);  
          System.out.print(" student Average "+studentAve4+"\t");
    }    
}
    