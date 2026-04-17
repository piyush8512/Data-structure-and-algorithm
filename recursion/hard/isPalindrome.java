// package recursion.hard;

// public class isPalindrome {
    
// }

import java.util.*;

class Solution {

    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(0, s, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, String s, List<String> path, List<List<String>> result) {
        // Base case
        if (start == s.length()) {
            result.add(new ArrayList<>(path));
            return;
        } 

        // Try all partitions
        for (int end = start; end < s.length(); end++) {
            if (isPalindrome(s, start, end)) {
                path.add(s.substring(start, end + 1));   // choose
                backtrack(end + 1, s, path, result);     // explore
                path.remove(path.size() - 1);            // backtrack
            }
        }
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}


public class isPalindrome {
    public static void main(String[] args) {
        String s = "aab";
        Solution sol = new Solution();
        List<List<String>> result = sol.partition(s);
        System.out.println(result);
    }
}