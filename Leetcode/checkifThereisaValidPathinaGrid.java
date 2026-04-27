// package leetcode;

// public class checkifThereisaValidPathinaGrid {
    
// }


import java.util.*;

class Solution {
    public boolean hasValidPath(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        // directions: left, right, up, down
        int[][] dirs = {{0,-1},{0,1},{-1,0},{1,0}};

        // allowed directions for each type
        Map<Integer, int[][]> map = new HashMap<>();
        map.put(1, new int[][]{{0,-1},{0,1}});
        map.put(2, new int[][]{{-1,0},{1,0}});
        map.put(3, new int[][]{{0,-1},{1,0}});
        map.put(4, new int[][]{{0,1},{1,0}});
        map.put(5, new int[][]{{0,-1},{-1,0}});
        map.put(6, new int[][]{{0,1},{-1,0}});

        boolean[][] visited = new boolean[m][n];
        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{0,0});
        visited[0][0] = true;

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int r = curr[0], c = curr[1];

            if (r == m-1 && c == n-1) return true;

            for (int[] d : map.get(grid[r][c])) {
                int nr = r + d[0];
                int nc = c + d[1];

                if (nr < 0 || nc < 0 || nr >= m || nc >= n || visited[nr][nc])
                    continue;

                // check reverse connection
                for (int[] back : map.get(grid[nr][nc])) {
                    if (nr + back[0] == r && nc + back[1] == c) {
                        visited[nr][nc] = true;
                        q.offer(new int[]{nr, nc});
                    }
                }
            }
        }

        return false;
    }
}

public class checkifThereisaValidPathinaGrid {
    public static void main(String[] args) {
        int[][] grid = {{2,4,3},{6,5,2}};
        Solution sol = new Solution();
        boolean ans = sol.hasValidPath(grid);
        System.out.println("Is there a valid path in the grid? " + ans);
    }
}


//1391
