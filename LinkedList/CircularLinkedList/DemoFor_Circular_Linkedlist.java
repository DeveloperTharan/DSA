package  DSA.LinkedList.CircularLinkedList;

public class DemoFor_Circular_Linkedlist{
    public static void main(String[] args) {
        
        Circular_Linkedlist<String> list = new Circular_Linkedlist<String>();

        list.insertAtBeginning("ram");
        list.insertAtBeginning("janu");
        list.insertAtBeginning("DT");

        list.insertAtEnd("BB");
        list.display();

        System.out.println(" ");
        list.DeleteAtBeginning();
        list.display();

        System.out.println(" ");
        list.DeleteAtEnd();
        list.display();
    }
}