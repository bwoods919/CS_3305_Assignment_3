// Name: Brendan Woods
// Class: CS 3305/01
// Term: Fall 2022
// Instructor: Dr. Haddad
// Assignment: 3
// IDE Name: IntelliJ

/*
This class define a linked list that stores integer values.
*/

public class LinkedList
{
   public Node head, tail;

   //constructor method to create a list of object with head, tail, and size. 
   public LinkedList()
   {
      head = null;
      tail = null;
   }

   //method add node to end of list
   public void addLastNode(int data) 
   {
      if (tail == null) 
         head = tail = new Node(data); //empty list
      else 
      {
         tail.next = new Node(data); //link new node as last node
         tail = tail.next; //make tail pointer points to last node
      }
   }

   //======== Your part to complete for this assignment =========
   
   //method #1: add first node
   public void addFirstNode(int data)
   {
      if (tail == null)
         head = tail = new Node(data); //empty list
      else
      {
         Node temp = new Node(data);
         temp.next = head;
         head = temp;
      }
   }
      
   //method #2: add node at index
   public void addAtIndex(int index, int data)
   {
         //complete this method
   }
      
   //method #3: remove first node
   public void removeFirstNode()
   {
      head.next = head.next.next;
   }
      
   //method #4: remove last node
   public void removeLastNode()
   {
         //complete this method
   }

   //method #5: remove node at index
   public void removeAtIndex(int index)
   {
         //complete this method
   }

   //method #6: countNodes
   public int countNodes() {
      int listSize= 0;
      //complete this method
      //these methods returns the list size
      return listSize;
   }
   
   //method #7: printInReverse  (Recursive method)
   public void printInReverse(Node L)
   {
         //complete this method as recursive methods
   }   

   //================= end of your part ==============

   //method to print out the list
   public void printList() 
   {
      Node temp;
      temp = head;
      while (temp != null)
      {
         System.out.print(temp.data + "   ");
         temp = temp.next;
      }
   }

   //class to create nodes as objects
   private class Node
   {
      private int data;  //data field
      private Node next; //link field
      public Node(int item) //constructor method
      {
         data = item;
         next = null;
      }
   }
}

