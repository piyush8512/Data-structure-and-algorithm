
// //bruteforce approach
// class Solution {
//     public int longestSubarray(int[] nums, int k) {
//         int n = nums.length;
//         int maxLength = 0;
//         for (int startIndex = 0; startIndex < n; startIndex++) {
//             for (int endIndex = startIndex; endIndex < n; endIndex++) {
//                 int currentSum = 0;
//                 for (int i = startIndex; i <= endIndex; i++) {
//                     currentSum += nums[i];
//                 }
//                 if (currentSum == k) {
//                     maxLength = Math.max(maxLength, endIndex - startIndex + 1);
//                 }
//             }
//         }
//         return maxLength;
//     }
// }

// public class LongestSubarraywithgivenSum {
//     public static void main(String[] args) {
//         int[] a = { -1, 1, 1 };
//         int k = 1;
//         Solution solution = new Solution();
//         int len = solution.longestSubarray(a, k);
//         System.out.println("The length of the longest subarray is: " + len);
//     }
// }


// tc: O(n^3)
// sc: O(1)



//optimal slution sliding window 
class Solution {
    public int longestSubarray(int[] nums, int k) {
        int n = nums.length;
        int maxLen = 0;
        int left = 0, right = 0;
        int sum = nums[0];
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= nums[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if (right < n) {
                sum += nums[right];
            }
        }
        return maxLen;
    }
}

// Separate class containing only the main method
public class LongestSubarraywithgivenSum {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;
        Solution sol = new Solution();
        int ans = sol.longestSubarray(nums, k);
        System.out.println("The length of longest subarray having sum k is: " + ans);
    }
}

//o(n)
// sc = 1