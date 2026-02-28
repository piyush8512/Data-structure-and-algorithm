// // package binaryserach.bsoaarrays;

// // // public class FindingSqrtofanumberusingBinarySearch {

// // // }

// // class Solution {
// //     public int floorSqrt(int n) {
// //         int ans = 0;
// //         for (int i = 1; i <= n; i++) {
// //             if ((long) (i) * i <= n) {
// //            ans = i;
// //             } else {
// //                 break;
// //             }
// //         }
// //         return ans;
// //     }
// // }

// // public class FindingSqrtofanumberusingBinarySearch {
// //     public static void main(String[] args) {
// //         int n = 27;
// //         Solution sol = new Solution();
// //         System.out.println(sol.floorSqrt(n));
// //     }
// // }

// //tc: O(sqrt(n)) sc: O(1)


// //binary
// class Solution {
//         public int mySqrt(int x) {
//         if (x < 2) return x;
//         int left = 1, right = x / 2, ans = 0;
//         while (left <= right) {
//             long mid = left + (right - left) / 2;
//             if (mid * mid <= x) {
//                 ans = (int) mid;
//                 left = (int) mid + 1;
//             } else {
//                 right = (int) mid - 1;
//             }
//         }
//         return ans;
//     }
// }

// public class FindingSqrtofanumberusingBinarySearch {
//     public static void main(String[] args) {
//         Solution s = new Solution();
//         System.out.println(s.mySqrt(8));
//     }
// }


// //tc: O(log(n)) sc: O(1)