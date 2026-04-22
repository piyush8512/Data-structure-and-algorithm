// // // public class LengthofthelongestsubarraywithzeroSum {
    
// // // }

// // import java.util.*;
// // class Solution {
// //     public int solve(int[] a) {
// //         int maxLen = 0;
// //         Map<Integer, Integer> sumIndexMap = new HashMap<>();
// //         int sum = 0;
// //         for (int i = 0; i < a.length; i++) {
// //             sum += a[i];
// //             if (sum == 0) {
// //                 maxLen = i + 1;
// //             }
// //             else if (sumIndexMap.containsKey(sum)) {
// //                 maxLen = Math.max(maxLen, i - sumIndexMap.get(sum));
// //             }
// //             else {
// //                 sumIndexMap.put(sum, i);
// //             }
// //         }
// //         return maxLen;
// //     }
// // }

// // public class LengthofthelongestsubarraywithzeroSum {
// //     public static void main(String[] args) {
// //         int[] a = new int[] {9, -3, 3, -1, 6, -5};
// //         int ans = new Solution().solve(a);
// //         System.out.println(ans);
// //     }
// // }

// // // Time Complexity: O(N2),
// // // Space Complexity: O(1) 


// //optimal approach
// import java.util.*;

// class Solution {
//     public int maxLen(int[] A, int n) {
//         Map<Integer, Integer> mpp = new HashMap<>();
//         int maxi = 0;
//         int sum = 0;
//         for (int i = 0; i < n; i++) {
//             sum += A[i];
//             if (sum == 0) {
//                 maxi = i + 1;
//             }
//             else {
//                 if (mpp.containsKey(sum)) {
//                     maxi = Math.max(maxi, i - mpp.get(sum));
//                 }
//                 else {
//                     mpp.put(sum, i);
//                 }
//             }
//         }
//         return maxi;
//     }
// }

// // separate main class
// public class LengthofthelongestsubarraywithzeroSum {
//     // program entry
//     public static void main(String[] args) {
//         int[] A = new int[]{9, -3, 3, -1, 6, -5};
//         int n = A.length;
//         int ans = new Solution().maxLen(A, n);
//         System.out.println(ans);
//     }
// }

// Time Complexity: O(N), where N is the size of the array.
// Space Complexity: O(1)