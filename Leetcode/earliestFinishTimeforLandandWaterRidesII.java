// // // public class earliestFinishTimeforLandandWaterRidesII {
// // // }

// // //nruteforce approach
// // class Solution {
// //     public int earliestFinishTime(
// //             int[] landStartTime,
// //             int[] landDuration,
// //             int[] waterStartTime,
// //             int[] waterDuration) {
// //         int ans = Integer.MAX_VALUE;
// //         for (int i = 0; i < landStartTime.length; i++) {
// //             for (int j = 0; j < waterStartTime.length; j++) {
// //                 int landFinish =
// //                         landStartTime[i] + landDuration[i];
// //                 int waterStart =
// //                         Math.max(landFinish, waterStartTime[j]);
// //                 int finish1 =
// //                         waterStart + waterDuration[j];
// //                 ans = Math.min(ans, finish1);
// //                 int waterFinish =
// //                         waterStartTime[j] + waterDuration[j];
// //                 int landStart =
// //                         Math.max(waterFinish, landStartTime[i]);
// //                 int finish2 =
// //                         landStart + landDuration[i];
// //                 ans = Math.min(ans, finish2);
// //             }
// //         }
// //         return ans;
// //     }
// // }
// // public class earliestFinishTimeforLandandWaterRidesII {
// //     public static void main(String[] args) {
// //         Solution sol = new Solution();
// //         int[] landStartTime = {1, 2};
// //         int[] landDuration = {2, 1};
// //         int[] waterStartTime = {2, 3};
// //         int[] waterDuration = {1, 2};
// //         System.out.println(sol.earliestFinishTime(landStartTime, landDuration, waterStartTime, waterDuration));
// //     }
// // }

// // //tc: O(n*m)
// // //sc: O(1)

// // //better appraoch 

// class Solution {
//     public int earliestFinishTime(int[] landStartTime, int[] landDuration,
//                                   int[] waterStartTime, int[] waterDuration) {
        
//         int minLandFinish = Integer.MAX_VALUE;
//         int minWaterFinish = Integer.MAX_VALUE;

//         // Earliest time to finish one land ride
//         for (int i = 0; i < landStartTime.length; i++) {
//             minLandFinish = Math.min(minLandFinish, landStartTime[i] + landDuration[i]);
//         }

//         // Earliest time to finish one water ride
//         for (int i = 0; i < waterStartTime.length; i++) {
//             minWaterFinish = Math.min(minWaterFinish, waterStartTime[i] + waterDuration[i]);
//         }

//         int ans = Integer.MAX_VALUE;

//         // Case 1: Land first, then Water
//         for (int j = 0; j < waterStartTime.length; j++) {
//             int finish = Math.max(minLandFinish, waterStartTime[j]) + waterDuration[j];
//             ans = Math.min(ans, finish);
//         }

//         // Case 2: Water first, then Land
//         for (int i = 0; i < landStartTime.length; i++) {
//             int finish = Math.max(minWaterFinish, landStartTime[i]) + landDuration[i];
//             ans = Math.min(ans, finish);
//         }

//         return ans;
//     }
// }

// public class earliestFinishTimeforLandandWaterRidesII {
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int[] landStartTime = {1, 2};
//         int[] landDuration = {2, 1};
//         int[] waterStartTime = {2, 3};
//         int[] waterDuration = {1, 2};
//         System.out.println(sol.earliestFinishTime(landStartTime, landDuration, waterStartTime, waterDuration));
//     }
// }
//tc: O(n + m)
//sc: O(1)




