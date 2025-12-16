package Array.Easy;

//bruteforce approach
// class Solution {
//     public boolean isSorted(int[] arr, int n) {
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[j] < arr[i])
//                     return false;
//             }
//         }
//         return true; 
//     }
// }

// public class CheckIfAnArrayIsSorted {
//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 3, 4, 5 };
//         int n = 5;
//         Solution obj = new Solution();
//         boolean ans = obj.isSorted(arr, n);
//         if (ans)
//             System.out.println("True");
//         else
//             System.out.println("False");
//     }
// }
// //tc: O(n^2)
// //sc: O(1)




//optimal approach---------------------------------------------
// class Solution {
//     // Function to check if the array is sorted
//     public boolean isSorted(int[] arr, int n) {
//         for (int i = 1; i < n; i++) {
//             if (arr[i] < arr[i - 1]) 
//                 return false;
//         }
//         return true; 
//     }
// }

// public class CheckIfAnArrayIsSorted {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         int n = arr.length;
//         Solution obj = new Solution();
//         System.out.println(obj.isSorted(arr, n) ? "True" : "False");
//     }
// }
//tc: O(n)
//sc: O(1)



