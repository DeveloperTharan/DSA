package Queue;

public class Main {
    public static void main(String[] args) {
        var queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue("a");
        queue.enqueue("abc");
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue());
    }
}
