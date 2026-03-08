// // public class ReverseWordsinaString {
    
// // }


// //bruteforce

// import java.util.*;

// class Solution {
//     public String reverseWords(String s) {
//         List<String> words = new ArrayList<>();
//         StringBuilder word = new StringBuilder();
//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) != ' ') {
//                 word.append(s.charAt(i));
//             } 
//             else if (word.length() > 0) {
//                 words.add(word.toString());
//                 word.setLength(0);
//             }
//         }
//         if (word.length() > 0) {
//             words.add(word.toString());
//         }
//         Collections.reverse(words);
//         return String.join(" ", words);
//     }
// }

// // Driver code
// class ReverseWordsinaString {
//     public static void main(String[] args) {
//         Solution obj = new Solution();
//         String s = "amazing coding skills";
//         System.out.println(obj.reverseWords(s));
//     }
// }


// Time Complexity: O(n) where n is the length of the input string, as we traverse it once to extract words and once to join them.
// Space Complexity: O(n) in the worst case, if the input string consists of only


//optimal solution 
class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder(); 
        int i = s.length() - 1;
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            if (i < 0) break;
            int end = i;
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            String word = s.substring(i + 1, end + 1);
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(word);
        }
        return result.toString();
    }
}

// Driver code
class ReverseWordsinaString {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s = " amazing coding skills ";
        System.out.println(obj.reverseWords(s));
    }
}

// Time Complexity: O(n) where n is the length of the input string, as we traverse it once to extract words and once to join them.
// Space Complexity: O(1)