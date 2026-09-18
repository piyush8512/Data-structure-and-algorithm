
// // //memoization
// // import java.util.Arrays;
// // class Solution {
// //     public int solve(int[] arr, int i, int[] dp) {
// //         if (i < 0) return 0;
// //         if (i == 0) return arr[0];
// //         if (dp[i] != -1) return dp[i];
// //         int pick = arr[i] + solve(arr, i - 2, dp);
// //         int notPick = solve(arr, i - 1, dp);
// //         return dp[i] = Math.max(pick, notPick);
// //     }

// //     public int maximumNonAdjacentSum(int[] arr) {
// //         int n = arr.length;
// //         int[] dp = new int[n];
// //         Arrays.fill(dp, -1);
// //         return solve(arr, n - 1, dp);
// //     }
// // }

// // public class maximumsumofnonadjacentelements {
// //     public static void main(String[] args) {
// //         int[] arr = {2, 1, 4, 9};
// //         Solution obj = new Solution();
// //         System.out.println(obj.maximumNonAdjacentSum(arr));
// //     }
// // }

// // //tc: O(n)
// // //sc: O(n)


// // //tabulation



// class Solution {
//     public int maximumNonAdjacentSum(int[] arr) {
//         int n = arr.length;
//         if (n == 1) return arr[0];
//         int[] dp = new int[n];
//         dp[0] = arr[0];
//         dp[1] = Math.max(arr[0], arr[1]);
//         for (int i = 2; i < n; i++) {
//             dp[i] = Math.max(arr[i] + dp[i - 2], dp[i - 1]);
//         }
//         return dp[n - 1];
//     }
// }

// public class maximumsumofnonadjacentelements {
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int[] arr = {2, 1, 4, 9};
//         System.out.println(sol.maximumNonAdjacentSum(arr));
//     }
// }


// //tc: O(n)
// //sc: O(n)

//moreoptimized 
class Solution {
    public int maxSum(int[] nums) {
        if (nums.length == 0) return 0;
        int prev2 = 0;
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int include = nums[i] + prev2;
            int exclude = prev;
            int curr = Math.max(include, exclude);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}

public class maximumsumofnonadjacentelements {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 10, 7};
        Solution obj = new Solution();
        System.out.println(obj.maxSum(arr));
    }
}

//tc: O(n)
//sc: O(1)