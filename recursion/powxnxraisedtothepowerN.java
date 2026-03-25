// package recursion;

// public class powxnxraisedtothepowerN {
    

// }


class Solution {
    public double myPow(double x, int n) {
        if (n == 0 || x == 1.0) return 1; 
        long temp = n;
        if (n < 0) {
            x = 1 / x;
            temp = -1L * n;
        }
        double ans = 1;
        for (long i = 0; i < temp; i++) {
            ans *= x; 
        }
        return ans;
    }
}

class powxnxraisedtothepowerN {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.printf("%.4f\n", sol.myPow(2.0000, 10));
        System.out.printf("%.4f\n", sol.myPow(2.0000, -2));
    }
}

// o(n) time complexity
// o(1) space complexity