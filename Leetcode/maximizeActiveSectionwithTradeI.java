import java.util.ArrayList;
import java.util.List;

class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int originalOnes = 0;
        for (char c : s.toCharArray()) {
            if (c == '1')
                originalOnes++;
        }

        String t = "1" + s + "1";
        List<Character> chars = new ArrayList<>();
        List<Integer> lens = new ArrayList<>();

        int i = 0;
        while (i < t.length()) {
            char ch = t.charAt(i);
            int j = i;

            while (j < t.length() && t.charAt(j) == ch) {
                j++;
            }

            chars.add(ch);
            lens.add(j - i);

            i = j;
        }

        int maxGain = 0;

        for (int k = 1; k < chars.size() - 1; k++) {
            if (chars.get(k) == '1'
                    && chars.get(k - 1) == '0'
                    && chars.get(k + 1) == '0') {

                int gain = lens.get(k - 1) + lens.get(k + 1);
                maxGain = Math.max(maxGain, gain);
            }
        }

        return originalOnes + maxGain;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "110001111";
        int result = solution.maxActiveSectionsAfterTrade(s);
        System.out.println("Maximum active sections after trade: " + result);
    }
}

// Time: O(n)
// Space: O(1)