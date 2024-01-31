package Queue;

public class Queue<T> {
    static final int MaxSize = 30;
    T arr[] = (T[]) new Object[MaxSize];
    int front;

    Queue() {
        front = -1;
    }

    public void enqueue(T val) {
        if (front == MaxSize - 1) {
            throw new IndexOutOfBoundsException("Queue is full");
        } else {
            arr[++front] = val;
        }
    }

    public T dequeue() {
        if (front == -1) {
            throw new IndexOutOfBoundsException("Queue is full");
        } else {
            T temp = (T) arr[0];
            for (int i = 1; i <= front; i++) {
                arr[i - 1] = arr[i];
            }
            front--;
            return temp;
        }
    }
}
