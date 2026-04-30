// // // // TwoSum
// // // //bruteforce solution
// // // // class Solution {
// // // //     public String twoSumExists(int[] arr, int target) {
// // // //         int n = arr.length;
// // // //         for (int i = 0; i < n; i++) {
// // // //             for (int j = i + 1; j < n; j++) {
// // // //                 if (arr[i] + arr[j] == target) {
// // // //                     return "YES";
// // // //                 }
// // // //             }
// // // //         }
// // // //         return "NO";
// // // //     }
// // // //     public int[] twoSumIndices(int[] arr, int target) {
// // // //         int n = arr.length;
// // // //         for (int i = 0; i < n; i++) {
// // // //             for (int j = i + 1; j < n; j++) {
// // // //                 if (arr[i] + arr[j] == target) {
// // // //                     return new int[]{i, j};
// // // //                 }
// // // //             }
// // // //         }
// // // //         return new int[]{-1, -1};
// // // //     }
// // // // }

// // // // public class TwoSum {
// // // //     public static void main(String[] args) {
// // // //         Solution sol = new Solution();
// // // //         int[] arr = {2, 6, 5, 8, 11};
// // // //         int target = 14;
// // // //         System.out.println(sol.twoSumExists(arr, target));
// // // //         int[] res = sol.twoSumIndices(arr, target);
// // // //         System.out.println("[" + res[0] + ", " + res[1] + "]");
// // // //     }
// // // // }


// // // // tc: O(n^2)
// // // // sc: O(1)


// // //better solution using hashing
// // import java.util.HashMap;
// // class Solution {
// //     public String twoSumExists(int[] arr, int target) {
// //         HashMap<Integer, Integer> map = new HashMap<>();
// //         for (int i = 0; i < arr.length; i++) {
// //             int complement = target - arr[i];
// //             if (map.containsKey(complement)) {
// //                 return "YES"; 
// //             }
// //             map.put(arr[i], i);
// //         }
// //         return "NO";
// //     }

// //     // Variant 2: Return indices of two numbers that sum to target using hashing
// //     public int[] twoSumIndices(int[] arr, int target) {
// //         HashMap<Integer, Integer> map = new HashMap<>();
// //         for (int i = 0; i < arr.length; i++) {
// //             int complement = target - arr[i];
// //             // If complement found, return indices
// //             if (map.containsKey(complement)) {
// //                 return new int[] { map.get(complement), i };
// //             }
// //             // Store current element and index
// //             map.put(arr[i], i);
// //         }
// //         // No pair found
// //         return new int[] { -1, -1 };
// //     }
// // }

// // public class TwoSum {
// //     public static void main(String[] args) {
// //         Solution sol = new Solution();
// //         int[] arr = {-1, 0, 2, 1, -1, -4};
// //         int target = 0;

// //         System.out.println(sol.twoSumExists(arr, target));
// //         int[] res = sol.twoSumIndices(arr, target);
// //         System.out.println("[" + res[0] + ", " + res[1] + "]");
// //     }
// // }


// // // tc: O(n) - We traverse the array once, and each lookup in the hash map is O(1).
// // // sc: O(n) - In the worst case, we could store all n elements in


// //optimal solution two pointer approach 
// import java.util.*;

// public class TwoSum {
//     public List<List<Integer>> getPairs(int[] arr) {
//         Arrays.sort(arr);
//         List<List<Integer>> result = new ArrayList<>();

//         int left = 0, right = arr.length - 1;

//         while (left < right) {
//             int sum = arr[left] + arr[right];

//             if (sum == 0) {
//                 result.add(Arrays.asList(arr[left], arr[right]));

//                 // skip duplicates
//                 int l = arr[left];
//                 int r = arr[right];

//                 while (left < right && arr[left] == l) left++;
//                 while (left < right && arr[right] == r) right--;
//             } 
//             else if (sum < 0) {
//                 left++;
//             } 
//             else {
//                 right--;
//             }
//         }

//         return result;
//     }
// }

// // tc: O(n log n) - Sorting takes O(n log n) and the two-pointer traversal takes O(n).
// // sc: O(1) - We are using only a constant amount of extra space for