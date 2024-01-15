package dynamicProgramming.houseRobber;

import org.example.dynamicProgramming.houseRobber.Solution;
import org.junit.jupiter.api.Test;

import static org.example.dynamicProgramming.houseRobber.Solution.rob;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HouseRobberTest {
    @Test
    public void testRobWithValidHouses() {
        int[] nums = {2, 7, 9, 3, 1};
        assertEquals(12, rob(nums));

        int[] nums2 = {1, 2, 3, 1};
        assertEquals(4, rob(nums2));
    }

    @Test
    public void testRobWithSingleHouse() {
        int[] nums = {6};
        assertEquals(6, rob(nums));
    }

    @Test
    public void testRobWithLargeArray() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(30, rob(nums));
    }
}
