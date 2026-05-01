// // public class powerSetBitManipulation {
    
// // }

// import java.util.*;

// class Solution {
//     public List<List<Integer>> getPowerSet(int[] nums) {
//         int n = nums.length;

//         int subsets = 1 << n;
//         List<List<Integer>> ans = new ArrayList<>();
//         for (int num = 0; num < subsets; num++) {
//             // Temporary list to hold current subset
//             List<Integer> subset = new ArrayList<>();
//             for (int i = 0; i < n; i++) {
//                 if ((num & (1 << i)) != 0) {
//                     subset.add(nums[i]);
//                 }
//             }
//             ans.add(subset);
//         }
//         return ans;
//     }
// }

// public class powerSetBitManipulation {
//     public static void main(String[] args) {
//         int[] nums = {5, 7, 8};
//         Solution obj = new Solution();
//         List<List<Integer>> subsets = obj.getPowerSet(nums);

//         System.out.print("Initial Input Array: ");
//         for (int num : nums) {
//             System.out.print(num + " ");
//         }
//         System.out.println();

//         // Print subsets
//         System.out.println("Subsets:");
//         for (List<Integer> subset : subsets) {
//             System.out.print("[ ");
//             for (int num : subset) {
//                 System.out.print(num + " ");
//             }
//             System.out.println("]");
//         }
//     }
// }

// Time Complexity: O(n * 2^n) where n is the number of elements in the input array. This is because we generate 2^n subsets and each subset can take up to O(n) time to construct.
// Space Complexity: O(n * 2^n) in the worst case, when all subsets are generated and stored in the output list. Each subset can take up to O(n) space, and there can be 2^n subsets.