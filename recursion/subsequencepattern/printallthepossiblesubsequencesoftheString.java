// // public class printallthepossiblesubsequencesoftheString {
    
// // }

// //approach -1
// import java.util.*;

// // Solution class to generate all subsequences using bit manipulation
// class Solution {
//     // Function to return all subsequences of string s
//     public List<String> getSubsequences(String s) {
//         int n = s.length();
//         int total = 1 << n;
//         List<String> subsequences = new ArrayList<>();
//         for (int mask = 0; mask < total; mask++) {
//             StringBuilder subseq = new StringBuilder();
//             for (int i = 0; i < n; i++) {
//                 if ((mask & (1 << i)) != 0) {
//                     subseq.append(s.charAt(i));
//                 }
//             }
//             subsequences.add(subseq.toString());
//         }
//         return subsequences;
//     }
// }

// public class printallthepossiblesubsequencesoftheString {
//     public static void main(String[] args) {
//         String s = "abc";
//         Solution sol = new Solution();
//         List<String> subsequences = sol.getSubsequences(s);

//         // Print all subsequences
//         for (String subseq : subsequences) {
//             System.out.println("\"" + subseq + "\"");
//         }
//     }
// }



//APPROACH-2
import java.util.*;

class Solution {
    private void helper(String s, int index, StringBuilder current, List<String> result) {
        if (index == s.length()) {
            result.add(current.toString());
            return;
        }
        helper(s, index + 1, current, result);
        current.append(s.charAt(index));
        helper(s, index + 1, current, result);
        current.deleteCharAt(current.length() - 1);
    }

    public List<String> getSubsequences(String s) {
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        helper(s, 0, current, result);
        return result;
    }
}

public class printallthepossiblesubsequencesoftheString {
    public static void main(String[] args) {
        String s = "abc";
        Solution sol = new Solution();
        List<String> subsequences = sol.getSubsequences(s);
        for (String subseq : subsequences) {
            System.out.println("\"" + subseq + "\"");
        }
    }
}

// Time Complexity: O(N * 2^N) where N is the length of the input string. Each subsequence takes O(N) time to construct and there are 2^N subsequences in total.
