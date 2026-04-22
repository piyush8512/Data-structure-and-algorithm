// // // public class Findtherepeatingandmissingnumbers {
    
// // // }

// // // class Solution {
// // //     public int[] findMissingRepeatingNumbers(int[] nums) {
// // //         int n = nums.length;
// // //         int repeating = -1, missing = -1;
// // //         for (int i = 1; i <= n; i++) {
// // //             int cnt = 0;
// // //             for (int j = 0; j < n; j++) {
// // //                 if (nums[j] == i) cnt++;
// // //             }
// // //             if (cnt == 2) repeating = i;
// // //             else if (cnt == 0) missing = i;
// // //             if (repeating != -1 && missing != -1)
// // //                 break;
// // //         }
// // //         return new int[]{repeating, missing};
// // //     }
// // // }

// // // public class Findtherepeatingandmissingnumbers{
// // //     public static void main(String[] args) {
// // //         int[] nums = {3, 1, 2, 5, 4, 6, 7, 5};
// // //         Solution sol = new Solution();
// // //         int[] result = sol.findMissingRepeatingNumbers(nums);
// // //         System.out.println("The repeating and missing numbers are: {" 
// // //                             + result[0] + ", " + result[1] + "}");
// // //     }
// // // }

// // //tc: O(n^2) due to the nested loops
// // //sc: O(1) as we are using only a constant amount of extra space for


// // //optimal approach soluiton 1
// // class Solution {
// //     public int[] findMissingRepeatingNumbers(int[] nums) {
// //         long n = nums.length;
// //         long SN = (n * (n + 1)) / 2;

// //         // Sum of squares of first n natural numbers
// //         long S2N = (n * (n + 1) * (2 * n + 1)) / 6;

// //         // Calculate actual sum (S) and sum of squares (S2) of array elements
// //         long S = 0, S2 = 0;
// //         for (int i = 0; i < n; i++) {
// //             S += nums[i];
// //             S2 += (long) nums[i] * (long) nums[i];
// //         }

// //         // Compute the difference values
// //         long val1 = S - SN; // X - Y

// //         // S2 - S2n = X^2 - Y^2
// //         long val2 = S2 - S2N;

// //         // Calculate X + Y
// //         val2 = val2 / val1;

// //         // Calculate X and Y
// //         long x = (val1 + val2) / 2; // repeating
// //         long y = x - val1;          // missing

// //         return new int[]{(int) x, (int) y};
// //     }
// // }

// // // Separate main class
// // public class Findtherepeatingandmissingnumbers {
// //     public static void main(String[] args) {
// //         int[] nums = {3, 1, 2, 5, 4, 6, 7, 5};
// //         Solution sol = new Solution();
// //         int[] result = sol.findMissingRepeatingNumbers(nums);
// //         System.out.printf("The repeating and missing numbers are: {%d, %d}\n", result[0], result[1]);
// //     }
// // }

// //tc: O(n) due to the single loop to calculate sums
// //sc: O(1) as we are using only a constant amount of extra space for


// //optimal approach solution 2 using xor

// class Solution {
//     public int[] findMissingRepeatingNumbers(int[] nums) {
//         int n = nums.length; 
//         int xr = 0;
//         for (int i = 0; i < n; i++) {
//             xr = xr ^ nums[i];   
//             xr = xr ^ (i + 1);    
//         }
//         int number = (xr & ~(xr - 1));
//         int zero = 0, one = 0;

//         for (int i = 0; i < n; i++) {
//             if ((nums[i] & number) != 0) {
//                 one ^= nums[i];
//             } else {
//                 zero ^= nums[i];
//             }
//         }

//         for (int i = 1; i <= n; i++) {
//             if ((i & number) != 0) {
//                 one ^= i;
//             } else {
//                 zero ^= i;
//             }
//         }

//         int cnt = 0;
//         for (int val : nums) {
//             if (val == zero) cnt++;
//         }

//         if (cnt == 2) {
//             return new int[]{zero, one}; 
//         }
//         return new int[]{one, zero};
//     }
// }


// public class Findtherepeatingandmissingnumbers {
//     public static void main(String[] args) {
//         int[] nums = {3, 1, 2, 5, 4, 6, 7, 5};

//         Solution sol = new Solution();
//         int[] result = sol.findMissingRepeatingNumbers(nums);

//         System.out.println("The repeating and missing numbers are: {" + result[0] + ", " + result[1] + "}");
//     }
// }

// //tc: O(n) due to the single loop to calculate xor and count occurrences
// //sc: O(1) as we are using only a constant amount of extra space for variables