// // public class prefixtoInfixConversion {
    
// // }

// import java.util.*;

// class PrefixToInfix {
//     public String prefixToInfix(String prefix) {
//         Stack<String> s = new Stack<>();
//         int n = prefix.length();
//         for (int i = n - 1; i >= 0; i--) {
//             char c = prefix.charAt(i);
//             if (Character.isLetterOrDigit(c)) {
//                 s.push(String.valueOf(c));
//             } else { 
//                 String op1 = s.pop();
//                 String op2 = s.pop();
//                 s.push("(" + op1 + c + op2 + ")");
//             }
//         }
//         return s.peek();
//     }
// }

// public class prefixtoInfixConversion {
//     public static void main(String[] args) {
//         PrefixToInfix converter = new PrefixToInfix();
//         String prefix = "*-A/BC-/AKL";
//         System.out.println("Infix Expression: " + converter.prefixToInfix(prefix));
//     }
// }

//tc: O(n) where n is the length of the prefix expression
//sc: O(n) for the stack