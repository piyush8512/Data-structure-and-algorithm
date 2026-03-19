// public class MaximumNestingDepthofParenthesis {
    
// }

class MaximumNestingDepthofParenthesis {
    public int maxDepth(String s) {
        int p = 0; 
        int ans = 0; 
        for (char ch : s.toCharArray()) {
            if (ch == '(') p++;
            else if (ch == ')') p--;
            ans = Math.max(ans, p);
        }
        return ans; 
    }
}

// Main class to test the function
class Main {
    public static void main(String[] args) {
        MaximumNestingDepthofParenthesis sol = new MaximumNestingDepthofParenthesis();
        String s = "(1+(2*3)+((8)/4))+1";
        int result = sol.maxDepth(s);
        System.out.println("Max  : " + result);
    }
}

// tc: O(n) where n is the length of the input string
// sc: O(1) as we are using only a constant amount of extra space for the variables