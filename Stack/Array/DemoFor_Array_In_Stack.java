package DSA.Stack.Array;

public class DemoFor_Array_In_Stack {
    public static void main(String[] args) {
        Array_In_Stack <Integer> stack = new Array_In_Stack<Integer>();

        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
