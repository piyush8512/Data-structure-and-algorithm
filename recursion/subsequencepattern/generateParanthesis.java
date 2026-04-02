// // package subsequencepattern;

// // public class generateParanthesis {
    
// // }


// //brute force solution
// import java.util.*;

// class BruteSolution {
//     public boolean isValid(String s) {
//         int balance = 0;
//         for (char c : s.toCharArray()) {
//             if (c == '(') balance++;
//             else balance--;
//             if (balance < 0) return false;
//         }
//         return balance == 0;
//     }

//     public void generateAll(String curr, int n, List<String> res) {
//         if (curr.length() == 2 * n) {
//             if (isValid(curr)) res.add(curr);
//             return;
//         }
//         generateAll(curr + "(", n, res);
//         generateAll(curr + ")", n, res);
//     }

//     public List<String> generateParenthesis(int n) {
//         List<String> res = new ArrayList<>();
//         generateAll("", n, res);
//         return res;
//     }
// }

// public class generateParanthesis {
//     public static void main(String[] args) {
//         BruteSolution sol = new BruteSolution();
//         List<String> result = sol.generateParenthesis(3);
//         for (String s : result) {
//             System.out.println(s);
//         }
//     }
// }

// //  Time Complexity: O(2^(2n) * n) due to the generation and validation of all 2^(2n) sequences.
// //Space Complexity: O(n) space required per sequence.


//optimalsolution
import java.util.*;

class OptimalSolution {
    public void backtrack(String curr, int open, int close, int n, List<String> res) {
        if (curr.length() == 2 * n) {
            res.add(curr);
            return;
        }
        if (open < n) backtrack(curr + "(", open + 1, close, n, res);
        if (close < open) backtrack(curr + ")", open, close + 1, n, res);
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack("", 0, 0, n, res);
        return res;
    }
}

public class generateParanthesis {
    public static void main(String[] args) {
        OptimalSolution sol = new OptimalSolution();
        List<String> result = sol.generateParenthesis(3);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
// Time Complexity: O(2^n) (Catalan number): C(n) = (2n)! / (n!(n+1)!) is the number of valid sequences.
// Each sequence takes O(n) to build.
// So, total complexity: O(C(n) × n)

// Space Complexity: O(n) recursion depth.
// O(C(n) × n) to store results.