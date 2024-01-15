package dynamicProgramming.minCostClimbingStairs;

import org.junit.jupiter.api.Test;

import static org.example.dynamicProgramming.climbingStairs.Solution.climbingStairs;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinCostClimbingStairsTest {
    @Test
    public void testClimbingStairsWithSmallValues() {
        assertEquals(1, climbingStairs(1));
        assertEquals(2, climbingStairs(2));
        assertEquals(3,climbingStairs(3));
        assertEquals(5, climbingStairs(4));
    }

    @Test
    public void testClimbingStairsWithZero() {
        assertEquals(1, climbingStairs(0));
    }

    @Test
    public void testClimbingStairsWithLargeValues() {
        assertEquals(1836311903, climbingStairs(45));
    }
}
