package DSA.Queue.Array;

public class Array_In_Queue<T>{
    static final int MaxSize = 30;
    T arr[] = (T[])new Object[MaxSize];
    int rear;
     Array_In_Queue(){
        rear = -1;
     }
     public void enqueue(T val){
        if(rear==MaxSize-1){
            throw new IndexOutOfBoundsException("Queue is full");
        }
        else{
            arr[++rear] = val;
        }
     }
     public T dequeue(){
        if(rear==-1){
            throw new IndexOutOfBoundsException("Queue is full");
        }
        else{
            T temp = (T) arr[0];
            for(int i=1; i<=rear; i++){
                arr[i-1] = arr[i];
            }
            rear--;
            return temp;
        }
     }
}
