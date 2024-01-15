package org.example.graphs.maxAreaOfIsland;

public class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visited = new boolean[n][m];
        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    max=Math.max(max,dfs(i,j,visited,grid));

                }

            }
        }
        return max;
    }

    private static int dfs(int i, int j, boolean[][] visited, int[][] grid) {
        if (i < 0 || j < 0 || i >= visited.length || j >= visited[0].length || grid[i][j] == 0 || visited[i][j])
            return 0;

        visited[i][j] = true;
        return 1 + dfs(i, j - 1, visited, grid) + dfs(i, j + 1, visited, grid) + dfs(i - 1, j, visited, grid) + dfs(i + 1, j, visited, grid);


    }

}
