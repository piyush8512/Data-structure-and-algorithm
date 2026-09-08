


class Solution {
    public int fib(int n) {
        if (n <= 1) return n;
        int[] dp = new int[n + 1]; // Creating dp array
        dp[0] = 0;          // Initializinig base cases
        dp[1] = 1;
        for (int i = 2; i <= n; i++) dp[i] = dp[i - 1] + dp[i - 2]; //Filling dp array iteratively
        return dp[n];
    }

}



public class Fibonacciusingtabulation {
    public static void main(String[] args) {
        int n = 10;
        Solution sol = new Solution();
        System.out.println(sol.fib(n));
    }
}
