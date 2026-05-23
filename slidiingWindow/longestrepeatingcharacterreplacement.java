// // // // public class longestrepeatingcharacterreplacement {
// // // // }


// // // //brute force approach

// // // class Solution {
// // //     public int characterReplacement(String s, int k) {
// // //         int maxLength = 0;
// // //         for (int i = 0; i < s.length(); i++) {
// // //             int[] freq = new int[26];
// // //             int maxFreq = 0;
// // //             for (int j = i; j < s.length(); j++) {
// // //                 freq[s.charAt(j) - 'A']++;
// // //                 maxFreq = Math.max(maxFreq, freq[s.charAt(j) - 'A']);
// // //                 int windowSize = j - i + 1;
// // //                 int replacements = windowSize - maxFreq;
// // //                 if (replacements <= k) {
// // //                     maxLength = Math.max(maxLength, windowSize);
// // //                 }
// // //             }
// // //         }
// // //         return maxLength;
// // //     }
// // // }
// // // public class longestrepeatingcharacterreplacement {
// // //     public static void main(String[] args) {
// // //         Solution sol = new Solution();
// // //         String s = "AABABBA";
// // //         int k = 1;
// // //         System.out.println(sol.characterReplacement(s, k));
// // //     }
// // // }

// // //tc: O(n^2) where n is the length of the input string
// // //sc: O(1) since we are using a fixed size array to store frequencies


// // //better approach

// // class Solution {
 
// //     public int characterReplacement(String s, int k) {
// //         int[] freq = new int[26];
// //         int left = 0;
// //         int maxFreq = 0;
// //         int maxLen = 0;
// //         for (int right = 0; right < s.length(); right++) {
// //             freq[s.charAt(right) - 'A']++;
// //             maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);
// //             while ((right - left + 1) - maxFreq > k) {
// //                 freq[s.charAt(left) - 'A']--;
// //                 left++;
// //             }
// //             maxLen = Math.max(maxLen, right - left + 1);
// //         }

// //         return maxLen;
// //     }
// // }

// // // Driver code
// // public class longestrepeatingcharacterreplacement {
// //     public static void main(String[] args) {
// //         Solution sol = new Solution();
// //         String s = "AABABBA";
// //         int k = 1;
// //         System.out.println(sol.characterReplacement(s, k));
// //     }
// // }

// //tc: O(n) where n is the length of the input string
// //sc: O(26) since we are using a fixed size array to store frequencies

// //optimal approach

// class Solution {
//     public int characterReplacement(String s, int k) {
//         int[] freq = new int[26];
//         int left = 0, right = 0;
//         int maxCount = 0;
//         int maxLength = 0;
//         while (right < s.length()) {
//             freq[s.charAt(right) - 'A']++;
//             maxCount = Math.max(maxCount, freq[s.charAt(right) - 'A']);
//             while ((right - left + 1) - maxCount > k) {
//                 freq[s.charAt(left) - 'A']--;
//                 left++;
//             }
//             maxLength = Math.max(maxLength, right - left + 1);
//             right++;
//         }
//         return maxLength;
//     }
// }

// public class longestrepeatingcharacterreplacement {
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         String s = "AABABBA";
//         int k = 1;
//         // Output: 4
//         System.out.println(sol.characterReplacement(s, k));
//     }
// }


//tc: O(n) where n is the length of the input string
//sc: O(26) since we are using a fixed size array to store frequencies
