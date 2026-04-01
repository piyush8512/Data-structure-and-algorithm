package subsequencepattern;

// public class generateallbinarystrings {

// }

import java.util.*;

class Solution {
    static void generate(int n, String curr, List<String> result) {
        if (curr.length() == n) {
            result.add(curr);
            return;
        }
        generate(n, curr + "0", result);
        if (curr.isEmpty() || curr.charAt(curr.length() - 1) != '1') {
            generate(n, curr + "1", result);
        }
    }
}

public class generateallbinarystrings {
    public static void main(String[] args) {
        int n = 3;
        List<String> result = new ArrayList<>();
        Solution.generate(n, "", result);

        // Print results
        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}

