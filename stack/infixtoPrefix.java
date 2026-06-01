// // public class infixtoPrefix{

// // }

// import java.util.Stack;

// class Solution {

//     public static int getPriority(char C) {
//         if (C == '^') return 3;
//         else if (C == '*' || C == '/') return 2;
//         else if (C == '+' || C == '-') return 1;
//         return 0;
//     }

//     public static String infixToPostfix(String infix) {
//         infix = '(' + infix + ')'; 
//         int l = infix.length();
//         Stack<Character> stack = new Stack<>(); 
//         StringBuilder result = new StringBuilder(); 

//         for (int i = 0; i < l; i++) {
//             char c = infix.charAt(i);
//             if (Character.isLetterOrDigit(c))
//                 result.append(c);
//             else if (c == '(')
//                 stack.push('(');
//             else if (c == ')') {
//                 while (stack.peek() != '(') {
//                     result.append(stack.pop());
//                 }
//                 stack.pop();
//             }
//             else {
//                 while (!stack.isEmpty() && getPriority(c) <= getPriority(stack.peek())) {
//                     result.append(stack.pop());
//                 }
//                 stack.push(c);
//             }
//         }
//         while (!stack.isEmpty()) {
//             result.append(stack.pop());
//         }
//         return result.toString();
//     }

//     public static String infixToPrefix(String infix) {
//         StringBuilder sb = new StringBuilder(infix);
//         sb.reverse();
//         for (int i = 0; i < sb.length(); i++) {
//             if (sb.charAt(i) == '(')
//                 sb.setCharAt(i, ')');
//             else if (sb.charAt(i) == ')')
//                 sb.setCharAt(i, '(');
//         }
//         String prefix = infixToPostfix(sb.toString());
//         return new StringBuilder(prefix).reverse().toString();
//     }
// }

// public class infixtoPrefix {
//     public static void main(String[] args) {
//         String exp = "(p+q)*(c-d)";  // Infix expression
//         System.out.println("Infix expression: " + exp);
//         System.out.println("Prefix Expression: " + Solution.infixToPrefix(exp));  // Output the prefix expression
//     }
// }

//tc: O(n) where n is the length of the infix expression. Each character is processed once.
//sc: O(n) for the stack and the output string. In the worst case,