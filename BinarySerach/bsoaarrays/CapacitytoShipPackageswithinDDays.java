// // public class CapacitytoShipPackageswithinDDays {
    
// // }



// import java.util.*;

// class Solution {
//     // Function to check how many days needed for given capacity
//     int daysNeeded(int[] weights, int capacity) {
//         int days = 1;
//         int currentLoad = 0;
//         for (int w : weights) {
//             if (currentLoad + w > capacity) {
//                 days++;
//                 currentLoad = w;
//             } else {
//                 currentLoad += w;
//             }
//         }
//         return days;
//     }

//     int shipWithinDays(int[] weights, int d) {
//         int left = Arrays.stream(weights).max().getAsInt();
//         int right = Arrays.stream(weights).sum();
//         for (int capacity = left; capacity <= right; capacity++) {
//             int needed = daysNeeded(weights, capacity);
//             if (needed <= d) {
//                 return capacity;
//             }
//         }
//         return right;
//     }
// }

// public class CapacitytoShipPackageswithinDDays {
//     public static void main(String[] args) {
//         int[] weights = {5,4,5,2,3,4,5,6};
//         int d = 5;
//         Solution sol = new Solution();
//         System.out.println(sol.shipWithinDays(weights, d));
//     }
// }
// Time Complexity: O(n * (maxWeight - totalWeight)) where n is the number of weights, maxWeight is the maximum weight in the array, and totalWeight is the sum of all weights. This is because we check each capacity from maxWeight to totalWeight and for each capacity, we calculate the days needed.
// Space Complexity: O(1) as we are using only a constant amount of extra space



//optmal solution using binarty search 

import java.util.*;

class Solution {
    int daysNeeded(int[] weights, int capacity) {
        int days = 1;
        int currentLoad = 0;
        for (int w : weights) {
            if (currentLoad + w > capacity) {
                days++;
                currentLoad = w;
            } else {
                currentLoad += w;
            }
        }
        return days;
    }

    int shipWithinDays(int[] weights, int d) {
        int left = Arrays.stream(weights).max().getAsInt();
        int right = Arrays.stream(weights).sum();
        while (left < right) {
            int mid = left + (right - left) / 2;
            int needed = daysNeeded(weights, mid);
            if (needed <= d) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}

public class CapacitytoShipPackageswithinDDays {
    public static void main(String[] args) {
        int[] weights = {5,4,5,2,3,4,5,6};
        int d = 5;
        Solution sol = new Solution();
        System.out.println(sol.shipWithinDays(weights, d));
    }
}

// Time Complexity: O(n log m) where n is the number of weights and m is the range of possible capacities (from max weight to total weight). This is because we perform a binary search on the capacity and for each capacity, we calculate the days needed.
// Space Complexity: O(1) as we are using only a constant amount of extra space
