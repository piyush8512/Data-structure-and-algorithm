// // // public class nextSmallerElement {
    
// // // }

// // Approach 1: Brute Force

// // import java.util.*;

// // class Solution {
// //     public int[] nextSmallerElement(int[] arr) {
// //         int n = arr.length;
// //         int[] ans = new int[n];
// //         Arrays.fill(ans, -1);
// //         for (int i = 0; i < n; i++) {
// //             int curr = arr[i];
// //             for (int j = i + 1; j < n; j++) {
// //                 if (arr[j] < curr) {
// //                     ans[i] = arr[j];
// //                     break;
// //                 }
// //             }
// //         }
// //         return ans;
// //     }
// // }

// // public class nextSmallerElement {
// //     public static void main(String[] args) {
// //         int[] arr = {4, 8, 5, 2, 25};
// //         Solution sol = new Solution();
// //         int[] ans = sol.nextSmallerElement(arr);
// //         System.out.print("The next smaller elements are: ");
// //         for (int num : ans) {
// //             System.out.print(num + " ");
// //         }
// //     }
// // }
// //tc O(n^2) sc O(n) for the brute force approach


// //optimized approach using stack
// import java.util.*;

// class Solution {
//     public int[] nextSmallerElement(int[] arr) {
//         int n = arr.length;
//         Stack<Integer> st = new Stack<>();
//         int[] ans = new int[n];
//         Arrays.fill(ans, -1);
//         for (int i = n - 1; i >= 0; i--) {
//             while (!st.isEmpty() && st.peek() >= arr[i]) {
//                 st.pop();
//             }
//             if (!st.isEmpty()) {
//                 ans[i] = st.peek();
//             }
//             st.push(arr[i]);
//         }
//         return ans;
//     }
// }

// public class nextSmallerElement {

//     public static void main(String[] args) {
//         int[] arr = {1, 3, 2, 4};
//         Solution sol = new Solution();
//         int[] ans = sol.nextSmallerElement(arr);
//         System.out.print("The next smaller elements are: ");
//         for (int val : ans) {
//             System.out.print(val + " ");
//         }
//     }
// }


// //tc O(n) sc O(n) for the optimized approach using stack