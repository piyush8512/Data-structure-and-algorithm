// public class CountNumberofSubstrings {
    
// }

import java.util.*;

class Solution {
    public static int atMostKDistinct(String s, int k) {
        int left = 0, res = 0;
        Map<Character, Integer> freq = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            freq.put(s.charAt(right), freq.getOrDefault(s.charAt(right), 0) + 1);
            while (freq.size() > k) {
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                if (freq.get(leftChar) == 0) freq.remove(leftChar);
                left++;
            }
            res += (right - left + 1);
        }
        return res;
    }

    public static int countSubstrings(String s, int k) {
        return atMostKDistinct(s, k) - atMostKDistinct(s, k - 1);
    }
}

public class CountNumberofSubstrings {
    public static void main(String[] args) {
        String s = "pqpqs";
        int k = 2;
        System.out.println("Count: " + Solution.countSubstrings(s, k));
    }
}

//tc: O(n)
//sc: O(k)