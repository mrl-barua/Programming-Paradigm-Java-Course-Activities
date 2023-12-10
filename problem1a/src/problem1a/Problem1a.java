/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem1a;

import java.util.Scanner;
public class Problem1a {


    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner (System.in);
        
             
        for(int i = 0; i < 25 ; i++){
            String name;
            System.out.print("input name: ");
            name = keyboard.nextLine();
            System.out.print("output name: ");
            System.out.println(name);
            System.out.println();
            
           
        }
      
        
    }
    
}
