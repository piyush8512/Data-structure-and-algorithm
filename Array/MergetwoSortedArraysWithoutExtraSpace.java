// // public class MergetwoSortedArraysWithoutExtraSpace {
    
// // }


// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int i = m - 1;
//         int j = n - 1;
//         int k = m + n - 1;
//         while (i >= 0 && j >= 0) {
//             if (nums1[i] > nums2[j]) {
//                 nums1[k--] = nums1[i--];
//             } else {
//                 nums1[k--] = nums2[j--];
//             }
//         }
//         while (j >= 0) {
//             nums1[k--] = nums2[j--];
//         }
//     }
// }

// public class MergetwoSortedArraysWithoutExtraSpace {
//     public static void main(String[] args) {
//         int[] nums1 = {1, 3, 5, 0, 0, 0};
//         int[] nums2 = {2, 4, 6};
//         int m = 3, n = 3;
//         new Solution().merge(nums1, m, nums2, n);
//         for (int num : nums1) {
//             System.out.print(num + " ");
//         }
//     }
// }
//tc : O(m + n) where m and n are the sizes of the two input arrays.
//sc : O(1) as we are using only a constant amount of extra space.