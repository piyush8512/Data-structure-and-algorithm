// // // package BinarySerach.bsoaarrays;

// // // public class KthMissingPositiveNumber {
    
// // // }

// // class KthMissingPositiveNumber {
// //     public int missingK(int[] vec, int k) {
// //         for (int i = 0; i < vec.length; i++) {
// //             if (vec[i] <= k) {
// //                 k++;
// //             } else {
// //                 break;
// //             }
// //         }
// //         return k;
// //     }

// //     public static void main(String[] args) {
// //         int[] vec = {4, 7, 9, 10};
// //         int k = 4;
// //         KthMissingPositiveNumber finder = new KthMissingPositiveNumber();
// //         int ans = finder.missingK(vec, k);
// //         System.out.println("The missing number is: " + ans);
// //     }
// // }

// // // Time Complexity: O(n) where n is the length of the input array vec.
// // // Space Complexity: O(1) as we are using only a constant amount of extra space

// class KthMissingPositiveNumber {
//     public int missingK(int[] vec, int k) {
//         int low = 0, high = vec.length - 1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             int missing = vec[mid] - (mid + 1);
//             if (missing < k) {
//                 low = mid + 1;  
//             } else {
//                 high = mid - 1;
//             }
//         }
//         return k + high + 1;
//     }

//     public static void main(String[] args) {
//         int[] vec = {4, 7, 9, 10};
//         int k = 4;
//         KthMissingPositiveNumber finder = new KthMissingPositiveNumber();
//         int ans = finder.missingK(vec, k);
//         System.out.println("The missing number is: " + ans);
//     }
// }

// // Time Complexity: O(log n) where n is the length of the input array vec.
// // Space Complexity: O(1) as we are using only a constant amount of extra space