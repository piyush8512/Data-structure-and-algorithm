// class Solution {
//     public int maxProduct(int[] nums) {
//         int maxProd = nums[0];
//         for (int i = 0; i < nums.length; i++) {
//             int prod = 1;
//             for (int j = i; j < nums.length; j++) {
//                 prod *= nums[j];
//                 maxProd = Math.max(maxProd, prod);
//             }
//         }
//         return maxProd;
//     }
// }

// public class MaximumProductSubarrayinanArray {
//     public static void main(String[] args) {
//         int[] nums = {2, 3, -2, 4};
//         Solution sol = new Solution();
//         System.out.println(sol.maxProduct(nums));
//     }
// }

// // Time Complexity: O(n^2) - We have two nested loops, each iterating through the array.
// // Space Complexity: O(1) - We are using a constant amount of space to store

//---------------------``-------------------

// // This class contains the function to find maximum product subarray
// // using prefix and suffix traversal
// class Solution {
//     public int maxProductSubArray(int[] arr) {
//         int n = arr.length;
//         int pre = 1, suff = 1;
//         int ans = Integer.MIN_VALUE;
//         for (int i = 0; i < n; i++) {
//             if (pre == 0) pre = 1;
//             if (suff == 0) suff = 1;
//             pre *= arr[i];
//             suff *= arr[n - i - 1];
//             ans = Math.max(ans, Math.max(pre, suff));
//         }
//         return ans;
//     }
// }

// // Separate Main class for testing
// class MaximumProductSubarrayinanArray {
//     public static void main(String[] args) {
//         int[] arr = {2, 3, -2, 4};
//         Solution sol = new Solution();
//         System.out.println(sol.maxProductSubArray(arr));
//     }
// }

// // Time Complexity: O(n) - We traverse the array twice (once from the start and once from the end).
// // Space Complexity: O(1) - We are using a constant amount of space to store
// // the variables for prefix and suffix products.     


class Solution {
    public int maxProduct(int[] nums) {
        int res = nums[0];
        int maxProd = nums[0];
        int minProd = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];

            if (curr < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            maxProd = Math.max(curr, maxProd * curr);
            minProd = Math.min(curr, minProd * curr);
            res = Math.max(res, maxProd);
        }
        return res;
    }
}

public class MaximumProductSubarrayinanArray {
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        Solution sol = new Solution();
        System.out.println(sol.maxProduct(nums));
    }
}
// Time Complexity: O(n) - We traverse the array once.
// Space Complexity: O(1) - We are using a constant amount of space to store
