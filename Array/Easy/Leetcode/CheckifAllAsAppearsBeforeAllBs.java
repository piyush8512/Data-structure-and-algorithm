package Array.Easy.Leetcode;

public class CheckifAllAsAppearsBeforeAllBs {
    class Solution {
        public boolean checkString(String s) {
            int n = s.length();
            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) == 'b' && s.charAt(i + 1) == 'a') {
                    return false;
                }
            }
            return true;
        }
    }
    
}
