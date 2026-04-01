package getastrongholdonrecursion;
// // // package recursion;

// // // public class powxnxraisedtothepowerN {
    

// // // }


// // class Solution {
// //     public double myPow(double x, int n) {
// //         if (n == 0 || x == 1.0) return 1; 
// //         long temp = n;
// //         if (n < 0) {
// //             x = 1 / x;
// //             temp = -1L * n;
// //         }
// //         double ans = 1;
// //         for (long i = 0; i < temp; i++) {
// //             ans *= x; 
// //         }
// //         return ans;
// //     }
// // }

// // class powxnxraisedtothepowerN {
// //     public static void main(String[] args) {
// //         Solution sol = new Solution();
// //         System.out.printf("%.4f\n", sol.myPow(2.0000, 10));
// //         System.out.printf("%.4f\n", sol.myPow(2.0000, -2));
// //     }
// // }

// // // o(n) time complexity
// // // o(1) space complexity


// //optimal  solution 
// class Solution {
//     private double power(double x, long n) {
//         if (n == 0) return 1.0;
//         if (n == 1) return x;
//         if (n % 2 == 0) {
//             return power(x * x, n / 2);
//         }
//         return x * power(x, n - 1);
//     }
    
//     public double myPow(double x, int n) {
//         if (n < 0) {
//             return 1.0 / power(x, -n);
//         }
//         return power(x, n);
//     }
// }

// public class powxnxraisedtothepowerN {
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         double x = 2.0;
//         int n = 10;
//         double result = sol.myPow(x, n);
//         System.out.println(x + "^" + n + " = " + result);
//     }
// }
// //o(logn) time complexity
// //o(logn) space complexity due to recursion stack


//optmial soltion 
