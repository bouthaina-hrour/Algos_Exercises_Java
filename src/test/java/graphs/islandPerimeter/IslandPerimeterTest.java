package graphs.islandPerimeter;

import org.junit.jupiter.api.Test;

import static org.example.graphs.islandPerimeter.Solution.islandPerimeter;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IslandPerimeterTest {
    @Test
    void testIslandPerimeter() {
        int[][] grid = new int[][]{
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };

        assertEquals(16, islandPerimeter(grid));
    }


    @Test
    void testIslandPerimeterWithNoIsland() {
        // Test with a grid without an island
        int[][] grid = new int[][]{
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        assertEquals(0, islandPerimeter(grid));
    }
}
