package graphs.numOfIslands;


import org.junit.jupiter.api.Test;

import static org.example.graphs.numOfIslands.Solution.numIslands;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumOfIslandsTest {
    @Test
    void testNumIslands() {
        char[][] grid1 = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        assertEquals(1, numIslands(grid1));

        char[][] grid2 = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        assertEquals(3, numIslands(grid2));

        char[][] grid3 = new char[][]{
                {'1', '1', '1'},
                {'0', '1', '0'},
                {'1', '1', '1'}
        };
        assertEquals(1, numIslands(grid3));
    }

    @Test
    void testNumIslandsWithNoIsland() {
        // Test with a grid without an island
        char[][] grid = new char[][]{
                {'0', '0', '0'},
                {'0', '0', '0'},
                {'0', '0', '0'}
        };
        assertEquals(0, numIslands(grid));
    }

}
