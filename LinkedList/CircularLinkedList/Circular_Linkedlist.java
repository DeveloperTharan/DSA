package DSA.LinkedList.CircularLinkedList;

public class Circular_Linkedlist<T> {
    Node last;

     class Node{
        T data;
        Node pointer;

        Node(T val){
            data = val;
            pointer = null;
        }
     }
     Circular_Linkedlist(){
        last = null;
     }

     public void insertAtBeginning(T val){
        Node newNode = new Node(val);
        if(last==null){
            newNode.pointer = newNode;
            last = newNode;
        }
        else{
            newNode.pointer = last.pointer;
            last.pointer = newNode;
        }
     }
     public void insertAtEnd(T val){
        Node newNode = new Node(val);
        if(last==null){
            newNode.pointer = newNode;
            last = newNode;
        }
        else{
            newNode.pointer = last.pointer;
            last.pointer = newNode;
            last = newNode;
        }
     }
     public void display(){
        if(last==null){
            return;
        }
        Node temp = last.pointer;
        do{
            System.out.print(temp.data+" ");
            temp = temp.pointer;
        }while(temp!=last.pointer);
     }
     public T DeleteAtBeginning(){
        T temp = last.pointer.data;
        if(last==null){
            throw new IndexOutOfBoundsException("Delete Attemption on Empty List");
        }
        else if(last.pointer==last){
            last = null;
        }
        else{
            last.pointer = last.pointer.pointer;
        }
        return temp;
     }
     public void DeleteAtEnd(){
         if(last==null){
            throw new IndexOutOfBoundsException("Delete Attemption on Empty List");
        }
        else if(last.pointer==last){
            last = null;
        }
        else{
            Node temp = last.pointer;
            while(temp.pointer!=last){
                temp = temp.pointer;
            }
            temp.pointer = last.pointer;
            last = temp;
        }
     }
}
