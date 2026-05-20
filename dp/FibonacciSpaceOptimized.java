public class FibonacciSpaceOptimized {
    public static long findFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        long prev2 = 0;
        long prev1 = 1;

        for (int i = 2; i <= n; i++) {
            long curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci number at position 5 is " + findFibonacci(5));
        System.out.println("Fibonacci number at position 10 is " + findFibonacci(10));
        System.out.println("Fibonacci number at position 15 is " + findFibonacci(15));
    }
}
