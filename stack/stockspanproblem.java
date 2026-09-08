// // public class stockspanproblem{

// // }
// class Solution {
//     public int[] stockSpan(int[] arr, int n) {
//         int[] ans = new int[n];
//         for(int i = 0; i < n; i++) {
//             int currSpan = 0;
//             for(int j = i; j >= 0; j--) {
//                 if(arr[j] <= arr[i]) {
//                     currSpan++;
//                 }
//                 else {
//                     break;
//                 }
//             }
//             ans[i] = currSpan;
//         }
//         return ans;
//     }
// }

// public class stockspanproblem {
//     public static void main(String[] args) {
//         int n = 7; 
//         int[] arr = {120, 100, 60, 80, 90, 110, 115};
//         Solution sol = new Solution(); 
//         int[] ans = sol.stockSpan(arr, n);
//         System.out.print("The span of stock prices is: ");
//         for(int i = 0; i < n; i++) {
//             System.out.print(ans[i] + " ");
//         }
//     }
// }

//tc: O(n^2)
//sc: O(n)