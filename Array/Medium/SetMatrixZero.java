// // // package Array.Medium;

// // // class Solution {
// // //     public void setZeroes(int[][] matrix) {
// // //         int m = matrix.length;
// // //         int n = matrix[0].length;

// // //         for (int i = 0; i < m; i++) {
// // //             for (int j = 0; j < n; j++) {
// // //                 if (matrix[i][j] == 0) {
// // //                     for (int col = 0; col < n; col++) {
// // //                         if (matrix[i][col] != 0)
// // //                             matrix[i][col] = -1;
// // //                     }

// // //                     for (int row = 0; row < m; row++) {
// // //                         if (matrix[row][j] != 0)
// // //                             matrix[row][j] = -1;
// // //                     }

// // //                 }
// // //             }
// // //         }

// // //         for (int i = 0; i < m; i++) {
// // //             for (int j = 0; j < n; j++) {
// // //                 if (matrix[i][j] == -1)
// // //                     matrix[i][j] = 0;
// // //             }
// // //         }
// // //     }
// // // }

// // // public class SetMatrixZero {
// // //     public static void main(String[] args) {

// // //         int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

// // //         Solution sol = new Solution();

// // //         sol.setZeroes(matrix);

// // //         for (int[] row : matrix) {  
// // //             for (int val : row) {
// // //                 System.out.print(val + " ");
// // //             }
// // //             System.out.println();
// // //         }
// // //     }
// // // }

// // //tc 0(m*n*(m+n))
// // //sc 0(1)

// // class Solution {
// //     public void setZeroes(int[][] matrix) {
// //         int m = matrix.length;
// //         int n = matrix[0].length;

// //         boolean[] row = new boolean[m];
// //         boolean[] col = new boolean[n];

// //         for (int i = 0; i < m; i++) {
// //             for (int j = 0; j < n; j++) {
// //                 if (matrix[i][j] == 0) {
// //                     row[i] = true;
// //                     col[j] = true;
// //                 }
// //             }
// //         }
// //         for (int i = 0; i < m; i++) {
// //             for (int j = 0; j < n; j++) {
// //                 if (row[i] || col[j]) {
// //                     matrix[i][j] = 0;
// //                 }
// //             }
// //         }
// //     }
// // }

// // public class SetMatrixZero {
// //     public static void main(String[] args) {
// //         int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

// //         Solution obj = new Solution();
// //         obj.setZeroes(matrix);

// //         for (int[] row : matrix) {
// //             for (int val : row) {
// //                 System.out.print(val + " ");
// //             }
// //             System.out.println();
// //         }
// //     }
// // }


// // //tc 0(m*n)
// // //sc 0(m+n)


// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int m = matrix.length;
//         int n = matrix[0].length;

//         boolean firstRowZero = false;
//         boolean firstColZero = false;

//         for (int j = 0; j < n; j++) {
//             if (matrix[0][j] == 0) {
//                 firstRowZero = true;
//                 break;
//             }
//         }

//         for (int i = 0; i < m; i++) {
//             if (matrix[i][0] == 0) {
//                 firstColZero = true;
//                 break;
//             }
//         }

//         for (int i = 1; i < m; i++) {
//             for (int j = 1; j < n; j++) {
//                 if (matrix[i][j] == 0) {
//                     matrix[i][0] = 0;
//                     matrix[0][j] = 0;
//                 }
//             }
//         }

//         for (int i = 1; i < m; i++) {
//             for (int j = 1; j < n; j++) {
//                 if (matrix[i][0] == 0 || matrix[0][j] == 0) {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }

//         if (firstRowZero) {
//             for (int j = 0; j < n; j++) {
//                 matrix[0][j] = 0;
//             }
//         }

//         if (firstColZero) {
//             for (int i = 0; i < m; i++) {
//                 matrix[i][0] = 0;
//             }
//         }
//     }
// }

// // Main class to run the program
// public class SetMatrixZero {
//     public static void main(String[] args) {
//         Solution obj = new Solution();
//         int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
//         obj.setZeroes(matrix);
//         for (int[] row : matrix) {
//             for (int val : row) {
//                 System.out.print(val + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// //tc 0(m*n)
// //sc 0(1)
