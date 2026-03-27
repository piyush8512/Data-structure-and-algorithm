// package leetcode;

// public class MatrixSimilarityAfterCyclicShifts {
    
// }



class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int shift = k % n;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int expected;
                if (i % 2 == 0) {
                    expected = mat[i][(j + shift) % n];
                } else {
                    expected = mat[i][(j - shift + n) % n];
                }
                if (mat[i][j] != expected) {
                    return false;
                }
            }
        }
        return true;
    }
}

public class matrixSimilarityAfterCyclicShifts {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 1;
        System.out.println(sol.areSimilar(mat, k));
    }
}