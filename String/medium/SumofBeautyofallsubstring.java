// public classs SumofBeautyofallsubstring {



import java.util.*;

class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            Map<Character, Integer> freq = new HashMap<>();
            for (int j = i; j < n; j++) {
                freq.put(s.charAt(j), freq.getOrDefault(s.charAt(j), 0) + 1);
                int maxi = Integer.MIN_VALUE;
                int mini = Integer.MAX_VALUE;
                for (int val : freq.values()) {
                    mini = Math.min(mini, val);
                    maxi = Math.max(maxi, val);
                }
                sum += (maxi - mini);
            }
        }
        return sum;
    }
}

public class SumofBeautyofallsubstring {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "xyx";
        System.out.println("Beauty Sum: " + sol.beautySum(s));
    }
}

//tc: O(n^2 * 26) => O(n^2)
//sc: O(1)