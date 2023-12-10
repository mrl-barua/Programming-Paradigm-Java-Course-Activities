
package quiz.pkg2.rework;


import java.util.*;
public class MarvelMovies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner (System.in);
        System.out.println("***MARVEL MOVIES PROGRAM***");
        System.out.println("---------------------------------------------------");
        
        System.out.println("Enter number of favorite Marvel movies");
        System.out.println("---------------------------------------------------");
        int moviesdata = keyboard.nextInt();
        char choice;
        
        while(moviesdata < 5) //restricts the user input
        {
            System.out.println("Enter a value of 5 or more: ");//user inputs value a value of five or more
            System.out.println("---------------------------------------------------");
            moviesdata = keyboard.nextInt();
        }
        String [][] movies = new String [moviesdata][moviesdata]; //string array
        int [][] moviesnum = new int [moviesdata][moviesdata];//int array
    
    
    do {
        System.out.println("---------------------------------------------------");
        System.out.println("Choose from the menu listed below.");
        System.out.println("MENU: ");
        System.out.println("[1] DISPLAY ARRAYS");
        System.out.println("[2] INPUT VALUE");
        System.out.println("[3] SUMMATION OF SATISFACTORY RATES");
        System.out.println("[4] FIND MAXIMUM VALUE");
        System.out.println("[5] CHECK MEMBERSHIP");
        System.out.println("[6] SEARCH ARRAY");
        System.out.println("[7] QUIT");
        System.out.println();
        
        System.out.print("ENTER CHOICE [1-7]: ");
        choice = keyboard.next().charAt(0);
        System.out.println("---------------------------------------------------");
        
                switch (choice)
        {
            case '1': displayMovie(movies, moviesnum);
                      break;
            case '2': getInput(movies, moviesnum);
                      break;
            case '3': int total =  sum(moviesnum);
                      System.out.println("Sum of Array Value = " + total);
                      break;
            case '4': int max = max(moviesnum);
                      System.out.println("Find Maximum Array Value: " + max);
                      break;
            case '5': System.out.println("Enter Value to Find: ");
                      int value = keyboard.nextInt();
                      boolean found = contains(moviesnum, value);
                      if (found){
                          System.out.println(value + " is in the array.");
                      }
                      else {
                          System.out.println(value + " is not in the array.");
                      }
                      break;
            case '6': System.out.print("Enter Value to Find: ");
                      int data = keyboard.nextInt();
                      int index = search(moviesnum, data);
                      if (index == -999) //value not found
                      {
                          System.out.println("This value is not in the array.");
                      }
                      else{
                          System.out.println("This value is in the array " + index);
                      }
                      break;
            }
            
    } while (choice != '7');
        System.out.println("Thank you,Mr./Ms. Goodbye!");
      
    }
    
        static void displayMovie(String [][] moviesIn, int [][] moviesdatIn)
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println();
            System.out.println("MARVEL MOVIES RECORDS");
            System.out.println("");
            System.out.println("Ranks \tTitle\t\tPlatform\tSatisfactory Rates\t");
            
            for (int i=0; i<moviesIn[0].length; i++)
                    {
                        
                         System.out.print("  " +moviesdatIn[i][0]);
                         System.out.print("\t");
                         

                         for (int j=0; j<moviesIn[i].length; j++)
                            {
                                 if (moviesIn[i][j] == moviesIn [j][0])
                                    {
                                         continue;
                                    }
                                 System.out.print(moviesIn[i][j]+" \t\t");
     
                          
                            }    System.out.println("");
                    }
    }
    static void getInput(String[][] moviesIn, int[][] moviesdatIn)
    {
        Scanner keyboard = new Scanner (System.in);
                    
                    for(int i = 0; i<moviesIn[0].length; i++)
                      {
                        moviesdatIn[i][0] = i + 1 ;
                      }
                    for(int j=0; j<moviesIn[1].length; j++)
                      {
                         System.out.println("ENTER TITLE OF MARVEL MOVIE " + (j+1) + ":"); 
                         moviesIn[j][1] = keyboard.nextLine();
                      }

                    for(int k=0; k<moviesIn[2].length; k++)
                      {
                         System.out.println("ENTER THE PLATFORM OF STREAMING OF MARVEL MOVIE " + (k+1) + ":" + "\t");
                         moviesIn[k][2] = keyboard.nextLine(); //platforms like Facebook, Netflix, Cinames or any sites for streaming
                      }
                    for(int l = 0; l<moviesIn[0].length; l++)
                      {
                         System.out.println("ENTER SATISFACTORY RATE OF MARVEL MOVIE " + (l+1) + ":");
                         moviesIn[l][3] = keyboard.next();   
                      }
                    for(int m = 0; m<moviesdatIn[3].length;m++)
                    {
                        moviesdatIn[m][3] = Integer.parseInt(moviesIn[m][3]);
                    }         
        }
    
    static int sum(int[][] moviesdatIn) { //summation of satisfactory rates
        int total = 0; 
        for(int i = 0; i<moviesdatIn[3].length;i++)
        {
        total = total + moviesdatIn[i][3] + moviesdatIn[i][4] ;    
        }
        return total;
    }

    static int max(int[][] moviesdatIn) { //shows the maximum satisfactory rate
        int result; 
        result = moviesdatIn[0][3];
        for (int i=1; i < moviesdatIn[3].length; i++)
        {
            if (moviesdatIn[i][3] > result)
            {
                result = moviesdatIn[i][3];
            }
            }
                for (int i=1; i < moviesdatIn[4].length; i++)
            {
                if (moviesdatIn[i][4] > result)
                    {
                        result = moviesdatIn[i][4];
                    }
            }
                
        return result;     
    }
        static boolean contains(int[][] moviesdatIn, int valueIn) {
            for (int i=0; i<moviesdatIn[3].length; i++)
            {
                
                if (moviesdatIn[i][3] == valueIn)
                        {
                            return true; 
                        }
                if (moviesdatIn[i][4] == valueIn)
                    {      
                        return true;
                    }
            }
            return false;
        }

    static int search(int[][] moviesdatIn, int valueIn) {
       for (int i = 0; i<moviesdatIn[3].length;i++)
            {
                if (moviesdatIn[i][3] == valueIn)
                    {
                        return i;
                    }
                if (moviesdatIn[i][4] == valueIn)
                    {
                        return i;
                    }               
            }return -999;
    }
    
}