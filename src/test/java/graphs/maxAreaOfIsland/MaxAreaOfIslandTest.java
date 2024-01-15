package graphs.maxAreaOfIsland;

import org.example.graphs.maxAreaOfIsland.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxAreaOfIslandTest {
    @Test
    void testMaxAreaOfIsland() {
        int[][] grid = new int[][]{
                {1, 1, 0, 0, 0},
                {1, 1, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 1},
                {0, 0, 0, 1, 1}
        };

        Solution solution = new Solution();
        assertEquals(6, solution.maxAreaOfIsland(grid));
    }

    @Test
    void testMaxAreaOfIslandWithNoIsland() {
        // Test with a grid without an island
        int[][] grid = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };

        Solution solution = new Solution();
        assertEquals(0, solution.maxAreaOfIsland(grid));
    }
}
