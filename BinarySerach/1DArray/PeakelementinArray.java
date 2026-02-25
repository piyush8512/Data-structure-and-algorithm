// // // public class PeakelementinArray {
    
// // // }

// // class Solution {
// //     public int findPeakElement(int[] nums) {
// //         int n = nums.length;
// //         for (int i = 0; i < n; i++) {
// //             boolean left = (i == 0) || (nums[i] >= nums[i - 1]);
// //             boolean right = (i == n - 1) || (nums[i] >= nums[i + 1]);
// //             if (left && right) return i;
// //         }
// //         return -1;
// //     }
// // }

// // // Driver
// // public class  PeakelementinArray {
// //     public static void main(String[] args) {
// //         Solution sol = new Solution();
// //         int[] nums = {1, 3, 20, 4, 1, 0};
// //         int index = sol.findPeakElement(nums);
// //         System.out.println("Peak at index: " + index + " with value: " + nums[index]);
// //     }
// // }
// // // Time Complexity: O(N)
// // // Space Complexity: O(1)


// // optimal solution using binary search



// class Solution {
//     public int findPeakElement(int[] nums) {
//         int low = 0, high = nums.length - 1;
//         while (low < high) {
//             int mid = (low + high) / 2;
//             if (nums[mid] > nums[mid + 1]) {
//                 high = mid;
//             } else {
//                 low = mid + 1;
//             }
//         }
//         return low;
//     }
// }

// public class PeakelementinArray {
//     public static void main(String[] args) {
//         int[] nums = {1, 2, 1, 3, 5, 6, 4};
//         Solution obj = new Solution();
//         System.out.println(obj.findPeakElement(nums));
//     }
// }
// // Time Complexity: O(log N)
// // Space Complexity: O(1)
