package arraysHashing.twoSum;

import org.example.arraysHashing.twoSum.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {
    @Test
    public void testTwoSumWithValidInput() {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

    @Test
    public void testTwoSumWithDifferentIndices() {
        Solution solution = new Solution();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

    @Test
    public void testTwoSumWithNegativeNumbers() {
        Solution solution = new Solution();
        int[] nums = {-1, -2, -3, -4, -5};
        int target = -8;
        int[] expected = {2, 4};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

    @Test
    public void testTwoSumWithZeroTarget() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 5};
        int target = 0;
        int[] expected = {};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }
}
