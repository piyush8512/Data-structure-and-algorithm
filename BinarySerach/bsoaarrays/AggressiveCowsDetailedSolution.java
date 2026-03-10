// // AggressiveCowsDetailedSolution

// import java.util.*;

// class Solution {
//     public boolean canPlace(int[] stalls, int cows, int d) {
//         int count = 1;
//         int lastPos = stalls[0];
//         for (int i = 1; i < stalls.length; i++) {
//             if (stalls[i] - lastPos >= d) {
//                 count++;
//                 lastPos = stalls[i];
//             }
//             if (count >= cows) return true;
//         }
//         return false;
//     }

//     public int aggressiveCows(int[] stalls, int cows) {
//         Arrays.sort(stalls);
//         int maxDist = stalls[stalls.length - 1] - stalls[0];
//         int ans = 0;
//         for (int d = 1; d <= maxDist; d++) {
//             if (canPlace(stalls, cows, d)) {
//                 ans = d;
//             }
//         }
//         return ans;
//     }
// }

// // Driver class
// public class AggressiveCowsDetailedSolution {
//     public static void main(String[] args) {
//         int[] stalls = {1, 2, 8, 4, 9};
//         int cows = 3;
//         Solution obj = new Solution();
//         System.out.println(obj.aggressiveCows(stalls, cows));
//     }
// }

//TC: O(N log N + N * log(maxDist)) where N is the number of stalls and maxDist is the maximum distance between the first and last stall. The sorting step takes O(N log N) and the binary search step takes O(log(maxDist)) with each check taking O(N).
//SC: O(1) 



//OPtimized Solution using Binary Search

import java.util.*;

class Solution {
    public boolean canPlace(int[] stalls, int cows, int d) {
        int count = 1;
        int lastPos = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPos >= d) {
                count++;
                lastPos = stalls[i];
            }
            if (count >= cows) return true;
        }
        return false;
    }

    public int aggressiveCows(int[] stalls, int cows) {
        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canPlace(stalls, cows, mid)) {
                ans = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }
}

// Driver class
public class AggressiveCowsDetailedSolution {
    public static void main(String[] args) {
        int[] stalls = {1, 2, 8, 4, 9};
        int cows = 3;
        Solution obj = new Solution();
        System.out.println(obj.aggressiveCows(stalls, cows));
    }
}

//TC: O(N log N + N * log(maxDist)) where N is the number of stalls and maxDist is the maximum distance between the first and last stall. The sorting step takes O(N log N) and the binary search step takes O(log(maxDist)) with each check taking O(N).
//SC: O(1)