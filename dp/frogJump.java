// // // public interface frogJump {
    
// // // }

// // import java.util.*;

// // class Solution {
// //     private int solve(int ind, int[] height, int[] dp) {
// //         if (ind == 0) return 0;
// //         if (dp[ind] != -1) return dp[ind];
// //         int jumpTwo = Integer.MAX_VALUE;
// //         int jumpOne = solve(ind - 1, height, dp) + Math.abs(height[ind] - height[ind - 1]);
// //         if (ind > 1) {
// //             jumpTwo = solve(ind - 2, height, dp) + Math.abs(height[ind] - height[ind - 2]);
// //         }
// //         dp[ind] = Math.min(jumpOne, jumpTwo);
// //         return dp[ind];
// //     }

// //     public int frogJumps(int[] height) {
// //         if (height == null || height.length == 0) return 0;
// //         int n = height.length;
// //         int[] dp = new int[n];
// //         Arrays.fill(dp, -1);
// //         return solve(n - 1, height, dp);
// //     }
// // }

// // public class  frogJump {
// //     public static void main(String[] args) {
// //         int[] height = {30, 10, 60, 10, 60, 50};
// //         Solution sol = new Solution();
// //         System.out.println(sol.frogJumps(height));
// //     }
// // }


// //tabluation approach 
// import java.util.*;

// class Solution {
//     public int frogJump(int[] height) {
//         if (height == null || height.length == 0) return 0;
//         int n = height.length;
//         int[] dp = new int[n];
//         Arrays.fill(dp, Integer.MAX_VALUE);
//         dp[0] = 0;

//         for (int ind = 1; ind < n; ind++) {
//             int jumpOne = dp[ind - 1] + Math.abs(height[ind] - height[ind - 1]);
//             int jumpTwo = Integer.MAX_VALUE;
//             if (ind > 1) {
//                 jumpTwo = dp[ind - 2] + Math.abs(height[ind] - height[ind - 2]);
//             }
//             dp[ind] = Math.min(jumpOne, jumpTwo);
//         }
//         return dp[n - 1];
//     }
// }

//  public class frogJump {
//     public static void main(String[] args) {
//         int[] height = {30, 10, 60, 10, 60, 50};
//         Solution sol = new Solution();
//         System.out.println(sol.frogJump(height)); 
//     }
// }

//tc: O(n)
//sc: O(n)




