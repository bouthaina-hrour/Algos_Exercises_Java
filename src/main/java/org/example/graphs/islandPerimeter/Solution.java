package org.example.graphs.islandPerimeter;

public class Solution {

    public static int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) return dfs(i, j, grid, visited);
            }

        }
        return 0;
    }

    public static int dfs(int i, int j, int[][] grid, boolean[][] visited) {
        int n = grid.length;
        int m = grid[0].length;
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == 0) return 1;
        if (visited[i][j] == true) return 0;
        int perimeter = 0;
        visited[i][j] = true;
        perimeter = dfs(i, j + 1, grid, visited) +
                dfs(i + 1, j, grid, visited) +
                dfs(i, j - 1, grid, visited) +
                dfs(i - 1, j, grid, visited);
        return perimeter;

    }

}
