package org.example.graphs.weakVertices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {


    public static List<Integer> findWeakVertices(int[][] adjacencyMatrix) {
        int n = adjacencyMatrix.length;
        int m = adjacencyMatrix[0].length;
        boolean[] visited = new boolean[n];
        List<Integer> weakVertices = new ArrayList<>();

        // Performing DFS for each unvisited vertex
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, adjacencyMatrix, visited, weakVertices);
            }
        }

        return weakVertices;
    }

    private static void dfs(int vertex, int[][] adjacencyMatrix, boolean[] visited, List<Integer> weakVertices) {
        visited[vertex] = true;

        for (int neighbor = 0; neighbor < adjacencyMatrix.length; neighbor++) {
            if (adjacencyMatrix[vertex][neighbor] == 1 && !visited[neighbor]) {
                // Check for common neighbors
                List<Integer> commonNeighbors = findCommonNeighbors(vertex, neighbor, adjacencyMatrix);

                // Check if there is a triangle
                if (hasTriangle(vertex, neighbor, commonNeighbors, adjacencyMatrix)) {
                    // Vertex is not a weak vertex
                    return;
                }

                // Vertex is a weak vertex
                weakVertices.add(vertex);

                dfs(neighbor, adjacencyMatrix, visited, weakVertices);
            }
        }
    }

    private static boolean hasTriangle(int vertex1, int vertex2, List<Integer> commonNeighbors, int[][] adjacencyMatrix) {
        for (int commonNeighbor : commonNeighbors) {
            if (adjacencyMatrix[vertex1][commonNeighbor] == 1 && adjacencyMatrix[vertex2][commonNeighbor] == 1) {
                // Triangle found
                return true;
            }
        }
        return false;
    }


    private static List<Integer> findCommonNeighbors(int vertex1, int vertex2, int[][] adjacencyMatrix) {
        List<Integer> commonNeighbors = new ArrayList<>();

        for (int neighbor = 0; neighbor < adjacencyMatrix.length; neighbor++) {
            if (adjacencyMatrix[vertex1][neighbor] == 1 && adjacencyMatrix[vertex2][neighbor] == 1) {
                commonNeighbors.add(neighbor);
            }
        }

        return commonNeighbors;
    }
}



