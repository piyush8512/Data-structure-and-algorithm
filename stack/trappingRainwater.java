// // public class trappingRainwater{}


// //bruteforceslution
// class Solution {
//     public int trap(int[] height) {
//         int n = height.length;
//         int totalWater = 0;
//         for (int i = 0; i < n; i++) {
//             int maxLeft = 0;
//             int maxRight = 0;
//             for (int j = 0; j <= i; j++) {
//                 if (height[j] > maxLeft) {
//                     maxLeft = height[j];
//                 }
//             }
//             for (int j = i; j < n; j++) {
//                 if (height[j] > maxRight) {
//                     maxRight = height[j];
//                 }
//             }
//             totalWater += Math.min(maxLeft, maxRight) - height[i];
//         }
//         return totalWater;
//     }
// }

// public class trappingRainwater {
//     public static void main(String[] args) {
//         int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
//         Solution sol = new Solution();
//         int result = sol.trap(height);
//         System.out.println("Trapped Rainwater: " + result);
//     }
// }
// //tc: O(n^2)
// //sc: O(1)


//optimal solutiion


