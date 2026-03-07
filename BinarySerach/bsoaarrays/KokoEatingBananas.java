// // package BinarySerach.bsoaarrays;

// // public class KokoEatingBananas {
    
// // }



// import java.util.*;

// class Solution {
//     public int calculateTotalHours(int[] a, int hourly) {
//         int totalHours = 0;
//         for (int pile : a) {
//             totalHours += (int)Math.ceil((double)pile / hourly);
//         }
//         return totalHours;
//     }

//     // Function to find minimum eating speed
//     public int minEatingSpeed(int[] a, int h) {
//         int maxVal = Arrays.stream(a).max().getAsInt();
//         for (int i = 1; i <= maxVal; i++) {
//             int hours = calculateTotalHours(a, i);
//             if (hours <= h) {
//                 return i;
//             }
//         }
//         return maxVal;
//     }
// }

// public class KokoEatingBananas {
//     public static void main(String[] args) {
//         int[] a = {3, 6, 7, 11};
//         int h = 8;
//         Solution obj = new Solution();
//         System.out.println(obj.minEatingSpeed(a, h));
//     }
// }
// // Time Complexity: O(n max(m)) where n is the number of piles and m is the maximum pile size.
// // Space Complexity: O(1) as we are using only a constant amount of extra space


// binary search approach

// import java.util.*;

// class Solution {
//     private int calculateTotalHours(int[] piles, int speed) {
//         int totalH = 0;
//         for (int bananas : piles) {
//             totalH += (int)Math.ceil((double)bananas / speed);
//         }
//         return totalH;
//     }
//     public int minEatingSpeed(int[] piles, int h) {
//         int maxPile = Arrays.stream(piles).max().getAsInt();
//         int low = 1, high = maxPile;
//         int ans = maxPile;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             int totalH = calculateTotalHours(piles, mid);
//             if (totalH <= h) {
//                 ans = mid;
//                 high = mid - 1;
//             }
//             else {
//                 low = mid + 1;
//             }
//         }
//         return ans;
//     }
// }

// public class KokoEatingBananas {
//     public static void main(String[] args) {
//         int[] piles = {3, 6, 7, 11};
//         int h = 8;
//         Solution obj = new Solution();
//         System.out.println(obj.minEatingSpeed(piles, h));
//     }
// }

// // Time Complexity:  (N*log(max(a[])))  where n is the number of piles and m is the maximum pile size.
// // Space Complexity: O(1) as we are using only a constant amount of extra space




