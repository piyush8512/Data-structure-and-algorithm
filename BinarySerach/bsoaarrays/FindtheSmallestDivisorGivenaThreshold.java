

// // class findthesmallestdivisorgivenathreshold {
    
// // }



// class Solution {

//     public int smallestDivisor(int[] arr, int limit) {
//         int n = arr.length;
//         int max = Integer.MIN_VALUE;
//         for (int num : arr) {
//             max = Math.max(max, num);
//         }
//         for (int d = 1; d <= max; d++) {
//             int sum = 0;
//             for (int i = 0; i < n; i++) {
//                 sum += (int) Math.ceil((double) arr[i] / d);
//             }
//             if (sum <= limit) {
//                 return d;
//             }
//         }

//         return -1; 
//     }

// }
// public class FindtheSmallestDivisorGivenaThreshold {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         int limit = 8;

//         Solution obj = new Solution();
//         int ans = obj.smallestDivisor(arr, limit);
//         System.out.println("The minimum divisor is: " + ans);
//     }
// }


// // Time Complexity: O(n * m) where n is the length of the array and m is the maximum value in the array (worst case when divisor is 1).
// // Space Complexity: O(1) as we are using only a constant amount of extra space



// //optimal solution 
// import java.util.*;

class SmallestDivisorFinder {
    // Helper method to calculate sum by divisor
    private int sumByD(int[] arr, int div) {
        int sum = 0;
        for (int num : arr) {
            sum += Math.ceil((double) num / div);
        }
        return sum;
    }

    public int smallestDivisor(int[] arr, int limit) {
        if (arr.length > limit) return -1;

        int low = 1;
        int high = Arrays.stream(arr).max().getAsInt();

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sumByD(arr, mid) <= limit) {
                high = mid - 1; // Try smaller divisor
            } else {
                low = mid + 1;  // Try larger divisor
            }
        }

        return low;
    }

    public static void main(String[] args) {
        SmallestDivisorFinder solver = new SmallestDivisorFinder();
        int[] arr = {1, 2, 3, 4, 5};
        int limit = 8;
        int result = solver.smallestDivisor(arr, limit);
        System.out.println("The minimum divisor is: " + result);
    }
}

// Time Complexity: O(n log m) where n is the length of the array and m is the maximum value in the array (worst case when divisor is 1).
// Space Complexity: O(1) as we are using only a constant amount of extra space