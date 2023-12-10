
package javaapplication28;

/**
 *
 * @author Marlo Barua
 * @param <AnyType>
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class MyArrayList<AnyType> implements Iterable<AnyType>{
    


  
     //main 
     public static void main(String args[]) {
         
         Scanner keyboard = new Scanner (System.in);
         int option;
        
         MyArrayList l = new MyArrayList();
         
         l.add(2);
         l.add(3);
         l.add(4);
         l.add(5);

       do{ 
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println("Select an option");
         System.out.println("[1] SHOW LIST");
         System.out.println("[2] ADD");
         System.out.println("[3] SEARCH");
         System.out.println("[4] REMOVE");
         System.out.println("[5] REPLACE");
         System.out.println("[6] EXIT");
         
         System.out.print("Input: ");
           option = keyboard.nextInt();
         System.out.println();
         
         switch(option) {
             
             case 1: 
                 for(int i=0; i<l.size();i++)
                      System.out.println("Item "+i+": "+l.get(i));
                 break;
                 
             case 2:  
                 
                 System.out.println("Do you want to add to a specific index: ");
                 System.out.print("Press Y for Yes , Press anykey for No: "); 
                 char question = keyboard.next().charAt(0); 
                 if(question == 'Y' || question == 'y')
                 {       
                 System.out.println("Input Index Number");
                 int a = keyboard.nextInt();         
                 System.out.println("Input Value to Add");
                 int b = keyboard.nextInt();
                 l.add(a,b);             
                 continue;
                     
                 }
                 System.out.println("Input Value to Add");
                 int b = keyboard.nextInt();
                 l.add(b);                       

                 break; 
                 
                 
             case 3: 
                 System.out.print("Index You Want to Search: ");
                 int find = keyboard.nextInt();
                 l.get(find);
                 System.out.println("The element at index " + find + " is " + l.get(find));
                 break;       
                 
             case 4: 
                 System.out.print("Enter Index Value You Want to Remove: ");
                 int index = keyboard.nextInt();
                     l.remove(index);
                 break;             
             case 5:  System.out.println("Input Index Number");
                        int x = keyboard.nextInt();
                        System.out.println("Input Value to Replace");
                        char y = keyboard.next().charAt(0);            
                        l.set(x,y);
                 
             
                 break;       
                 
                 
             case 6: System.exit(0);
                 break;
             default: System.out.print("Invalid Input, Try Again: ");
             
         } 
         
         }while(option != 6);
         
        
         
         
         
         
         
    }
     
//////////////////////////////////////////////////////////////////////     
     
  private static final int DEFAULT_CAPACITY=10;
    
    private int theSize;
    private AnyType [] theItems;
    
    public MyArrayList() { doClear();}
    public void clear(){ doClear(); }
    
    private void doClear()
    {
        theSize=0;
        ensureCapacity (DEFAULT_CAPACITY);
    }
   
    public int size() {return theSize;}
    public boolean isEmpty() { return size()==0;}
    public void trimToSize(){ensureCapacity(size());}
     
         public AnyType get(int idx){
        if( idx < 0 || idx >= size())
            throw new ArrayIndexOutOfBoundsException();
        return theItems[idx];
    }
         
     public AnyType set (int idx, AnyType newVal){
        if( idx < 0 || idx >= size())
            throw new ArrayIndexOutOfBoundsException();
        AnyType old = theItems[idx];
        theItems[idx] = newVal;
        return old;
    }       
     
    public void ensureCapacity (int newCapacity){
        if (newCapacity < theSize)
            return;
        AnyType [] old = theItems;
        theItems = (AnyType[]) new Object[newCapacity];
        for (int i=0; i<size(); i++) theItems[i]=old[i];
    }
    
    public boolean add(AnyType x){
        add(size(),x);
        return true;
    }     
     
    public void add (int idx, AnyType x){
       
        if(theItems.length == size()) ensureCapacity(size()*2+1);
        for (int i = theSize; i> idx; i--) theItems[i] = theItems [i-1];
        theItems[idx]=x;
        theSize++;
    }    
    
    
     public AnyType remove(int idx){
        AnyType removedItem = theItems[idx];
        for (int i=idx; i<size()-1; i++) theItems[i]=theItems[i+1];
        theSize--;
        return removedItem;
    }   
     
       public AnyType sort(int idx){
         
      
         
         
         return null;
       }
     
    @Override
     public java.util.Iterator<AnyType> iterator () 
    { 
        return new ArrayListIterator();
    }    
     
     
    private class ArrayListIterator implements java.util.Iterator<AnyType>
    {
        
        private int current =0;
              
        @Override
        public boolean hasNext() {return current < size();}
        @Override
        public AnyType next () { return theItems[current++]; }
        @Override
        public void remove () {MyArrayList.this.remove(--current);}
        }     
        
    }
    
    
    
    
    
    

        
