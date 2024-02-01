package Queue;

public class Main {
    public static void main(String[] args) {
        var queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(10);
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());
        System.out.println(queue.Peek());
        System.out.println(queue.isFull());
    }
}
