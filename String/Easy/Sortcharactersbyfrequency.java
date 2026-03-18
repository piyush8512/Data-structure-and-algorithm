// public class Sortcharactersbyfrequency {
    
// }

import java.util.*;

class Solution {
    public List<Character> frequencySort(String s) {
        Pair[] freq = new Pair[26];
        
        for (int i = 0; i < 26; i++) {
            freq[i] = new Pair(0, (char)(i + 'a'));
        }
        for (char ch : s.toCharArray()) {
            freq[ch - 'a'].freq++;
        }
        Arrays.sort(freq, (p1, p2) -> {
            if (p1.freq != p2.freq) return p2.freq - p1.freq;
            return p1.ch - p2.ch;
        });
        List<Character> result = new ArrayList<>();
        for (Pair p : freq) {
            if (p.freq > 0) result.add(p.ch);
        }
        return result;
    }

    class Pair {
        int freq;
        char ch;
        Pair(int f, char c) {
            this.freq = f;
            this.ch = c;
        }
    }
}

// Separate class to run the main method
public class Sortcharactersbyfrequency {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "tree";
        List<Character> result = sol.frequencySort(s);
        System.out.println(result);  
    }
}
//tc: O(n log n) where n is the number of unique characters (at most 26 for lowercase letters)
//sc: O(n) for the frequency array and the result list, where n is the