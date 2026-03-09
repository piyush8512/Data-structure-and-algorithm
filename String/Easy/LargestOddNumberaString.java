// public class LargestOddNumberaString {
    
// }
class Solution {
        public String largeOddNum(String s) {
        int ind = -1;
        int i;
        for (i = s.length() - 1; i >= 0; i--) {
            if ((s.charAt(i) - '0') % 2 == 1) {
                ind = i;
                break;
            }
        }
        if (ind == -1) return "";
        i = 0;
        while (i <= ind && s.charAt(i) == '0') i++;
        return s.substring(i, ind + 1);
    }
}

public class LargestOddNumberaString {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String num = "504";
        String result = solution.largeOddNum(num);
        System.out.println("Largest odd number: " + result);
    }
}

// Time Complexity: O(n) where n is the length of the input string s.
// Space Complexity: O(1) as we are using only a constant amount of extra space