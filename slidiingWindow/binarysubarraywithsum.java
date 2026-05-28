// // // // public class binarysubarraywithsum {
    
// // // // }


// // // //bruteforce approach
// // //      class Solution {
// // //     public int numSubarraysWithSum(int[] nums, int goal) {
// // //         int count = 0;
// // //         for (int start = 0; start < nums.length; start++) {
// // //             int sum = 0;
// // //             for (int end = start; end < nums.length; end++) {
// // //                 sum += nums[end];
// // //                 if (sum == goal) {
// // //                     count++;
// // //                 }
// // //             }
// // //         }
// // //         return count;
// // //     }
// // // }

// // // // Driver code
// // // public class binarysubarraywithsum {
// // //     public static void main(String[] args) {
// // //         Solution obj = new Solution();
// // //         int[] nums = {1, 0, 1, 0, 1};
// // //         int goal = 2;
// // //         // Output : 4
// // //         System.out.println(obj.numSubarraysWithSum(nums, goal)); 
// // //     }
// // // }

// // // // Time Complexity: O(n^2) - We have two nested loops, each iterating through the array.
// // // // Space Complexity: O(1) - We are using a constant amount of extra space to




// // //better approach
// // import java.util.*;

// // class Solution {
// //     public int numSubarraysWithSum(int[] nums, int goal) {
// //         Map<Integer, Integer> prefixSumCount = new HashMap<>();
// //         int count = 0, sum = 0;
// //         prefixSumCount.put(0, 1);
// //         for (int num : nums) {
// //             sum += num;
// //             if (prefixSumCount.containsKey(sum - goal)) {
// //                 count += prefixSumCount.get(sum - goal);
// //             }
// //             prefixSumCount.put(sum, prefixSumCount.getOrDefault(sum, 0) + 1);
// //         }
// //         return count;
// //     } 
// // }

// // public class binarysubarraywithsum {
// //     public static void main(String[] args) {
// //         Solution sol = new Solution();
// //         int[] nums = {1, 0, 1, 0, 1};
// //         int goal = 2;
// //         System.out.println(sol.numSubarraysWithSum(nums, goal));
// //     }
// // }


// // // Time Complexity: O(n) - We traverse the array once.
// // // Space Complexity: O(n) - In the worst case, we might store all prefix sums in the HashMap.



// //optimal approach 

// class Solution {
//     public int numSubarraysWithSum(int[] nums, int goal) {
//         return atMost(nums, goal) - atMost(nums, goal - 1);
//     }

//     private int atMost(int[] nums, int k) {
//         if (k < 0) return 0;

//         int left = 0;
//         int sum = 0;
//         int count = 0;

//         for (int right = 0; right < nums.length; right++) {
//             sum += nums[right];
//             while (sum > k) {
//                 sum -= nums[left];
//                 left++;
//             }
//             count += (right - left + 1);
//         }
//         return count;
//     }
// }

// // Driver class
// public class binarysubarraywithsum {
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int[] nums = {1, 0, 1, 0, 1};
//         int goal = 2;
//         System.out.println(sol.numSubarraysWithSum(nums, goal));
//     }
// }

// // Time Complexity: O(n) - We traverse the array once.
// // Space Complexity: O(1) - We are using a constant amount of extra space.