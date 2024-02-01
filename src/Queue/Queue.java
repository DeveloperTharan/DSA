package Queue;

public class Queue {
    static final int MaxSize = 3;
    int[] arra = new int[MaxSize];
    int front;
    int rear;

    public Queue() {
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        if(rear == MaxSize - 1){
            return true;
        }
        return false;
    }

    public void enqueue(int value) {
        if (isEmpty()) {
            arra[++front] = value;
            rear++;
            return;
        }
        arra[++rear] = value;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException();
        }
        return arra[front++];
    }

    public int Peek() {
        if(isEmpty()){
            throw new IllegalArgumentException();
        }
        return arra[front];
    }
}
