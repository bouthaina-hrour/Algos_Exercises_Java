package arraysHashing.twoSumII;

import org.example.arraysHashing.twoSumII.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSum2Test {
    @Test
    public void testSumOfTwoWithIndexWithValidInput() {
        int[] nums = {2, 7, 11, 15};
        int k = 9;
        int[] expected = {1, 0};
        assertArrayEquals(expected, Solution.sumOfTwoWithIndex(nums, k));
    }

    @Test
    public void testSumOfTwoWithIndexWithDifferentIndices() {
        int[] nums = {3, 2, 4};
        int k = 6;
        int[] expected = {2, 1};
        assertArrayEquals(expected, Solution.sumOfTwoWithIndex(nums, k));
    }

    @Test
    public void testSumOfTwoWithIndexWithNegativeNumbers() {
        int[] nums = {-1, -2, -3, -4, -5};
        int k = -8;
        int[] expected = {4, 2};
        assertArrayEquals(expected, Solution.sumOfTwoWithIndex(nums, k));
    }

    @Test
    public void testSumOfTwoWithIndexWithZeroTarget() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 0;
        int[] expected = {};
        assertArrayEquals(expected, Solution.sumOfTwoWithIndex(nums, k));
    }
}
