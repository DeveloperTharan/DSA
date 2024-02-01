package stack;

public class Stack {
    static final int MaxSize = 30;
    int[] arr = new int[MaxSize];
    int top;

    Stack() {
        top = -1;
    }

    public void push(int val) {
        if (top == MaxSize - 1) {
            throw new IndexOutOfBoundsException("Stack is full");
        } else {
            arr[++top] = val;
        }
    }

    public int pop() {
        if (top == -1) {
            throw new IndexOutOfBoundsException("Stack is Empty");
        }
        return arr[top--];
    }

    public int peek() {
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}