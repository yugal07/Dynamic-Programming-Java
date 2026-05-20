import java.util.Arrays;

public class FibonacciDP {
    static long[] dp;

    public static long findFibonacci(int n) {
        dp = new long[n + 1];
        Arrays.fill(dp, -1);

        return fibonacci(n);
    }

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        return dp[n] = fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci number at position 5 is " + findFibonacci(5));
        System.out.println("Fibonacci number at position 10 is " + findFibonacci(10));
        System.out.println("Fibonacci number at position 15 is " + findFibonacci(15));
    }
}
