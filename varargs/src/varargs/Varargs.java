
package varargs;


public class Varargs 
{

  
    public static void main(String[] args) 
    {
    int someArray [] = new int [6];
    someArray[0]= 10;
    someArray[1]= 20;
    someArray[2]= 30;
    someArray[3]= 40 ;
    someArray[4]= 50;
    someArray[5]= 60;
    
    for(int i = 0; i < someArray.length; i++)
    {
        System.out.println("The value of someArray " + (i + 1) + " is equal to " +someArray[i]);
    }
        
        
        
       
    }
    
}
