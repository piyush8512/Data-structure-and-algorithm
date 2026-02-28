package leetcode;

// public class Number of Steps to ReduceaNumberinBinaryRepresentationtoOne {

// }

// class solution {
//     public int numSteps(String s) {
//         int steps = 0;
//         StringBuilder sb = new StringBuilder(s);
//         while (!sb.toString().equals("1")) {
//             if (sb.charAt(sb.length() - 1) == '0') {
//                 sb.deleteCharAt(sb.length() - 1);
//             } else {
//                 addOne(sb);
//             }

//             steps++;
//         }

//         return steps;
//     }

//     // helper to add 1 to binary string
//     private void addOne(StringBuilder sb) {
//         int i = sb.length() - 1;

//         while (i >= 0 && sb.charAt(i) == '1') {
//             sb.setCharAt(i, '0');
//             i--;
//         }

//         if (i >= 0) {
//             sb.setCharAt(i, '1');
//         } else {
//             sb.insert(0, '1');
//         }
//     }
// }
// public class NumberofStepstoReduceaNumberinBinaryRepresentationtoOne {
//     public static void main(String[] args) {
//         solution solution = new solution();
//         String s = "1101";
//         int steps = solution.numSteps(s);
//         System.out.println("Number of steps to reduce " + s + " to 1: " + steps);
//     }
// }

// Time Complexity: O(n) where n is the length of the binary string
// Space Complexity: O(n) for the StringBuilder used to manipulate the binary string



class Solution {
    public int numSteps(String s) {
        
        int steps = 0;
        int carry = 0;
        
        // start from last digit (right to left)
        for (int i = s.length() - 1; i > 0; i--) {
            
            int bit = s.charAt(i) - '0';
            
            if (bit + carry == 1) {
                // odd → add 1 + divide
                steps += 2;
                carry = 1;
            } else {
                // even → divide
                steps += 1;
            }
        }
        
        return steps + carry;
    }
}

public class NumberofStepstoReduceaNumberinBinaryRepresentationtoOne {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "1101";
        int steps = solution.numSteps(s);
        System.out.println("Number of steps to reduce " + s + " to 1: " + steps);
    }
}

