// // public class SearchElementinaRotatedSortedArray {
    
// // }


// // brutie force approach will be to traverse the array and check if the element is present or not. This will take O(n) time complexity.

// //optmial approach 
// class Solution {
//     public int search(int[] nums, int target) {
//         int low = 0;
//         int high = nums.length - 1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (nums[mid] == target)
//                 return mid;
//             if (nums[low] <= nums[mid]) {
//                 if (nums[low] <= target && target < nums[mid]) {
//                     high = mid - 1;
//                 }
//                 else {
//                     low = mid + 1;
//                 }
//             }
//             else {
//                 if (nums[mid] < target && target <= nums[high]) {
//                     low = mid + 1;
//                 }
//                 else {
//                     high = mid - 1;
//                 }
//             }
//         }
//         return -1;
//     }
// }

// // Driver class
// class SearchElementinaRotatedSortedArray {
//     public static void main(String[] args) {
//         int[] nums = {4,5,6,7,0,1,2};
//         int target = 0;

//         Solution obj = new Solution();
//         int result = obj.search(nums, target);

//         System.out.println(result);
//     }
// }

// Time Complexity: O(log n) where n is the number of elements in the array.
// Space Complexity: O(1) as we are using only a constant amount of extra space.