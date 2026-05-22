// // public class longestrepeatingcharacterreplacement {
// // }


// //brute force approach

// class Solution {
//     public int characterReplacement(String s, int k) {
//         int maxLength = 0;
//         for (int i = 0; i < s.length(); i++) {
//             int[] freq = new int[26];
//             int maxFreq = 0;
//             for (int j = i; j < s.length(); j++) {
//                 freq[s.charAt(j) - 'A']++;
//                 maxFreq = Math.max(maxFreq, freq[s.charAt(j) - 'A']);
//                 int windowSize = j - i + 1;
//                 int replacements = windowSize - maxFreq;
//                 if (replacements <= k) {
//                     maxLength = Math.max(maxLength, windowSize);
//                 }
//             }
//         }
//         return maxLength;
//     }
// }
// public class longestrepeatingcharacterreplacement {
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         String s = "AABABBA";
//         int k = 1;
//         System.out.println(sol.characterReplacement(s, k));
//     }
// }

//tc: O(n^2) where n is the length of the input string
//sc: O(1) since we are using a fixed size array to store frequencies