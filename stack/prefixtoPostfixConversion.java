// public class prefixtoPostfixConversion {
    
// }

import java.util.*;

class PrefixToPostfix {
    public String prefixToPostfix(String prefix) {
        Stack<String> s = new Stack<>();
        int n = prefix.length();
        for (int i = n - 1; i >= 0; i--) {
            char c = prefix.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                s.push(String.valueOf(c));
            } else {
                String op1 = s.pop();
                String op2 = s.pop();
                s.push(op1 + op2 + c);
            }
        }
        return s.peek();
    }
}

public class prefixtoPostfixConversion {
    public static void main(String[] args) {
        PrefixToPostfix converter = new PrefixToPostfix();
        String prefix = "*-A/BC-/AKL";
        System.out.println("Postfix Expression: " + converter.prefixToPostfix(prefix));
    }
}
