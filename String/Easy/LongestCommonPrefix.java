// public class LongestCommonPrefix {
    
// }

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] v) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length - 1];
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
}

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] input = {"interview", "internet", "internal", "interval"};
        String result = solution.longestCommonPrefix(input);
        System.out.println("Longest Common Prefix: " + result); 
    }
}

// Time Complexity: O(N log N) due to sorting, where N is the number of strings in the array.
// Space Complexity: O(1) if we ignore the space used for sorting, otherwise O