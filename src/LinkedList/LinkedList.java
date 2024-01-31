package LinkedList;

import java.util.NoSuchElementException;

public class LinkedList {
    // Node class
    private class Node {
        private int value;
        private Node next;

        // constructor for Node class
        public Node(int value) {
            this.value = value;
        }
    }

    // declaring 2 node points Head as first & Tail as Last
    private Node first;
    private Node last;

    // is a function check linkedlist is empty or not
    private boolean isEmpty() {
        return first == null;
    }

    public void Print() {
        /*
         * to print the list
         * create a variable current in refer first
         * now run the loop until current equal to null
         * inside the loop print the current node value
         * then change current node position to current node next
         */
        var current = first;

        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
    }

    public void addLast(int item) {
        var node = new Node(item);
        /*
         * if the first node was empty then there is no last node.
         * so, mark first and last as same node,
         * else, last node pointer is null now, change the pointer into new node
         * then change last node as new node
         */
        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int item) {
        var node = new Node(item);
        /*
         * if the first node was empty then there is no node.
         * so, mark first and last as same node,
         * else, if already first node is there then,
         * point the new node pointer into first node then
         * change first into new node
         */
        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
    }

    public void addAt(int pos, int item) {
        /*
         * check is node is empty if empty then add and mark as first last as same
         * if position is 0 index then point new node next into first then change first
         * into new node
         * else, create two variable current & temp initially temp is null current
         * refers first
         * then run the loop until ten position - 1 reachs then we get to nodes current
         * & current -1 in temp
         * then change ther pointers through point new node next into current then temp
         * next into new node
         */
        var node = new Node(item);

        if (isEmpty()) {
            first = last = node;
            return;
        }

        if (pos == 0) {
            node.next = first;
            first = node;
            return;
        }

        var current = first;
        Node temp = null;

        for (int i = 1; i < pos; i++) {
            if (current.next == null) {
                throw new IllegalArgumentException();
            }
            temp = current;
            current = current.next;
        }

        node.next = current;
        temp.next = node;
    }

    public int IndexOf(int value) {
        /*
         * now, create index variable as initialy 0 and current node variable initialy
         * at first node
         * then, create a loop it will run current noe equal to null (the case the null
         * was only appear at last node pointer)
         * if the current node value equal to the gien value the return the index
         * so, run the loop, on the way increase the current node position into next
         * node
         * and also increase the index into +1
         */
        int index = 0;
        Node current = first;

        while (current != null) {
            if (current.value == value)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        /*
         * now, this case we need to find item is exist in the node
         * we use IndexOf function above we created
         * this IndexOf function return the index if node exist else it will return -1
         * so, check IndexOf item is not equal to -1 then is true (exist) else false
         * (not exist)
         */
        return IndexOf(item) != -1;
    }

    public void removeFirst() {
        /*
         * check is empty if is empty throw error
         * else, again check first and last are same
         * if same then remove by giving both into null
         * else create a second variable it refering seond node by giving first.next
         * now, remove first node by giving first as null
         * then change first as second now the link does no break
         */
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            first = last = null;
            return;
        }

        var second = first.next;
        first = null;
        first = second;
    }

    private Node getPrevoiusNode(Node node) {
        /*
         * this private method return node
         * first, create a variable it refer the first node
         * then, create a loop it will run until the current is not equal to null
         * if the current node next is equal to the node we passed then return the node
         * else, run the loop on the way increament the current node in to current node
         * next
         * if the loop break the return null
         */
        var current = first;
        while (current != null) {
            if (current.next == node)
                return current;
            current = current.next;
        }
        return null;
    }

    public void removeLast() {
        /*
         * check is empty if is empty throw error
         * else, again check first and last are same
         * if same then remove by giving both into null
         * else call the getPreviousNode and passing last node it will give the
         * previousNode
         * now, stor the previous node into previous then change last node as previous
         * then previous node next change ito null
         * now we can remove the last node without break
         */
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            first = last = null;
        }

        var previous = getPrevoiusNode(last);
        last = previous;
        previous.next = null;
    }

    public void removeAt(int pos) {
        /*
         * check isEmpty,
         * them check the position was 0'th index then change the head into next
         * else, create two variable current & temp the current refer first & temp
         * initially null
         * then run the loop i lessthen or equal to position on the way change temp into
         * current & increase current into current next
         * the code exited the loop we have temp node and current node
         * then change current node into current node next
         * then change temp node next into current node it will remove the node without
         * break.
         */
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (pos == 0) {
            first = first.next;
            return;
        }

        Node current = first;
        Node temp = null;

        for (int i = 1; i <= pos; i++) {
            if (current.next == null) {
                throw new IllegalArgumentException();
            }
            temp = current;
            current = current.next;
        }
        current = current.next;
        temp.next = current;
    }

    public int Size() {
        /*
         * check if the list is empty if empty return 0
         * else, create two variable current & size
         * current refer first & size initially 0
         * then run the loop until current equal to null
         * then inside the loop change current position into current next
         * then increase size into 1
         */
        if (isEmpty()) {
            return 0;
        }

        var current = first;
        int size = 0;

        while (current != null) {
            current = current.next;
            size++;
        }
        return size;
    }

    public int[] toArray() {
        /*
         * checking is empty
         * create 2 varialble urrent refers first & index initially 0
         * create a new array with the size of size function
         * run the loop then inside the array get the value of current node the plae
         * into new array
         * then change the position of urrent & increase index by 1
         * finaly return the array
         */
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        var current = first;
        int index = 0;

        int[] array = new int[Size()];

        while (current != null) {
            array[index] = current.value;
            current = current.next;
            index++;
        }

        return array;
    }

    public void reverse() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        Node prev = null;
        Node current = first;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        first = prev;
    }

    public int getKthElement(int k){
        /* 
         * finding kth node from end of the linked list
         * create two pointer start & end
         * then loop the end pointer to k - 1 times the we get some distance this distance is must
         * then we ge new end position of end node
         * then, run the another loop this oop run end node next not equal to null
         * then, inside the loop change both nodes position
         * one the loop is break we got the value at start node value
         */
        if(isEmpty() || k < 0){
            throw new IllegalStateException();
        }
        var start = first;
        var end = first;

        for(int i=0; i<k-1; i++){
            end = end.next;

            if(end == last){
                throw new IllegalArgumentException();
            }
        }

        while(end.next != null){
            start = start.next;
            end = end.next;
        }
        return start.value;
    }
}