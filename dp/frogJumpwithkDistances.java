// // public class frogJumpwithkDistances {

// // }

// import java.util.*;

// class Solution {
//     public int solveUtil(int ind, List<Integer> height, int[] dp, int k) {
//         if (ind == 0) return 0;
//         if (dp[ind] != -1) return dp[ind];
//         int mmSteps = Integer.MAX_VALUE;
//         for (int j = 1; j <= k; j++) {
//             if (ind - j >= 0) {
//                 int jump = solveUtil(ind - j, height, dp, k) + Math.abs(height.get(ind) - height.get(ind - j));
//                 mmSteps = Math.min(jump, mmSteps);
//             }
//         }
//         return dp[ind] = mmSteps;
//     }

//     public int solve(int n, List<Integer> height, int k) {
//         int[] dp = new int[n];
//         Arrays.fill(dp, -1);
//         return solveUtil(n - 1, height, dp, k);
//     }
// }

// public class frogJumpwithkDistances {
//     public static void main(String[] args) {
//         List<Integer> height = Arrays.asList(30, 10, 60, 10, 60, 50);
//         int n = height.size();
//         int k = 2;
//         Solution sol = new Solution();
//         System.out.println(sol.solve(n, height, k));
//     }
// }

//o(n * k)
//tc o(n)

//tabulation approach 
import java.util.*;

class Solution {
    public int solveUtil(int n, List<Integer> height, int[] dp, int k) {
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            int mmSteps = Integer.MAX_VALUE;
            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    int jump = dp[i - j] + Math.abs(height.get(i) - height.get(i - j));
                    mmSteps = Math.min(mmSteps, jump);
                }
            }
            dp[i] = mmSteps;
        }
        return dp[n - 1];
    }

    public int solve(int n, List<Integer> height, int k) {
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return solveUtil(n, height, dp, k);
    }
}

public class frogJumpwithkDistances {

    public static void main(String[] args) {
        List<Integer> height = Arrays.asList(30, 10, 60, 10, 60, 50);
        int n = height.size();
        int k = 2;
        Solution sol = new Solution();
        System.out.println(sol.solve(n, height, k));
    }
}


//tc: O(n * k)
//sc: O(n)
