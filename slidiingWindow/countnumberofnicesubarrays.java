// // // public class countnumberofnicesubarrays {
    
// // // }


// // //brute force approach  
// // class Solution {
// //     public int numberOfSubarrays(int[] nums, int k) {
// //         int count = 0;
// //         for (int start = 0; start < nums.length; start++) {
// //             int oddCount = 0;
// //             for (int end = start; end < nums.length; end++) {
// //                 if (nums[end] % 2 != 0)
// //                     oddCount++;
// //                 if (oddCount > k)
// //                     break;
// //                 if (oddCount == k)
// //                     count++;
// //             }
// //         }
// //         return count;
// //     }
// // }

// // // Separate driver class with main method
// // public class countnumberofnicesubarrays {
// //     public static void main(String[] args) {
// //         Solution sol = new Solution();
// //         int[] nums = {1, 1, 2, 1, 1};
// //         int k = 3;
// //         System.out.println(sol.numberOfSubarrays(nums, k));
// //     }
// // }



// //better solution 
// import java.util.*;

// class Solution {
//     public int numberOfSubarrays(int[] nums, int k) {
//         Map<Integer, Integer> freq = new HashMap<>();
//         freq.put(0, 1);
//         int oddCount = 0;
//         int result = 0;
//         for (int num : nums) {
//             if (num % 2 == 1) oddCount++;
//             if (freq.containsKey(oddCount - k)) {
//                 result += freq.get(oddCount - k);
//             }
//             freq.put(oddCount, freq.getOrDefault(oddCount, 0) + 1);
//         }
//         return result;
//     }
// }

// public class countnumberofnicesubarrays {
//     public static void main(String[] args) {
//         int[] nums = {1, 1, 2, 1, 1};
//         int k = 3;
//         Solution sol = new Solution();
//         System.out.println(sol.numberOfSubarrays(nums, k));
//     }
// }

// //tc: O(n) where n is the length of the input array nums. We traverse the array once to count the odd numbers and update the frequency map.
// //sc: O(n) in the worst case, if all numbers in the array are odd


//optmial solution 
