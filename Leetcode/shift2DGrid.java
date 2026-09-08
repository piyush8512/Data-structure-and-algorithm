import java.util.*;

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;

        k = k % total;

        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int oldIndex = i * n + j;
                int newIndex = (oldIndex + k) % total;
                int newRow = newIndex / n;
                int newCol = newIndex % n;
                result[newRow][newCol] = grid[i][j];
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(result[i][j]);
            }
            ans.add(row);
        }
        return ans;
    }
}

public class shift2DGrid {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 1;
        List<List<Integer>> result = solution.shiftGrid(grid, k);
        System.out.println(result);
    }
}