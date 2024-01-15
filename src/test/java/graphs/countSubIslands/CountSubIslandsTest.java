package graphs.countSubIslands;

import org.junit.jupiter.api.Test;

import static org.example.graphs.countSubIslands.Solution.countSubIslands;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountSubIslandsTest {
    @Test
    void testCountSubIslands() {
        int[][] grid1 = new int[][]{
                {1, 1, 1, 0, 0},
                {0, 1, 1, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 1, 1}
        };
        int[][] grid2 = new int[][]{
                {1, 1, 1, 0, 0},
                {0, 0, 1, 1, 1},
                {0, 1, 0, 0, 0},
                {1, 0, 1, 1, 0},
                {0, 1, 0, 1, 0}
        };

        assertEquals(3, countSubIslands(grid1, grid2));
    }
}
