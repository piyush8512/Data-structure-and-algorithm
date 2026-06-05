// // public class maximumpointyoucanobtainfromcards {
    
// // }


// //bruteforcesolution
// class Solution {
//     public int maxScore(int[] cardPoints, int k) {
//         int n = cardPoints.length;
//         int maxSum = 0;
//         for (int i = 0; i <= k; i++) {
//             int tempSum = 0;
//             for (int j = 0; j < i; j++) {
//                 tempSum += cardPoints[j];
//             }
//             for (int j = 0; j < k - i; j++) {
//                 tempSum += cardPoints[n - 1 - j];
//             }
//             maxSum = Math.max(maxSum, tempSum);
//         }
//         return maxSum;
//     }
// }

// public class maximumpointyoucanobtainfromcards {
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int[] cards = {1, 2, 3, 4, 5, 6, 1};
//         int k = 3;
//         System.out.println(sol.maxScore(cards, k));
//     }
// }
