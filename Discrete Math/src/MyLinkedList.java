/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marlo
 */

import java.util.Scanner;


public class MyLinkedList<AnyType> implements Iterable<AnyType> {

    private static class Node<AnyType> {

        public Node(AnyType d, Node<AnyType> p, Node<AnyType> n) {
            data = d;
            prev = p;
            next = n;
        }
        public AnyType data;
        public Node<AnyType> prev;
        public Node<AnyType> next;
    }

    public MyLinkedList() {
        doClear();
    }

    public void clear() {
        doClear();
    }

    private void doClear() {

        beginMarker = new Node<AnyType>(null, null, null);
        endMarker = new Node<AnyType>(null, beginMarker, null);
        beginMarker.next = endMarker;

        theSize = 0;
        modCount++;
    }

    public int size() {
        return theSize;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean add(AnyType x) {
        add(size(), x);
        return true;
    }

    public void add(int idx, AnyType x) {
        addBefore(getNode(idx, 0, size()), x);
    }

    private void addBefore(Node<AnyType> p, AnyType x) {
        Node<AnyType> newNode = new Node<>(x, p.prev, p);
        newNode.prev.next = newNode;
        p.prev = newNode;
        theSize++;
        modCount++;
    }

    public AnyType get(int idx) {
        return getNode(idx).data;
    }

    public AnyType set(int idx, AnyType newVal) {
        Node<AnyType> p = getNode(idx);
        AnyType oldVal = p.data;
        p.data = newVal;
        return oldVal;
    }

    public AnyType remove(int idx) {
        return remove(getNode(idx));
    }

    private AnyType remove(Node<AnyType> p) {
        p.next.prev = p.prev;
        p.prev.next = p.next;
        theSize--;
        modCount++;
        return p.data;
    }

    private Node<AnyType> getNode(int idx) {
        return getNode(idx, 0, size() - 1);
    }

    private Node<AnyType> getNode(int idx, int lower, int upper) {
        Node<AnyType> p;

        if (idx < lower || idx > upper) {
            throw new IndexOutOfBoundsException();
        }
        if (idx < size() / 2) {
            p = beginMarker.next;
            for (int i = 0; i < idx; i++) {
                p = p.next;
            }
        } else {
            p = endMarker;
            for (int i = size(); i > idx; i--) {
                p = p.prev;
            }
        }
        return p;
    }

    public java.util.Iterator<AnyType> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements java.util.Iterator<AnyType> {

        private Node<AnyType> current = beginMarker.next;
        private int expectedModCount = modCount;
        private boolean okToRemove = false;

        public boolean hasNext() {
            return current != endMarker;
        }

        public AnyType next() {
            if (modCount != expectedModCount) {
                throw new java.util.ConcurrentModificationException();
            }
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }

            AnyType nextItem = current.data;
            current = current.next;
            okToRemove = true;
            return nextItem;
        }

        public void remove() {
            if (modCount != expectedModCount) {
                throw new java.util.ConcurrentModificationException();
            }
            if (!okToRemove) {
                throw new IllegalStateException();
            }

            //   MyLinkedList.false.remove(current.prev);
            MyLinkedList.this.remove(current.prev);
            expectedModCount++;
            okToRemove = false;
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
       
       System.out.println("Select an option");
         System.out.println("[1] PRINT LIST");
         System.out.println("[2] INSERT");
         System.out.println("[3] FIND");
         System.out.println("[4] DELETE");
         System.out.println("[5] REPLACE");
         System.out.println("[6] EXIT");
         
         System.out.print("Input: ");
         option = keyboard.nextInt();
         System.out.println();

         
       switch(option){
           case 1: for(int i=0; i<myList.size();i++){       
                      System.out.println("Item "+i+": "+myList.get(i));
                      }
               break;
               
           case 2:      System.out.println("VALUE TO BE INSERTED: ");
                        int val = keyboard.nextInt();
           
                       myList.add(val);                 
               break;
           case 3:
       
               System.out.print("VALUE TO FIND: ");
                 int find = keyboard.nextInt();
                 
                 if (find > myList.size() || find < 0 ){
                     System.out.println("NODE IS NOT IN THE LIST!");
                     continue;
                 }
                 
                 else{
                 myList.get(find);}

                 System.out.println("VALUE FIND AT INDEX " + find + " IS " + myList.get(find));
                 break;       
              
           case 4: System.out.print("ENTER INDEX NUMBER YOU WANT TO DELETE: ");
                 int index = keyboard.nextInt();
                 
                if (index > myList.size() || index < 0 ){
                     System.out.println("NODE IS NOT IN THE LIST!");
                     continue;} 
                 
                     myList.remove(index);
       
               break;
           case 5: System.out.println("INPUT INDEX NUMBER");
                        int a = keyboard.nextInt();
                        System.out.println("INPUT VALUE YOU WANT TO REPLACE");
                        int b = keyboard.nextInt(); 
                        
                     if (a > myList.size() || a < 0 ){
                     System.out.println("NODE IS NOT IN THE LIST!");
                     continue;} 
                        myList.set(a,b);
               
               
               
               break;
           case 6: System.out.println("THANKS");
                   System.exit(0);
               break;
           default: System.out.print("INVALID: ");    
           
           
       }}while(option != 6);

        

    }
}
