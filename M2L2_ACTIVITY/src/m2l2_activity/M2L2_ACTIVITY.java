
package m2l2_activity;

import java.util.Scanner;
public class M2L2_ACTIVITY {


    public static void main(String[] args) {
        Scanner keyboardString = new Scanner (System.in);
        
        String codename, confirm;
        char last = 'X'; 
        String start = "Agent";
        
        //Display Header
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");        
        System.out.println("WELCOME TO THE U.G.A (UNDERGROUD ASSOCIATION) Agent");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");        
        System.out.println();
        System.out.println("BEFORE YOU ENTER, WE MUST CONFIRM YOUR IDENTITY: ");
       
        
        //prompt the user to enter a suitable name
        System.out.print("ENTER YOUR CODENAME: ");
        codename = keyboardString.nextLine();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
       
        //Iterate input method if the user inputs invalid codename
        while (codename.charAt(codename.length()-1)!=last||!codename.startsWith(start)||codename.length()<6){
        System.out.println("INVALID CODENAME!");
        System.out.println("NOTE: \t CHARACTERS MUST HAVE 6 CHARACTERS AND MORE"
                            + "\n \t CODENAME MUST STARTS WITH 'Agent'"
                            + "\n \t CODENAME MUST ENDS WITH 'X'");
        
        System.out.print("Enter the valid codename = ");
        codename = keyboardString.nextLine();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");

   
         }
 
        //Reconfirm the users inputted name 
        System.out.print("RECONFIRM YOUR CODENAME: ");
        confirm = keyboardString.nextLine();
System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");        
        System.out.println();
        
        if(codename.equals(confirm))
        {
            System.out.println("CODE NAME CONFIRMED");    
        }
        else if(!codename.equals(confirm))
        {
            while(!codename.equals(confirm))
            {
                System.out.println("CODE NAME MIS-MATCHED");
                System.out.print("RECONFIRM YOUR CODENAME: ");
                confirm = keyboardString.nextLine();
System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");                
                System.out.println();
            }
           System.out.println("CODE NAME CONFIRMED");   
        }
        
        System.out.println("IDENTITY HAS BEEN SUCCESSFULLY CONFIRMED! WELCOME TO U.G.A " +codename);
    } 
}
