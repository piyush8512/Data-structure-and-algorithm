
// // import java.util.*;

// // //bruteforce approach
// // class ArrayManipulator {
// //         public int[] rearrangeBySign(int[] A, int n) {
// //         List<Integer> pos = new ArrayList<>();
// //         List<Integer> neg = new ArrayList<>();
// //         for (int i = 0; i < n; i++) {
// //             if (A[i] > 0)
// //                 pos.add(A[i]); 
// //             else
// //                 neg.add(A[i]);
// //         }

// //         for (int i = 0; i < n / 2; i++) {
// //             A[2 * i] = pos.get(i);
// //             A[2 * i + 1] = neg.get(i);
// //         }
// //         return A;
// //     }

// //     public static void main(String[] args) {
// //         int[] A = { 1, 2, -4, -5 };
// //         int n = A.length;

// //         ArrayManipulator obj = new ArrayManipulator();
// //         int[] result = obj.rearrangeBySign(A, n);

// //         for (int num : result) {
// //             System.out.print(num + " ");
// //         }
// //     }
// // }

// // //tc : O(n) and n/2
// // //sc : O(n) or n/2  and n/2

// public class ArrayManipulator {
//     public int[] rearrangeBySign(int[] A) {
//         int n = A.length;
//         int[] ans = new int[n];
//         int posIndex = 0, negIndex = 1;
//         for (int i = 0; i < n; i++) {
//             if (A[i] < 0) {
//                 ans[negIndex] = A[i];
//                 negIndex += 2;
//             } else {
//                 ans[posIndex] = A[i];
//                 posIndex += 2;
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int[] A = { 1, 2, -4, -5 };

//         ArrayManipulator obj = new ArrayManipulator();
//         int[] result = obj.rearrangeBySign(A);

//         for (int num : result) {
//             System.out.print(num + " ");
//         }
//     }
// }

// // tc : O(n)
// // sc : O(n)