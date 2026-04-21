// package leetcode;

// public class TwoFurthestHousesWithDifferentColors {
    
// }


//2078

// //bruteforce approach
// class Solution {
//     public int maxDistance(int[] colors) {
//         int n = colors.length;
//         int max = 0 ;
//         for (int i = 0; i < n; i++){
//             for( int j = i + 1; j < n; j++){
//                 if(colors[i] != colors[j]){
//                     max =  Math.max(max, j - i);
//                 }
//             }
//         }
//         return max;
//     }
// }

// //tc: O(n^2) sc: O(1)


// //optimized approach
// class Solution {
//     public int maxDistance(int[] colors) {
//         int n = colors.length;
//         int maxDist = 0 ;
//         for ( int i = n-1; i >= 0; i--){
//             if(colors[i]!= colors[0]){
//                 maxDist = Math.max(maxDist, i);
//                 break;
//             }
//         }
//         for (int i = 0; i < n; i++) {
//             if (colors[i] != colors[n-1]) {
//                 maxDist = Math.max(maxDist, n-1-i);
//                 break;
//             }
//         }
//         return maxDist;
//     }
// }
// //one pass
// //tc: O(n) sc: O(1)