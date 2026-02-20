// // public class searchInRotatedSortedArrayII {
    
// // }

// class Solution {
//     public boolean searchInRotatedSortedArrayII(int[] arr, int k) {
//         int low = 0, high = arr.length - 1;
//         while (low <= high) {
//             int mid = (low + high) / 2;

//             if (arr[mid] == k) return true;

            
//             if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
//                 low++;
//                 high--;
//                 continue;
//             }

            
//             if (arr[low] <= arr[mid]) {
//                 if (arr[low] <= k && k <= arr[mid]) {
//                     high = mid - 1; 
//                 } else {
//                     low = mid + 1;  
//                 }
//             }
            
//             else {
//                 if (arr[mid] <= k && k <= arr[high]) {
//                     low = mid + 1;  
//                 } else {
//                     high = mid - 1; 
//                 }
//             }
//         }

//         return false; 
//     }

//     public static void main(String[] args) {
//         int[] arr = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
//         int k = 3;
//         Solution obj = new Solution();
//         boolean ans = obj.searchInRotatedSortedArrayII(arr, k);

//         if (ans)
//             System.out.println("Target is present in the array.");
//         else
//             System.out.println("Target is not present.");
//     }
// }
  
// // Time Complexity: O(log n)
// // Space Complexity: O(1)