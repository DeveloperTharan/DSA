package DSA.Queue.Array;

public class DemoFor_Array_In_Queue {
    public static void main(String[] args) {
        Array_In_Queue<Integer> queue = new Array_In_Queue<Integer>();

        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(5);
        queue.enqueue(4);
        System.out.println(queue.dequeue());
    }
}
