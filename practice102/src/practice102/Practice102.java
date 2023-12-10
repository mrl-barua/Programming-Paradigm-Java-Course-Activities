
package practice102;


import java.util.ArrayList;
import java.util.Scanner;
public class Practice102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Account> ac = new ArrayList<Account>();
        Scanner scan = new Scanner(System.in);
        boolean isRunning = true;

        while(isRunning){
              System.out.println("Please enter your name in the account(quit to exit program): ");
              String name = scan.next();
              if(name.equalsIgnoreCase("quit")) {
                  break;
              }
              System.out.println("Please enter an amount for your account: ");
              double amount = scan.nextDouble();
              Account a = new Account(name, amount);
              ac.add(a);

         }

         for(Account t: ac) {
              System.out.println("Name: " + t.getName() + "\nAmount: " + t.getAmount());
              System.out.println();
         }

    }
}

      class Account {
      private String name;
      private double amount;

      public Account(String name, double amount) {
           this.name = name;
           this.amount = amount;

      }

      public double getAmount() {
           return this.amount;
      }

      public String getName() {
          return this.name;
      }

 }