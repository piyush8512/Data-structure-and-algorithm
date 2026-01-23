// // TwoSum
// //bruteforce solution
// // class Solution {
// //     public String twoSumExists(int[] arr, int target) {
// //         int n = arr.length;
// //         for (int i = 0; i < n; i++) {
// //             for (int j = i + 1; j < n; j++) {
// //                 if (arr[i] + arr[j] == target) {
// //                     return "YES";
// //                 }
// //             }
// //         }
// //         return "NO";
// //     }
// //     public int[] twoSumIndices(int[] arr, int target) {
// //         int n = arr.length;
// //         for (int i = 0; i < n; i++) {
// //             for (int j = i + 1; j < n; j++) {
// //                 if (arr[i] + arr[j] == target) {
// //                     return new int[]{i, j};
// //                 }
// //             }
// //         }
// //         return new int[]{-1, -1};
// //     }
// // }

// // public class TwoSum {
// //     public static void main(String[] args) {
// //         Solution sol = new Solution();
// //         int[] arr = {2, 6, 5, 8, 11};
// //         int target = 14;
// //         System.out.println(sol.twoSumExists(arr, target));
// //         int[] res = sol.twoSumIndices(arr, target);
// //         System.out.println("[" + res[0] + ", " + res[1] + "]");
// //     }
// // }


// // tc: O(n^2)
// // sc: O(1)


// //better solution using hashing
// import java.util.HashMap;
// class Solution {
//     public String twoSumExists(int[] arr, int target) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for (int i = 0; i < arr.length; i++) {
//             int complement = target - arr[i];
//             if (map.containsKey(complement)) {
//                 return "YES"; 
//             }
//             map.put(arr[i], i);
//         }
//         return "NO";
//     }

//     // Variant 2: Return indices of two numbers that sum to target using hashing
//     public int[] twoSumIndices(int[] arr, int target) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for (int i = 0; i < arr.length; i++) {
//             int complement = target - arr[i];
//             // If complement found, return indices
//             if (map.containsKey(complement)) {
//                 return new int[] { map.get(complement), i };
//             }
//             // Store current element and index
//             map.put(arr[i], i);
//         }
//         // No pair found
//         return new int[] { -1, -1 };
//     }
// }

// public class TwoSum {
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int[] arr = {2, 6, 5, 8, 11};
//         int target = 14;

//         System.out.println(sol.twoSumExists(arr, target));
//         int[] res = sol.twoSumIndices(arr, target);
//         System.out.println("[" + res[0] + ", " + res[1] + "]");
//     }
// }
