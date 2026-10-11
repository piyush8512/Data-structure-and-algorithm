// // package maths;

// // // public class primefactorisationtilln {
    
// // // }

// // import java.util.*;

// // public class primefactorisationtilln {

// //     static boolean isPrime(int num) {
// //         if (num < 2) return false;
// //         for (int i = 2; i * i <= num; i++) {
// //             if (num % i == 0) {
// //                 return false;
// //             }
// //         }
// //         return true;
// //     }

// //     static List<Integer> primeFactors(int n) {
// //         List<Integer> list = new ArrayList<>();

// //         for (int i = 2; i <= n; i++) {
// //             if (n % i == 0) {
// //                 if (isPrime(i)) {
// //                     list.add(i);
// //                 }
// //             }
// //         }
// //         return list;
// //     }

// //     public static void main(String[] args) {
// //         int n = 36;
// //         List<Integer> result = primeFactors(n);
// //         System.out.println(result);
// //     }
// // }

// //tc O(n) × O(√n)
// //sc  O(n)



// //soltuion 2
// import java.util.*;

// public class PrimeFactorization {

//     static List<Integer> primeFactors(int n) {
//         List<Integer> list = new ArrayList<>();
//         for (int i = 2; i * i <= n; i++) {
//             if (n % i == 0) {
//                 while (n % i == 0) {
//                     list.add(i);
//                     n = n / i;
//                 }
//             }
//         }
//         if (n != 1) {
//             list.add(n);
//         }
//         return list;
//     }

//     public static void main(String[] args) {
//         int n = 780;

//         List<Integer> result = primeFactors(n);

//         System.out.println(result);
//     }
// }

// //tc O(√n)
// //sc O(1)


// //soltuion 3

// Example 1:
// Input : queries = [2, 3, 4, 5, 6]
// Output : [ [2], [3], [2, 2], [5], [2, 3] ]
// Explanation : The values 2, 3, 5 are itself prime numbers.
// The prime factorization of 4 will be --> 2 * 2.
// The prime factorization of 6 will be --> 2 * 3.


import java.util.*;

class Solution {

    public List<List<Integer>> primeFactors(int[] queries) {
        List<List<Integer>> result = new ArrayList<>();
        for (int num : queries) {
            List<Integer> factors = new ArrayList<>();
            for (int i = 2; i * i <= num; i++) {
                while (num % i == 0) {
                    factors.add(i);
                    num = num / i;
                }
            }
            if (num > 1) {
                factors.add(num);
            }
            result.add(factors);
        }
        return result;
    }
}

public class PrimeFactorization {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] queries = {2, 3, 4, 5, 6};
        List<List<Integer>> result = solution.primeFactors(queries);
        System.out.println(result);
    }
}
//tc O(√n) for each query
//sc O(1) for each query
