// package Leetcode;

// // public class Sort_Integers_by_The_Number_of_1_Bits {
    
// // }


// import java.util.*;

// class Solution {
//     public int countBits(int n) {
//         int count = 0;
//         while (n > 0) {
//             if ((n & 1) == 1) {
//                 count++;
//             }
//             n = n >> 1;
//         }       
//         return count;
//     }

//     public int[] sortByBits(int[] arr) {
//         int n = arr.length;
//         int[][] temp = new int[n][2];
//         for (int i = 0; i < n; i++) {
//             temp[i][0] = arr[i];              // number
//             temp[i][1] = countBits(arr[i]);   // bit count
//         }
//         // sort manually
//         Arrays.sort(temp, (a, b) -> {
//             if (a[1] == b[1]) {
//                 return a[0] - b[0]; // sort by number
//             }
//             return a[1] - b[1]; // sort by bit count
//         });
//         for (int i = 0; i < n; i++) {
//             arr[i] = temp[i][0];
//         }       
//         return arr;
//     }
// }

// // tc: O(n log n) due to sorting
// // sc: O(n) due to temp array

import java.util.*;

public class Sort_Integers_by_The_Number_of_1_Bits {
    public int[] sortByBits(int[] arr) {    
        Integer[] nums = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(nums, (a, b) -> {
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);
            if (countA == countB) {
                return a - b;
            }
            return countA - countB; 
        });
        return Arrays.stream(nums).mapToInt(i -> i).toArray();
    }
}
