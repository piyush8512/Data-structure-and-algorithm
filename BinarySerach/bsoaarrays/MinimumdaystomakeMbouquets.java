// // // package BinarySerach.bsoaarrays;

// // // public class MinimumdaystomakeMbouquets {
    
// // // }


// // import java.util.*;

// // public class MinimumdaystomakeMbouquets {

// //     public boolean isPossible(int[] bloomDays, int day, int m, int k) {
// //         int count = 0;  // count of consecutive bloomed flowers
// //         int bouquets = 0;

// //         for (int bloom : bloomDays) {
// //             if (bloom <= day) {
// //                 count++;
// //                 if (count == k) {
// //                     bouquets++;
// //                     count = 0;
// //                 }
// //             } else {
// //                 count = 0;
// //             }
// //         }

// //         return bouquets >= m;
// //     }

// //     public int minDaysToMakeBouquets(int[] bloomDays, int m, int k) {
// //         long totalFlowers = (long) m * k;
// //         if (totalFlowers > bloomDays.length) return -1;

// //         int min = Arrays.stream(bloomDays).min().getAsInt();
// //         int max = Arrays.stream(bloomDays).max().getAsInt();

// //         for (int day = min; day <= max; day++) {
// //             if (isPossible(bloomDays, day, m, k)) {
// //                 return day;
// //             }
// //         }

// //         return -1;
// //     }

// //     public static void main(String[] args) {
// //         int[] bloomDays = {7, 7, 7, 7, 13, 11, 12, 7};
// //         int k = 3;
// //         int m = 2;

// //         MinimumdaystomakeMbouquets garden = new MinimumdaystomakeMbouquets();
// //         int result = garden.minDaysToMakeBouquets(bloomDays, m, k);

// //         if (result == -1)
// //             System.out.println("We cannot make m bouquets.");
// //         else
// //             System.out.println("We can make bouquets on day " + result);
// //     }
// // }


// // Time Complexity: O(n * log(maxDay)) where n is the number of flowers and maxDay is the maximum bloom day.
// // Space Complexity: O(1) as we are using only a constant amount of extra space


// //optmial approach 

// public class MinimumdaystomakeMbouquets  {

//     // Function to check if it's possible to make m bouquets on or before 'day'
//     public static boolean isPossible(int[] bloomDays, int day, int m, int k) {
//         int count = 0; 
//         int bouquets = 0;

//         for (int bloom : bloomDays) {
//             if (bloom <= day) {
//                 count++;
//                 if (count == k) {
//                     bouquets++;
//                     count = 0;
//                 }
//             } else {
//                 count = 0; 
//             }
//         }

//         return bouquets >= m; 
//     }

//     public static int roseGarden(int[] bloomDays, int k, int m) {
//         long required = (long) m * k;
//         if (required > bloomDays.length) return -1;

//         int minDay = Integer.MAX_VALUE;
//         int maxDay = Integer.MIN_VALUE;

//         for (int bloom : bloomDays) {
//             minDay = Math.min(minDay, bloom);
//             maxDay = Math.max(maxDay, bloom);
//         }

//         int low = minDay, high = maxDay, result = -1;

//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (isPossible(bloomDays, mid, m, k)) {
//                 result = mid; 
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         int[] bloomDays = {7, 7, 7, 7, 13, 11, 12, 7};
//         int k = 3;
//         int m = 2;
//         int result = roseGarden(bloomDays, k, m);
//         if (result == -1)
//             System.out.println("We cannot make m bouquets.");
//         else
//             System.out.println("We can make bouquets on day " + result);
//     }
// }

// // Time Complexity: O(n * log(maxDay)) where n is the number of flowers and maxDay is the maximum bloom day.
// // Space Complexity: O(1) as we are using only a constant amount of extra space