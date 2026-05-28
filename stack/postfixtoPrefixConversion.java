// public class postfixtoPrefixConversion {
    
// }

import java.util.*;

class PostfixToPrefix {
    public String postfixToPrefix(String postfix) {
        Stack<String> s = new Stack<>();
        int n = postfix.length();
        for (int i = 0; i < n; i++) {
            char c = postfix.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                s.push(String.valueOf(c));
            } else {
                String op2 = s.pop();
                String op1 = s.pop();
                s.push(c + op1 + op2);
            }
        }
        return s.peek();
    }
}

public class postfixtoPrefixConversion {
    public static void main(String[] args) {
        PostfixToPrefix converter = new PostfixToPrefix();
        String postfix = "ABC/-AK/L-*";
        System.out.println("Prefix Expression: " + converter.postfixToPrefix(postfix));
    }
}

//tc: O(n) where n is the length of the postfix expression
//sc: O(n) for the stack used to store intermediate results