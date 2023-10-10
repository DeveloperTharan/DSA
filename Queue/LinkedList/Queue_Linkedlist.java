package DSA.Queue.LinkedList;

public class Queue_Linkedlist<T> {
    Node front,rear;

    class Node{
        T data;
        Node pointer;

        Node(T val){
            data = val;
            pointer = null;
        }
    }
    Queue_Linkedlist(){
          front = null;
          rear = null;  
    }
    public void enqueue(T val){
        Node newNode = new Node(val);
        if(front==null){
            front = newNode;
            rear = newNode;
        }
        else{
            rear.pointer = newNode;
            rear = newNode;
        }
    }
    public T dequeue(){
        if(front==null){
            throw new IndexOutOfBoundsException("Queue is Empty");
        }
        else{
            T temp = front.data;
            front = front.pointer;
            if(front==null){
                rear = null;
            }
            return temp; 
        }
    }
    public boolean isEmpty(){
        return front==null;
    }
    public T peek(){
        if(front==null){
            throw new IndexOutOfBoundsException("Queue is Empty");
        }
        return front.data;
    }
}
