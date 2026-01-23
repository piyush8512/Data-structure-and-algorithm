
// class Solution {
//     public int maxSubArray(int[] nums) {
//         int maxi = Integer.MIN_VALUE;
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i; j < nums.length; j++) {
//                 int sum = 0;
//                 for (int k = i; k <= j; k++) {
//                     sum += nums[k];
//                 }
//                 maxi = Math.max(maxi, sum);
//             }
//         }
//         return maxi;
//     }
// }
// public class KadaneAlgorithmMaximumSubarraySuminanArray {
//     public static void main(String[] args) {
//         int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
//         Solution sol = new Solution();
//         int maxSum = sol.maxSubArray(arr);
//         System.out.println("The maximum subarray sum is: " + maxSum);
//     }
// }

// // Time Complexity: O(N^3)
// // Space Complexity: O(1)

// class Solution {
//     public int maxSubArray(int[] nums) {
//         int maxi = Integer.MIN_VALUE;
//         for (int i = 0; i < nums.length; i++) {
//             int sum = 0;
//             for (int j = i; j < nums.length; j++) {
//                 sum += nums[j];
//                 maxi = Math.max(maxi, sum);
//             }
//         }
//         return maxi;
//     }
// }

// // Separate Main class in the same file
// public class KadaneAlgorithmMaximumSubarraySuminanArray {
//     public static void main(String[] args) {
//         int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
//         Solution sol = new Solution();
//         int maxSum = sol.maxSubArray(arr);
//         System.out.println("The maximum subarray sum is: " + maxSum);
//     }
// }


// Time Complexity: O(N^2)
// Space Complexity: O(1)   





// //optimal code 
// class Solution {
//     public int maxSubArray(int[] nums) {
//         long maxi = Long.MIN_VALUE; 
//         long sum = 0;
//         for (int i = 0; i < nums.length; i++) {
//             sum += nums[i]; 
//             if (sum > maxi) {
//                 maxi = sum;
//             }
//             if (sum < 0) {
//                 sum = 0; 
//             }
//         }
//         return (int) maxi;
//     }
// }
// public class KadaneAlgorithmMaximumSubarraySuminanArray {
//     public static void main(String[] args) {
//         int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
//         Solution sol = new Solution();
//         int maxSum = sol.maxSubArray(arr);
//         System.out.println("The maximum subarray sum is: " + maxSum);
//     }
// }


//followupquestion to print all subarray number of maxsum 
//optimal solution  

class Solution {
    public int maxSubArray(int[] nums) {
        long maxi = Long.MIN_VALUE; 
        long sum = 0; 
        int start = 0; 
        int ansStart = -1, ansEnd = -1; 
        for (int i = 0; i < nums.length; i++) {
            if (sum == 0) {
                start = i;
            }
            sum += nums[i]; 
            if (sum > maxi) {
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("]");
        return (int) maxi;
    }
}

// Separate Main class
public class KadaneAlgorithmMaximumSubarraySuminanArray {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        Solution sol = new Solution();
        int maxSum = sol.maxSubArray(arr);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}
