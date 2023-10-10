package DSA.Queue.LinkedList;

public class DemoFor_Queue_Linkedlist {
    public static void main(String[] args) {
        Queue_Linkedlist<String> Queue = new Queue_Linkedlist<String>();

        Queue.enqueue("Dharani");
        Queue.enqueue("Dhina");
        Queue.enqueue("Yogesh");
        System.out.println(Queue.dequeue());
        System.out.println(Queue.isEmpty());
        System.out.println(Queue.peek());
    }
}
