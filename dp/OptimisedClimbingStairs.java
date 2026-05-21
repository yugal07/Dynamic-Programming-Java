public class OptimisedClimbingStairs {
    public static int climb(int n) {
        if(n  == 0 || n == 1) {
            return n;
        }

        int prev2 = 1;
        int prev1 = 1;

        for(int i = 2 ; i <= n ; i++) {
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    } 
}
