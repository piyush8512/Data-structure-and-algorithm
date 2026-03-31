// // package bitmanupulation.learnbitmanypulation;

// // public class checkiftheithbitissetornot {
    
// // }

// //brute solution
// class Solution {
//     public boolean checkIthBit(int n, int i) {
//         String binary = Integer.toBinaryString(n); 
//         if (i >= binary.length()) return false;
//         return binary.charAt(binary.length() - 1 - i) == '1';
//     }
// }

// public class checkiftheithbitissetornot {
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int num = 5;
//         int bitIndex = 2; 

//         if (sol.checkIthBit(num, bitIndex)) {
//             System.out.println("The " + bitIndex + "-th bit of " + num + " is set (1).");
//         } else {
//             System.out.println("The " + bitIndex + "-th bit of " + num + " is not set (0).");
//         }
//     }
// }
// // tc: o(log n) sc: o(log n) due to string space


//optimal solution
class Solution {
    public boolean checkIthBit(int n, int i) {
        return (n & (1 << i)) != 0;  // If the i-th bit is 1, the result will be non-zero
    }
}

public class checkiftheithbitissetornot {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num = 5;  // Binary: 101
        int bitIndex = 2;  
        if (sol.checkIthBit(num, bitIndex)) {
            System.out.println("The " + bitIndex + "-th bit of " + num + " is set (1).");
        } else {
            System.out.println("The " + bitIndex + "-th bit of " + num + " is not set (0).");
        }
    }
}

// tc: o(1) sc: o(1)