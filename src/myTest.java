// Name: Brendan Woods
// Class: CS 3305/01
// Term: Fall 2022
// Instructor: Dr. Haddad
// Assignment: 3
// IDE Name: IntelliJ

import java.util.Scanner;

public class myTest {
   public static void main (String[] args) {
      Scanner input = new Scanner(System.in);

      LinkedList myList = new LinkedList(); //create a list object
   
      for (int i=1; i <= 5; i++) //add 5 nodes to the list
      {
         myList.addLastNode(i*10);
      } 
      
      //print out the list content
      System.out.print("My test list values are:  ");
      myList.printList();
      System.out.println();    
   }

   private static void printMenu() {
      System.out.println("---------MAIN MENU--------");
      System.out.println("1 – Add First Node");
      System.out.println("2 – Add Last Node");
      System.out.println("3 – Add At Index");
      System.out.println("4 – Remove First Node");
      System.out.println("5 – Remove Last Node");
      System.out.println("6 – Remove At Index");
      System.out.println("7 – Print List Size");
      System.out.println("8 – Print List (Forward)");
      System.out.println("9 – Print List In Reverse");
      System.out.println("10- Exit program");
      System.out.println("");
      System.out.print("Enter option number: ");
   }
}

