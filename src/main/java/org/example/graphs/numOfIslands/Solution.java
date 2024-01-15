package org.example.graphs.numOfIslands;

public class Solution {
    public static int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int numberOfIslands = 0;

        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j]=='1' && !visited[i][j]) {
                    numberOfIslands++;
                    visit(i,j,visited,grid);
                }
            }

        }

        return numberOfIslands;
    }

    private static void visit(int i, int j, boolean[][] visited, char[][] grid) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j]=='0' || visited[i][j])
            return;
        visited[i][j] = true;

        visit(i - 1, j, visited, grid);
        visit(i + 1, j, visited, grid);
        visit(i, j - 1, visited, grid);
        visit(i, j + 1, visited, grid);
    }

}
