package org.example.graphs.countSubIslands;

public class Solution {
    public static int countSubIslands(int[][] grid1, int[][] grid2) {
        int n1 = grid1.length;
        int m1 = grid1[0].length;

        int n2 = grid2.length;
        int m2 = grid2[0].length;
        int numberOfSubIslands = 0;
        boolean[][] visited = new boolean[n2][m2];

        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                if (grid2[i][j] == 1 && !visited[i][j]) {
                    if (dfs(i, j, visited, grid2, grid1)) numberOfSubIslands++;
                }
            }
        }
        return numberOfSubIslands;
    }

    private static boolean dfs(int i, int j, boolean[][] visited, int[][] grid2, int[][] grid1) {
        int n1 = grid1.length;
        int m1 = grid1[0].length;

        int n2 = grid2.length;
        int m2 = grid2[0].length;
        if (i < 0 || j < 0 || i >= n2 || j >= m2 || i >= n1 || j >= m1 || visited[i][j] || grid2[i][j] == 0)
            return true;
        boolean result = grid1[i][j] != 0;
        visited[i][j] = true;
        result = dfs(i, j - 1, visited, grid2, grid1) && result;
        result = dfs(i, j + 1, visited, grid2, grid1) && result;
        result = dfs(i - 1, j, visited, grid2, grid1) && result;
        result = dfs(i + 1, j, visited, grid2, grid1) && result;
        return result;


    }


}
