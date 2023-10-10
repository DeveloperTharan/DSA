package DSA.Stack.LinkedList;

public class DemoFor_Linkedlist_Stack {
    public static void main(String[] args) {
        Stack_Linkedlist<Integer> stack = new Stack_Linkedlist<Integer>();

        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
