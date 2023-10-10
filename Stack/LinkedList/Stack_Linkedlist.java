package DSA.Stack.LinkedList;

public class Stack_Linkedlist<T>{
    Node top;

    class Node{
        T data;
        Node pointer;

    Node(T val){
        data = val;
        pointer = null;
        }
    } 
    Stack_Linkedlist(){
        top = null;
    }  
    
    public void push(T val){
        Node newNode = new Node(val);
            newNode.pointer = top;
            top = newNode;
    }

    public T pop(){
        if(top==null){
            throw new IndexOutOfBoundsException("Invalid");
        }
        else{
            T temp = top.data;
            top = top.pointer;
            return temp;
        }
    }

    public boolean isEmpty(){
        return top==null;
    }

    public T peek(){
        return top.data;
    }
}
