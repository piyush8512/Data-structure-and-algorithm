// // public class longestSubstringwithAtMostKDistinctCharacters {
    
// // }

// import java.util.*;

// class Solution {
//     public int lengthOfLongestSubstringKDistinct(String s, int k) {
//         int maxLength = 0;
//         for (int i = 0; i < s.length(); i++) {
//             Map<Character, Integer> freq = new HashMap<>();
//             for (int j = i; j < s.length(); j++) {
//                 freq.put(s.charAt(j), freq.getOrDefault(s.charAt(j), 0) + 1);
//                 if (freq.size() > k) break;
//                 maxLength = Math.max(maxLength, j - i + 1);
//             }
//         }
//         return maxLength;
//     }
// }

// public class longestSubstringwithAtMostKDistinctCharacters {
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         String s = "eceba";
//         int k = 2;
//         System.out.println(sol.lengthOfLongestSubstringKDistinct(s, k));
//     }
// }

// //tc  o n 2    sc ok 


 //optimized solution using sliding window

import java.util.*;

class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (k == 0 || s.length() == 0) return 0;
        Map<Character, Integer> freq = new HashMap<>();
        int left = 0;
        int maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
            while (freq.size() > k) {
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                if (freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}

public class longestSubstringwithAtMostKDistinctCharacters {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "eceba";
        int k = 2;
        System.out.println(sol.lengthOfLongestSubstringKDistinct(s, k));
    }
}


//tc On  sc O(k) for the hashmap