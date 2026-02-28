// package leetcode;
// package Leetcode;

// public class ConcatenationofConsecutiveBinaryNumbers {
    
// }


// class Solution {
//     public int concatenatedBinary(int n) {
//         StringBuilder sb = new StringBuilder();

//         // Step 1: build binary string
//         for (int i = 1; i <= n; i++) {
//             sb.append(Integer.toBinaryString(i));
//         }

//         // Step 2: convert binary string to decimal
//         long result = 0;
//         int mod = 1000000007;

//         for (int i = 0; i < sb.length(); i++) {
//             result = (result * 2 + (sb.charAt(i) - '0')) % mod;
//         }

//         return (int) result;
//     }
// }

// public class ConcatenationofConsecutiveBinaryNumbers {
//     public static void main(String[] args) {
//         Solution obj = new Solution();
//         int n = 3;
//         int result = obj.concatenatedBinary(n);
//         System.out.println("Concatenated Binary Result: " + result);
//     }
// }

// // Time Complexity: O(n log n) due to the binary string conversion and concatenation.
// // Space Complexity: O(n log n) for the binary string storage.



class Solution {
    public int concatenatedBinary(int n) {
        int mod = 1000000007;
        long result = 0;
        int length = 0;

        for (int i = 1; i <= n; i++) {
            // check if power of 2
            if ((i & (i - 1)) == 0) {
                length++;
            }

            result = ((result << length) | i) % mod;
        }

        return (int) result;
    }
}

public class ConcatenationofConsecutiveBinaryNumbers {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int n = 3;
        int result = obj.concatenatedBinary(n);
        System.out.println("Concatenated Binary Result: " + result);
    }
}