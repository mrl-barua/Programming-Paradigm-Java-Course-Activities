/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylinkedlist;

/**
 *
 * @author Marlo Barua
 * Performance Task 3 - Linked List
 * BSIT 2B
 * 
 * @param <AnyType>
 */



import java.util.Arrays;
import java.util.Scanner;

public class MyLinkedList<AnyType> implements Iterable<AnyType> {
    
    private static class Node<AnyType>{
        public Node (AnyType datas, Node<AnyType> previous, Node<AnyType>nexts){
            data = datas; prev = previous; next = nexts;
        }
        public AnyType data;
        public Node<AnyType> prev;
        public Node<AnyType> next;
    }
    
    public MyLinkedList(){ doClear();}
    public void clear(){ doClear();}
    private void doClear(){
    
        beginMarker = new Node<>(null,null,null);
        endMarker = new Node<AnyType>(null,beginMarker,null);
        beginMarker.next = endMarker;
        
        theSize = 0;
        modCount++;
    }
    
    public int size(){return theSize;}
    public boolean isEmpty(){return size()==0;}
    
    public boolean add (AnyType x){
        add(size(),x); return true;
    }
    
    public void add (int idx, AnyType x){
        addBefore (getNode(idx, 0, size()),x);
    }
    
    private void addBefore(Node<AnyType> p, AnyType x){
        Node<AnyType> newNode = new Node <>(x, p.prev,p);
        newNode.prev.next = newNode;
        p.prev = newNode;
        theSize++;
        modCount++;
    }
    
    public AnyType get(int idx){
        return getNode(idx).data;
    }
    
    public AnyType set (int idx, AnyType newVal){
        Node<AnyType> p = getNode(idx);
        AnyType oldVal = p.data;
        p.data = newVal;
        return oldVal;
    }
    
    public AnyType remove(int idx){
        return remove(getNode(idx));
    }
    
   
    
    private AnyType remove(Node<AnyType> p){
        p.next.prev = p.prev;
        p.prev.next = p.next;
        theSize--;
        modCount++;
        return p.data;  
    }
    
    private Node<AnyType> getNode (int idx){
        return getNode (idx,0,size()-1);
    }
    
    private Node<AnyType> getNode (int idx, int lower, int upper){
        Node<AnyType> p;
        
        if (idx < lower || idx > upper)
            throw new IndexOutOfBoundsException();
        if (idx < size()/2){
            p = beginMarker.next;
            for(int i=0; i< idx; i++)
                p = p.next;
        }
        else{
            p = endMarker;
            for (int i=size(); i> idx; i--)
                p = p.prev;
        }
        return p;
    }
    
    @Override
    public java.util.Iterator<AnyType> iterator (){ 
        return new LinkedListIterator();
    }
    
    private class LinkedListIterator implements java.util.Iterator<AnyType>{
        private Node<AnyType> current = beginMarker.next;
        private int expectedModCount = modCount;
        private boolean okToRemove = false;
        
        @Override
        public boolean hasNext(){
            return current != endMarker;
        }
        
        @Override
        public AnyType next(){
            if (modCount != expectedModCount)
                throw new java.util.ConcurrentModificationException();
            if (!hasNext())
                throw new java.util.NoSuchElementException();
            
            AnyType nextItem = current.data;
            current = current.next;
            okToRemove = true;
            return nextItem;
        }
        
        @Override
        public void remove(){
            if (modCount != expectedModCount)
                throw new java.util.ConcurrentModificationException();
            if (!okToRemove)
                throw new IllegalStateException();
            
         //   MyLinkedList.false.remove(current.prev);
            MyLinkedList.this.remove(current.prev);
            expectedModCount++;
            okToRemove = false;
        }
        
    }
    
        public void sortList() {
        Integer[] intValue = new Integer[theSize];
        for (int i = 0; i < size(); i++) {
            intValue[i] = (Integer) this.get(i);
        }
        Arrays.sort(intValue);
        for (int j = 0; j < intValue.length; j++) {
            this.set(j, (AnyType) intValue[j]);
        }
    }     
    
    




    private int theSize;
    private int modCount;
    private Node<AnyType> beginMarker;
    private Node<AnyType> endMarker;
    

    
    
       
    public static void main(String args[]) {
        
        
        Scanner keyboard = new Scanner (System.in);
        int option;
        
        MyLinkedList myList = new MyLinkedList();

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

         
       switch(option){
           case 1: for(int i=0; i<myList.size();i++){
                      myList.sortList();
                      System.out.println("Item "+i+": "+myList.get(i));
                      }
               break;
               
           case 2:      System.out.println("What value you want to add: ");
                        int val = keyboard.nextInt();
           
                       myList.add(val);                 
               break;
           case 3:
       
               System.out.print("Index You Want to Search: ");
                 int find = keyboard.nextInt();
                 
                 if (find > myList.size() || find < 0 ){
                     System.out.println("Node isn't found on the list!");
                     continue;
                 }
                 
                 else{
                 myList.get(find);}

                 System.out.println("The element at index " + find + " is " + myList.get(find));
                 break;       
              
           case 4: System.out.print("Enter Index Value You Want to Remove: ");
                 int index = keyboard.nextInt();
                 
                if (index > myList.size() || index < 0 ){
                     System.out.println("Node isn't found on the list!");
                     continue;} 
                 
                     myList.remove(index);
       
               break;
           case 5: System.out.println("Input Index Number");
                        int x = keyboard.nextInt();
                        System.out.println("Input Value to Replace");
                        int y = keyboard.nextInt(); 
                        
                     if (x > myList.size() || x < 0 ){
                     System.out.println("Node isn't found on the list!");
                     continue;} 
                        myList.set(x,y);
               
               
               
               break;
           case 6: System.out.println("Thank you, Have a nice day");
                   System.exit(0);
               break;
           default: System.out.print("Invalid Input, Try Again: ");    
           
           
       }}while(option != 6);

        
        
        
        
    }
}
