// Name: Brendan Woods
// Class: CS 3305/01
// Term: Fall 2022
// Instructor: Dr. Haddad
// Assignment: 3
// IDE Name: IntelliJ

/**
 * Done with
 * addFirst
 * addLast
 * printForward
 * removeFirst
 * size is bugged Need to correct
 *
 * Need to do
 * Add at index
 * Remove Last Node
 * Remove at index
 * Print In Reverse
 * */

import java.util.Scanner;

public class myTest {
   public static void main (String[] args) {

      Scanner input = new Scanner(System.in);

      LinkedList myList = new LinkedList(); //create a list object

      int option, data;

      //for (int i=1; i <= 5; i++) //add 5 nodes to the list
      //{
         //myList.addLastNode(i*10);
      //}

      while (true) {

         printMenu();
         option = input.nextInt();

         switch (option) {

            case 1: // Add First Node

               System.out.println();
               System.out.println("Testing method addFirstNode()");
               System.out.print("Enter the number to add: ");
               data = input.nextInt();

               System.out.println("Adding value " + data + " as first node.");
               System.out.print("List content before adding " + data + " is: ");
               myList.printList();
               System.out.println();

               myList.addFirstNode(data);

               System.out.print("List content after adding " + data + " is: ");
               myList.printList();
               System.out.println();
               System.out.println();

               break;
            case 2: // Add Last Node

               System.out.println();
               System.out.println("Testing method addLastNode()");
               System.out.print("Enter the number to add: ");
               data = input.nextInt();

               System.out.println("Adding value " + data + " as last node.");
               System.out.print("List content before adding " + data + " is: ");
               myList.printList();
               System.out.println();

               myList.addLastNode(data);

               System.out.print("List content after adding " + data + " is: ");
               myList.printList();
               System.out.println();
               System.out.println();

               break;
            case 3: // Add at Index

               /** Need to complete */

               break;
            case 4: // Remove First Node

               System.out.println();
               System.out.println("Testing removeFirstNode()");
               System.out.println();

               break;
            case 5: // Remove Last Node

               /** Need to complete */

               break;
            case 6: // Remove At Index

               /** Need to complete */

               break;
            case 7: // Print List Size

               System.out.println();
               System.out.println("The size of the list is: " + myList.countNodes());
               System.out.println();

               break;
            case 8: // Print List (Forward)

               System.out.println();
               System.out.println("Testing printList()");
               System.out.print("The list printed forwards is: ");
               myList.printList();
               System.out.println();

               break;
            case 9: // Print List in Reverse

               /** Need to complete */

               break;
            case 10: // Exit Program
               System.exit(-1);
               break;
         }
      }
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