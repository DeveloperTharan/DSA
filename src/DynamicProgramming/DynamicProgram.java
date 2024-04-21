package DynamicProgramming;

public class DynamicProgram {
    /* Function to calculate the nth Fibonacci number */
    public int Fibonacci(int n) {
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        
        return fib[n];
    }
}
