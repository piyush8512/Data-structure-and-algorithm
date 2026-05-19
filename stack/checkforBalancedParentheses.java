// public class checkforBalancedParentheses {
    
// }


import java.util.Stack;

public class checkforBalancedParentheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>(); 
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[')
                st.push(ch);  
            else {
                if (st.isEmpty()) return false; 
                char top = st.pop();
                if ((ch == ')' && top == '(') ||
                    (ch == ']' && top == '[') ||
                    (ch == '}' && top == '{'))
                    continue;
                else
                    return false;
            }
        }
        return st.isEmpty(); 
    }

    public static void main(String[] args) {
        checkforBalancedParentheses sol = new checkforBalancedParentheses();
        String s = "()[{}()]";

        if (sol.isValid(s))
            System.out.println("True");
        else
            System.out.println("False");
    }
}

//tc: O(n)  
//sc: O(n) in worst case when all characters are opening parentheses.
