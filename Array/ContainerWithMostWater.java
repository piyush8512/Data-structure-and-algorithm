// // public class ContainerWithMostWater {
    
// // }



// class Solution {
//     public int maxArea(int[] height) {
//         int n = height.length;
//         int max = 0;

//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 int width = j - i;
//                 int h = Math.min(height[i], height[j]);
//                 max = Math.max(max, width * h);
//             }
//         }

//         return max;
//     }
// }
// public class ContainerWithMostWater {
//     public static void main(String[] args) {
//         int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
//         Solution obj = new Solution();
//         int result = obj.maxArea(height);
//         System.out.println("Maximum Area: " + result);
//     }
// }
// // Time Complexity: O(n^2) due to the nested loops.
// // Space Complexity: O(1) as we are using only a constant amount of extra space.




//optmial approach 


// class Solution {
//     public int maxArea(int[] height) {
//         int left = 0;
//         int right = height.length - 1;
//         int max = 0;

//         while (left < right) {
//             int h = Math.min(height[left], height[right]);
//             int width = right - left;
//             max = Math.max(max, h * width);

//             if (height[left] < height[right]) {
//                 left++;
//             } else {
//                 right--;
//             }
//         }

//         return max;
//     }
// }

// public class ContainerWithMostWater {
//     public static void main(String[] args) {
//         int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
//         Solution obj = new Solution();
//         int result = obj.maxArea(height);
//         System.out.println("Maximum Area: " + result);
//     }
// }

// Time Complexity: O(n) as we traverse the array at most once.
// Space Complexity: O(1) as we are using only a constant amount of extra space