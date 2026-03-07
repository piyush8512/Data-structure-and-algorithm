// // package String.Easy;

// // public class RemoveOutermostParentheses {

// // }

// class Solution {
//     public String removeOuterParentheses(String s) {
//         StringBuilder result = new StringBuilder();
//         int level = 0;
//         for (char ch : s.toCharArray()) {
//             if (ch == '(') {
//                 if (level > 0)
//                     result.append(ch);
//                 level++;
//             } else if (ch == ')') {
//                 level--;
//                 if (level > 0)
//                     result.append(ch);
//             }
//         }

//         return result.toString();
//     }
// }

// public class removeOuterParenthesessolutio {
//     public static void main(String[] args) {
//         String s = "(()())(())";
//         Solution sol = new Solution();
//         String ans = sol.removeOuterParentheses(s);
//         System.out.println("The result is: " + ans);
//     }
// }
// // Time Complexity: O(n) where n is the length of the input string, as we
// // traverse it once.
// // Space Complexity: O(1) in the worst case, if the input string consists of
// // only