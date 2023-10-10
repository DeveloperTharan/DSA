package DSA.Stack.Array;

public class Array_In_Stack<T> {
    static final int MaxSize = 30;
    T[] arr = (T[])new Object[MaxSize];
    int top;

    Array_In_Stack(){
        top = -1;
    }

    public void push(T val){
        if(top==MaxSize-1){
            throw new IndexOutOfBoundsException("Stack is full");
        }
        else{
            arr[++top] = val;
        }
    }

    public T pop(){
        if(top==-1){
            throw new IndexOutOfBoundsException("Stack is Empty");
        }
        return arr[top--];
    }

    public T peek(){
        return arr[top];
    }

    public boolean isEmpty(){
        return top==-1;
    }
}
