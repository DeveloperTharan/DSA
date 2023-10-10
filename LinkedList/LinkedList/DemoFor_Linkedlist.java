package DSA.LinkedList.LinkedList;

public class DemoFor_Linkedlist {
    public static void main(String[] args) {
		
        Linkedlist list = new Linkedlist();
        
        list.insertAtBeginning(4);
        list.insertAtBeginning(3);
        list.insertAtBeginning(2);
        list.insertAtBeginning(1);
        list.display();
		
        System.out.println("");
		list.insertAtpos(0,6);
		list.display();
		
		System.out.println("");
		list.deletAtpos(0);
		list.display();

        System.out.println(" ");
        list.ReverseThelist();
        list.display();
    }
}