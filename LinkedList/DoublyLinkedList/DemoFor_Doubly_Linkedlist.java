package DSA.LinkedList.DoublyLinkedList;

public class DemoFor_Doubly_Linkedlist {
    public static void main(String[] args) {

        Doubly_Linkedlist list = new Doubly_Linkedlist();
        
        list.insertAtBeginning(3);
        list.insertAtBeginning(2);
        list.insertAtBeginning(1);
        list.display();

        System.out.println(" ");
        list.displayRev();

        System.out.println(" ");
        list.insertAtposition(2,9);
        System.out.println(" ");
        list.display();
        System.out.println(" ");
        list.displayRev();

        System.out.println(" ");
        list.DeletAtpos(3);
        list.display();
        System.out.println(" ");
        list.displayRev();

        System.out.println(" ");
        list.DeleteAtBeginning();
        list.display();
        System.out.println(" ");
        list.displayRev();
    }
    
}
