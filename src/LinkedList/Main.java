package LinkedList;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        /* list.addFirst(5);
        list.addAt(2, 80);
        System.out.println(list.IndexOf(30));
        System.out.println(list.contains(10));
        list.removeFirst();
        list.removeLast();
        list.removeAt(0);
        list.Print();
        System.out.println();
        System.out.println(list.Size()); */
        list.reverse();
        System.out.println(Arrays.toString(list.toArray()));
    }
}