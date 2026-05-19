// // // public class maxConsecutiveOnes {
    


// //brute force approach
// // // }
// // class Solution {
// //     public int longestOnes(int[] nums, int k) {
// //         int maxLen = 0;
// //         for (int i = 0; i < nums.length; i++) {
// //             int zeros = 0;
// //             for (int j = i; j < nums.length; j++) {
// //                 if (nums[j] == 0) {
// //                     zeros++;
// //                 }
// //                 if (zeros > k) {
// //                     break;
// //                 }
// //                 maxLen = Math.max(maxLen, j - i + 1);
// //             }
// //         }
// //         return maxLen;
// //     }
// // }

// // // Driver code
// // public class maxConsecutiveOnes {
// //     public static void main(String[] args) {
// //         Solution sol = new Solution();
// //         int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
// //         int k = 2;
// //         System.out.println(sol.longestOnes(nums, k));
// //     }
// // }

// //tc: O(n^2)
// //sc: O(1)


// //better approach 
// class Solution {
//     public int longestOnes(int[] nums, int k) {
//         int left = 0;
//         int zeros = 0;
//         int maxLen = 0;
//         for (int right = 0; right < nums.length; right++) {
//             if (nums[right] == 0) {
//                 zeros++;
//             }
//             while (zeros > k) {
//                 if (nums[left] == 0) {
//                     zeros--;
//                 }
//                 left++; 
//             }
//             maxLen = Math.max(maxLen, right - left + 1);
//         }
//         return maxLen;
//     }
// }

// public class maxConsecutiveOnes {
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
//         int k = 2;
//         System.out.println(sol.longestOnes(nums, k));
//     }
// }


// //tc: O(n)
// //sc: O(1)


//brute force approach 

class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int zerocount = 0;
        int maxlen = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zerocount++;
            }
            if (zerocount > k) {
                if (nums[left] == 0) {
                    zerocount--;
                }
                left++; 
            }
            maxlen = Math.max(maxlen, right - left + 1);
        }
        return maxlen;
    }
}

public class maxConsecutiveOnes {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(sol.longestOnes(nums, k));
    }
}
//tc: O(n)
//sc: O(1)