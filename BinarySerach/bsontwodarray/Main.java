// // package BinarySerach.bsontwodarray;

// // public class Findtherowwithnumberofones {

// // }

// class Solution {
//     public int rowWithMax1s(int[][] matrix, int n, int m) {
//         int cnt_max = 0;  
//         int index = -1;   

//         for (int i = 0; i < n; i++) {
//             int cnt_ones = 0;
//             for (int j = 0; j < m; j++) {
//                 cnt_ones += matrix[i][j];
//             }
//             if (cnt_ones > cnt_max) {
//                 cnt_max = cnt_ones;
//                 index = i;
//             }
//         }
//         return index;
//     }
// }

// public class Findtherowwithnumberofones {
//     public static void main(String[] args) {
//         int[][] matrix = {{1, 1, 1}, {0, 0, 1}, {0, 0, 0}};
//         int n = 3, m = 3;

//         Solution obj = new Solution();
//         System.out.println("The row with maximum no. of 1's is: " + obj.rowWithMax1s(matrix, n, m));
//     }
// }

// //tc: O(n*m) where n is the number of rows and m is the number of columns in the matrix
// //sc: O(1) as we are using only a constant amount of extra space for

//optimal approach

class Solution {

    public int lowerBound(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public int rowWithMax1s(int[][] matrix, int n, int m) {
        int cnt_max = 0;
        int index = -1;
        for (int i = 0; i < n; i++){
            int cnt_ones = m - lowerBound(matrix[i], m, 1);
            if (cnt_ones > cnt_max) {
                cnt_max = cnt_ones;
                index = i;
            }
        }
        return index;
    }
}

public class Main {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 1, 1 }, { 0, 0, 1 }, { 0, 0, 0 } };
        int n = 3, m = 3;
        Solution obj = new Solution();
        System.out.println("The row with maximum no. of 1's is: " + obj.rowWithMax1s(matrix, n, m));
    }
}

//tc: O(n*log(m)) where n is the number of rows and m is the number of columns in the matrix
//sc: O(1) as we are using only a constant amount of extra space for    