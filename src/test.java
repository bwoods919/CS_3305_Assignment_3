public class test {

    public static void main(String[] args) {

        LinkedList myList = new LinkedList(); //create a list object

        for (int i=1; i <= 5; i++) //add 5 nodes to the list
        {
            myList.addLastNode(i*10);
        }

        //myList.addAtIndex(1, 2);

        //print out the list content
        System.out.print("My test list values are:  ");
        myList.printList();
        System.out.println();

        myList.removeAtIndex(10);

        System.out.println();
        System.out.print("My test list values are:  ");
        myList.printList();
        System.out.println();

    }
}
