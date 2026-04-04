// package subsequencepattern;

// public class countallsubsequenceswithsumK {
    
// }



// class Solution {
//     private int func(int ind, int sum, int[] nums) {
//         if (sum == 0) return 1;
//         if (sum < 0 || ind == nums.length) return 0;
//         return func(ind + 1, sum - nums[ind], nums) + func(ind + 1, sum, nums);
//     }

//     // Function to start counting subsequences
//     public int countSubsequenceWithTargetSum(int[] nums, int target) {
//         return func(0, target, nums);
//     }

//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int[] nums1 = {1, 2, 3, 4};
//         int target = 5;
//         System.out.println("Number of subsequences with target sum " + target + ": "
//                 + sol.countSubsequenceWithTargetSum(nums, target));
//     }
// }


// Time Complexity: O(2^n) where n is the number of elements in the input array.
// Space Complexity: O(n) due to the recursive call stack in the worst case.