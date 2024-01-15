package binarySearch.squaresOfSortedArray;

import org.example.binarySearch.squaresOfSortedArray.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SquaresOfSortedArrayTest {
    @Test
    public void testSortedSquaresWithPositiveNumbers() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 5};
        int[] expected = {1, 4, 9, 16, 25};
        assertArrayEquals(expected, solution.sortedSquares(nums));
    }

    @Test
    public void testSortedSquaresWithNegativeNumbers() {
        Solution solution = new Solution();
        int[] nums = {-5, -4, -3, -2, -1};
        int[] expected = {1, 4, 9, 16, 25};
        assertArrayEquals(expected, solution.sortedSquares(nums));
    }

    @Test
    public void testSortedSquaresWithMixedNumbers() {
        Solution solution = new Solution();
        int[] nums = {-3, -2, -1, 0, 1, 2, 3};
        int[] expected = {0, 1, 1, 4, 4, 9, 9};
        assertArrayEquals(expected, solution.sortedSquares(nums));
    }

    @Test
    public void testSortedSquaresWithEmptyArray() {
        Solution solution = new Solution();
        int[] nums = {};
        int[] expected = {};
        assertArrayEquals(expected, solution.sortedSquares(nums));
    }

    @Test
    public void testSortedSquaresWithSingleElementArray() {
        Solution solution = new Solution();
        int[] nums = {7};
        int[] expected = {49};
        assertArrayEquals(expected, solution.sortedSquares(nums));
    }
}
