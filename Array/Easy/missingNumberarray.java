
//bruteforce
// class missingNumberarray {
//     public int missingNumber(int[] a, int N) {
//         for (int i = 1; i <= N; i++) {
//             boolean found = false;
//             for (int j = 0; j < N - 1; j++) {
//                 if (a[j] == i) {
//                     found = true;
//                     break;
//                 }
//             }
//             if (!found)
//                 return i;
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int[] a = { 1, 2, 4, 5 };
//         int N = 5;

//         missingNumberarray obj = new missingNumberarray();
//         int ans = obj.missingNumber(a, N);
//         System.out.println("The missing number is: " + ans);
//     }
// }

// tc: O(n)*O(n)
// sc: O(1)

//better
// class missingNumberarray {
//     public int missingNumber(int[] a, int N) {
//         int sum = (N * (N + 1)) / 2;
//         int actualSum = 0;
//         for (int i = 0; i < N - 1; i++) {
//             actualSum += a[i];
//         }
//         return sum - actualSum;
//     }
//     public static void main(String[] args) {
//         int[] a = { 1, 2, 4, 5 };
//         int N = 5;
//         missingNumberarray obj = new missingNumberarray();
//         int ans = obj.missingNumber(a, N);
//         System.out.println("The missing number is: " + ans);
//     }
// }

// // tc: O(n)
// // sc: O(1)

///optmal 
/// 
/// 
// class missingNumberarray {
//     public int missingNumber(int[] a, int N) {
//         int xor1 = 0, xor2 = 0;
//         for (int i = 0; i < N - 1; i++) {
//             xor2 ^= a[i];
//             xor1 ^= (i + 1);
//         }
//         xor1 ^= N;
//         return xor1 ^ xor2;
//     }

//     public static void main(String[] args) {
//         int[] a = { 1, 2, 3, 4, 5 };
//         int N = 5;

//         missingNumberarray obj = new missingNumberarray();
//         int ans = obj.missingNumber(a, N);
//         System.out.println("The missing number is: " + ans);
//     }
// }



