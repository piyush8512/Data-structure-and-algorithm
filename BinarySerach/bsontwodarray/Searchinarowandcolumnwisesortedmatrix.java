// // // public class Searchinarowandcolumnwisesortedmatrix {

// // // }




// //bruteforce solution
// // class Searchinarowandcolumnwisesortedmatrix {
// //     private final int[][] matrix; 

// //     public Searchinarowandcolumnwisesortedmatrix(int[][] matrix) {
// //         this.matrix = matrix;
// //     }

// //     public boolean searchElement(int target) {
// //         int n = matrix.length;      
// //         int m = matrix[0].length; 

// //         for (int i = 0; i < n; i++) {
// //             for (int j = 0; j < m; j++) {
// //                 if (matrix[i][j] == target) {
// //                     return true;
// //                 }
// //             }
// //         }
// //         return false;
// //     }

// //     public static void main(String[] args) {
// //       int[][] matrix = {
// //             {1, 4, 7, 11, 15},
// //             {2, 5, 8, 12, 19},
// //             {3, 6, 9, 16, 22},
// //             {10, 13, 14, 17, 24},
// //             {18, 21, 23, 26, 30}
// //         };
// //         Searchinarowandcolumnwisesortedmatrix ms = new Searchinarowandcolumnwisesortedmatrix(matrix);
// //         boolean found = ms.searchElement(8);
// //         System.out.println(found);
// //     }
// // }

// // // Time Complexity: O(n*m) where n is the number of rows and m is the number of columns in the matrix.
// // // Space Complexity: O(1) as we are not using any additional data structures.



// //better solution
// class MatrixSearch {
//     private final int[][] matrix; 
//     public MatrixSearch(int[][] matrix) {
//         this.matrix = matrix;
//     }

//     private boolean binarySearch(int[] nums, int target) {
//         int low = 0, high = nums.length - 1;        
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (nums[mid] == target) {
//                 return true; 
//             } else if (target > nums[mid]) {
//                 low = mid + 1; 
//             } else {
//                 high = mid - 1; 
//             }
//         }
//         return false; 
//     }

//     public boolean searchElement(int target) {
//         for (int[] matrix1 : matrix) {
//             if (binarySearch(matrix1, target)) {
//                 return true; 
//             }
//         }
//         return false; 
//     }

//     public static void main(String[] args) {
//         int[][] matrix = {
//             {1, 4, 7, 11, 15},
//             {2, 5, 8, 12, 19},
//             {3, 6, 9, 16, 22},
//             {10, 13, 14, 17, 24},
//             {18, 21, 23, 26, 30}
//         };
//         MatrixSearch ms = new MatrixSearch(matrix);
//         boolean found = ms.searchElement(8);
//         System.out.println(found);
//     }
// }

// // Time Complexity: O(n log m) where n is the number of rows and m is the number of columns in the matrix.
// // Space Complexity: O(1) as we are not using any additional data structures.



//optimal solution
class MatrixSearch {
    private final int[][] matrix;
    public MatrixSearch(int[][] matrix) {
        this.matrix = matrix;
    }
    public boolean searchElement(int target) {
        int n = matrix.length;       
        int m = matrix[0].length;     
        int row = 0;        
        int col = m - 1;   
        while (row < n && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                row++; 
            } else {
                col--; 
            }
        }
        return false; 
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };

        MatrixSearch ms = new MatrixSearch(matrix);
        boolean found = ms.searchElement(8);
        System.out.println(found); 
    }
}

// Time Complexity: O(n + m) where n is the number of rows and m is the number of columns in the matrix.
// Space Complexity: O(1) as we are not using any additional data structures.