
package problem1;

import java.util.Scanner;
public class Problem1 {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        String name [];
        System.out.print("How many names do you need to enter: ");
        int number = keyboard.nextInt();
        number = number + 1;
        System.out.println();
        
        name = new String [number];
     
        int good, bad, neutral;
        good = 0;
        bad = 0;
        neutral = 0;
    
        System.out.println("Input the names: ");
                for(int i = 0; i < name.length; i++){


                        name[i] = keyboard.nextLine();
                        
                        int nameLength = name[i].length();
                        
                            for(int j = 0; j < nameLength; j++)
                            {
                                switch (name[i].charAt(j)) {
                                    case 'g': case 'G':
                                        good = good + 1;
                                        break;
                                    case 'b': case 'B':
                                        bad = bad + 1;
                                        break;
                                    default:
                                        neutral = neutral + 1;
                                        break;
                                }
                           }
                           if(good > bad){
                               name[i] = name[i] + " is GOOD";                                     
                           }
                           else if(bad > good){
                               name[i] = name[i] + " is A BADDY";      
                           }
                           else{
                               name[i] = name[i] + " is NEUTRAL";    
                                
                            }
                           
                           good = good - good;
                           bad = bad - bad;
                           neutral = neutral - neutral;
                            

        }
                System.out.println();
                System.out.println("Output: ");
        for (String name1 : name) {
            if (name1.equals(name[0])) {
                continue;
            }
            System.out.println(name1);
        }
    
    }           
    }
    

    

