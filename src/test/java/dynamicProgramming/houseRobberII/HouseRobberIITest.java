package dynamicProgramming.houseRobberII;

import org.example.dynamicProgramming.houseRobberII.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HouseRobberIITest {
    @Test
    public void testRob2WithValidHouses() {
        Solution solution = new Solution();
        int[] nums = {2, 7, 9, 3, 1};
        assertEquals(11, solution.rob2(nums));

        int[] nums2 = {1, 2, 3, 1};
        assertEquals(4, solution.rob2(nums2));
    }

    @Test
    public void testRob2WithSingleHouse() {
        Solution solution = new Solution();
        int[] nums = {6};
        assertEquals(6, solution.rob2(nums));
    }

    @Test
    public void testRob2WithLargeArray() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(30, solution.rob2(nums));
    }

    @Test
    public void testRob2WithCircularArray() {
        Solution solution = new Solution();
        int[] nums = {2, 3, 2};
        assertEquals(3, solution.rob2(nums));
    }
}
