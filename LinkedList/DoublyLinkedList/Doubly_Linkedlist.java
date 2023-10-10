package DSA.LinkedList.DoublyLinkedList;

public class Doubly_Linkedlist {
    Node head;
    Node tail;

    class Node{
        Node prevptr;
        int data;
        Node pointer;

        Node(int val){
            prevptr = null;
            data = val;
            pointer = null;
        }
    }

    Doubly_Linkedlist(){
        head = null;
        tail = null;
    }

    public void insertAtBeginning(int val){

        Node newNode = new Node(val);
        
        if(head==null){
            head = newNode;
            tail = newNode;
        }
        else{
            head.prevptr = newNode;
            newNode.pointer = head;
            head = newNode;
        }
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.pointer;
        }
    }
    public void displayRev(){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.prevptr;
        }
    }
    public void insertAtposition(int pos, int val){
        if(pos==0){
            insertAtBeginning(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        for(int i=1; i<=pos-1; i++){
            temp =temp.pointer;
            if(temp==null){
                throw new IndexOutOfBoundsException("Invalid Entry");
            }   
           newNode.pointer = temp.pointer;
           newNode.prevptr = temp;
           temp.pointer.prevptr = newNode;
           temp.pointer = newNode;
        }
    }
    public void DeletAtpos(int pos) {
		if(head==null){
            throw new IndexOutOfBoundsException("Delete ttemption on empty list");
        }
        if(pos==0){
            head = head.pointer;
        }
        else if(head==null){
            tail = null;
        }
        else{
            head.prevptr = null;
            return;
        }
        Node temp = head;
        Node prev = null;
        for(int i=1; i<=pos-1; i++){
            prev = temp;
            temp = temp.pointer;
            if(temp==null){
                 throw new IndexOutOfBoundsException("Invalid Entry");
            }
            prev.pointer = temp.pointer;
            if(temp.pointer==null){
                tail = prev;
            }
            else{
                temp.pointer.prevptr = prev;
            }
        }
	}
    public void DeleteAtBeginning(){
        if(head==null){
            throw new IndexOutOfBoundsException("Delete ttemption on empty list");
        }
        head = head.pointer;
        if(head==null){
            tail = null;
        }
        else{
            head.prevptr = null;
        }  
	}
}

