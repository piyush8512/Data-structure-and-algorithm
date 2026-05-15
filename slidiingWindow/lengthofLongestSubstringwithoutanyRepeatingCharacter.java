// // package slidiingWindow;

// // public class lengthofLongestSubstringwithoutanyRepeatingCharacter {
    
// // }

// import java.util.*;

// class Solution {
//     public int longestNonRepeatingSubstring(String s) {
//         int n = s.length();
//         int maxLen = 0;
//         for (int i = 0; i < n; i++) {
//             int[] hash = new int[256]; 
//             Arrays.fill(hash, 0);

//             for (int j = i; j < n; j++) {
//                 if (hash[s.charAt(j)] == 1) break; // Found a repeat
//                 hash[s.charAt(j)] = 1;

//                 int len = j - i + 1;
//                 maxLen = Math.max(maxLen, len);
//             }
//         }
//         return maxLen;
//     }
// }

// // Separate main class
// public class lengthofLongestSubstringwithoutanyRepeatingCharacter {
//     public static void main(String[] args) {
//         String input = "cadbzabcd";

//         Solution sol = new Solution();
//         int length = sol.longestNonRepeatingSubstring(input);

//         System.out.println("Length of longest substring without repeating characters: " + length);
//     }
// }

// // Time Complexity: O(n^2)
// // Space Complexity: O(1)


// Optimized Solution using Sliding Window

import java.util.*;

class Solution {
    public int longestNonRepeatingSubstring(String s) {
        int n = s.length();
        int HashLen = 256;
        int[] hash = new int[HashLen];
        Arrays.fill(hash, -1);

        int l = 0, r = 0, maxLen = 0;
        while (r < n) {
            if (hash[s.charAt(r)] >= l) {
                l = Math.max(hash[s.charAt(r)] + 1, l);
            }
            int len = r - l + 1;
            maxLen = Math.max(len, maxLen);
            hash[s.charAt(r)] = r;
            r++;
        }
        return maxLen;
    }
}

// Separate main class
public class lengthofLongestSubstringwithoutanyRepeatingCharacter {
    public static void main(String[] args) {
        String s = "cadbzabcd";
        Solution sol = new Solution();
        int result = sol.longestNonRepeatingSubstring(s);
        System.out.println("The maximum length is:");
        System.out.println(result);
    }
}


// Time Complexity: O(n)
// Space Complexity: O(1)
