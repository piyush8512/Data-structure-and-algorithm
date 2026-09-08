import java.util.*;

class Solution {
        public int fib(int n, int[] dp) {
        if (n <= 1) return n;
        if (dp[n] != -1) return dp[n];
        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
        return dp[n];
    }
}

public class Fibonacciusingmemo {
    public static void main(String[] args) {
        int n = 10;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        Solution sol = new Solution();
        System.out.println(sol.fib(n, dp));
    }
}


