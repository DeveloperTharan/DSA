package DSA.LinkedList.LinkedList;

public class Linkedlist {
	// Head
	Node head;
	
	// Node
	class Node{
		//Data
		int data;
		//Pointer
		Node pointer;
		
		// constructor for Node
		Node(int val){
			data = val;
			pointer = null;
		}
	}
	
	// constructor for Linkedlist 
	Linkedlist(){
		head = null;
	}
	
	// insertAtBeginning
	public void insertAtBeginning(int val) {
		Node newNode = new Node(val);
		
		//when list is empty
		if(head==null) {
			head = newNode;
		}
		// list is non-empty
		else {
			newNode.pointer = head;
			head = newNode;
		}
	}
	
	// Traverse
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.pointer;
		}
	}
	
	//insertAtposition
	public void insertAtpos(int pos, int val) {
		if(pos==0) {
			insertAtBeginning(val);
			return;
		}
		
		Node newNode = new Node(val);
		Node temp = head;
		
		for(int i=1; i<=pos-1; i++) {
			temp = temp.pointer;
			  //for Invalid enter position
			  if(temp==null) {
				  throw new IndexOutOfBoundsException("Invalid position "+ pos);
			  }
		}
		newNode.pointer = temp.pointer;
		temp.pointer = newNode;
	}
	
	// deletAtposition
	public void deletAtpos(int pos) {
		if(head==null) {
			throw new IndexOutOfBoundsException("Delision attempted on empty list");
		}
		//for 0th position deleting
		if(pos==0) {
			head = head.pointer;
			return;
		}
		Node temp = head;
		Node prev = null;
		
		for(int i=1; i<=pos; i++) {
			prev = temp;
			temp = temp.pointer;
		}
		prev.pointer = temp.pointer;
	}
     
    // Reverse the Node
    public void ReverseThelist(){
        Node previous = null;
        Node current = head;
        Node next = head.pointer;

        while(current != null){
            next = current.pointer;
            current.pointer = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }
} 
    

