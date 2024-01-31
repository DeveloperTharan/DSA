package stack;

public class Main {
    public static void main(String[] args) {
        var stack = new Stack();
        stack.push(1);
        stack.push("a");
        stack.push("abcd");
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());
        stack.isEmpty();
    }
}