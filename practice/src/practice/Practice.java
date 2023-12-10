
package practice;

import java.util.Scanner;

public class Practice 
{


    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner (System.in);


System.out.println("***Load Promo Registration***");
System.out.println();
System.out.println("Options:");
System.out.println("[1] GO50");
System.out.println("[2] GO90");
System.out.println("[3] GO120");
System.out.println("[4] Gosurf50");
System.out.println("[5] GoUnli 25");
System.out.println("[6] Quit");

int choose = keyboard.nextInt();
while(choose < 1 || choose > 6)
{
System.out.println("Pick from the options only, please try again: ");
choose = keyboard.nextInt();
}

switch(choose)
{
case 1: System.out.println("You have chosen the promo GO50");
	thankyou();
break;
case 2: System.out.println("you have chosen the promo GO90");
	thankyou();
break;
case 3: System.out.println("You have chosen the promo GO120");
	thankyou();
break;
case 4: System.out.println("You have chosen the promo Gosurf50");
	thankyou();
break;
case 5: System.out.println("You have chosen the promo GoUnli25");
	thankyou();
break;
default : System.out.println("Thank you for using the program");


}

    
}
    
static void thankyou()
{
System.out.println("Thank you for availing our promo, Have a nice day");
}
}