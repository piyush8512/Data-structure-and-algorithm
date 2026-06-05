// // // public class numberofsubstringcontainingallthreecharacters {}
// // class Solution {
// //     public int numberOfSubstrings(String s) {
// //         int count = 0;
// //         int n = s.length();
// //         for (int i = 0; i < n; i++) {
// //             int[] freq = new int[3];
// //             for (int j = i; j < n; j++) {
// //                 freq[s.charAt(j) - 'a']++;
// //                 if (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
// //                     count++;
// //                 }
// //             }
// //         }
// //         return count;
// //     }
// // }

// // public class numberofsubstringcontainingallthreecharacters {
// //     public static void main(String[] args) {
// //         Solution sol = new Solution();
// //         String s = "abcabc";
// //         System.out.println(sol.numberOfSubstrings(s));
// //     }
// // }


// //tc: O(n^2)
// //sc: O(1)

// //optimal approach

// class Solution {
//     public int numberOfSubstrings(String s) {
//         int[] freq = new int[3];
//         int left = 0;
//         int res = 0;
//         for (int right = 0; right < s.length(); right++) {
//             freq[s.charAt(right) - 'a']++;
//             while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
//                 res += (s.length() - right);
//                 freq[s.charAt(left) - 'a']--;
//                 left++;
//             }
//         }
//         return res;
//     }
// }
// public class numberofsubstringcontainingallthreecharacters {
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         String s = "abcabc";
//         System.out.println(sol.numberOfSubstrings(s));
//     }
// }

//tc: O(n)
//sc: O(1)