public class ClimbingStairsMemo {
    public static int climbingCount(int n , int[] dp) {
        if(n == 0 || n == 1) {
            return n;
        }

        if(dp[n] != -1) {
            return dp[n];
        }

        dp[n] = climbingCount(n - 2,  dp) + climbingCount(n - 1, dp);

        return dp[n];
    }
}
