// // // public class SearchinasortedtwoDmatrix {

// // // }

// // public class SearchinasortedtwoDmatrix {
// //     public boolean searchMatrix(int[][] matrix, int target) {
// //         int n = matrix.length;
// //         int m = matrix[0].length;
// //         for (int i = 0; i < n; i++) {
// //             for (int j = 0; j < m; j++) {
// //                 if (matrix[i][j] == target)
// //                     return true;
// //             }
// //         }
// //         return false;
// //     }
// // }

// // class Main {
// //     public static void main(String[] args) {
// //         int[][] matrix = {
// //             {1, 2, 3, 4},
// //             {5, 6, 7, 8},
// //             {9, 10, 11, 12}
// //         };
// //         SearchinasortedtwoDmatrix obj = new SearchinasortedtwoDmatrix();
// //         if (obj.searchMatrix(matrix, 8)) 
// //             System.out.println("true");
// //         else 
// //             System.out.println("false");
// //     }
// // }

// // //tc: O(n*m) where n is the number of rows and m is the number of columns in the matrix
// // //sc: O(1) as we are using only a constant amount of extra space for

// //better approach

// public class SearchinasortedtwoDmatrix {
//     public boolean binarySearch(int[] nums, int target) {
//         int n = nums.length;
//         int low = 0, high = n - 1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (nums[mid] == target)
//                 return true;
//             else if (target > nums[mid])
//                 low = mid + 1;
//             else
//                 high = mid - 1;
//         }
//         return false;
//     }

//     public boolean searchMatrix(int[][] matrix, int target) {
//         int n = matrix.length;
//         int m = matrix[0].length;
//         for (int i = 0; i < n; i++) {
//             if (matrix[i][0] <= target && target <= matrix[i][m - 1]) {
//                 return binarySearch(matrix[i], target);
//             }
//         }
//         return false;
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         int[][] matrix = {
//             {1, 2, 3, 4},
//             {5, 6, 7, 8},
//             {9, 10, 11, 12}
//         };
//         SearchinasortedtwoDmatrix obj = new SearchinasortedtwoDmatrix();
//         if (obj.searchMatrix(matrix, 8))
//             System.out.println("true");
//         else
//             System.out.println("false");
//     }
// }
// //tc: O(n*log(m)) where n is the number of rows and m is the number of columns in the matrix
// //sc: O(1) as we are using only a constant amount of extra space for

//optimal approach 

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0, high = n * m - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int row = mid / m;
            int col = mid % m;
            if (matrix[row][col] == target)
                return true;
            else if (matrix[row][col] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }
}

// Driver class
public class SearchinasortedtwoDmatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        Solution obj = new Solution();
        if (obj.searchMatrix(matrix, 8))
            System.out.println("true");
        else
            System.out.println("false");
    }
}

// tc: O(log(n*m)) where n is the number of rows and m is the number of columns
// in the matrix
// sc: O(1) as we are using only a constant amount of extra space for
