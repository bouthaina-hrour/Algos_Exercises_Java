package arraysHashing.concatenation;


import org.example.arraysHashing.concatenation.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ConcatenationTest {
    @Test
    public void testGetConcatenationWithPositiveNumbers() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3};
        int[] expected = {1, 2, 3, 1, 2, 3};
        assertArrayEquals(expected, solution.getConcatenation(nums));
    }

    @Test
    public void testGetConcatenationWithDifferentPositiveNumbers() {
        Solution solution = new Solution();
        int[] nums = {4, 5, 6};
        int[] expected = {4, 5, 6, 4, 5, 6};
        assertArrayEquals(expected, solution.getConcatenation(nums));
    }

    @Test
    public void testGetConcatenationWithLargePositiveNumbers() {
        Solution solution = new Solution();
        int[] nums = {100, 200, 300};
        int[] expected = {100, 200, 300, 100, 200, 300};
        assertArrayEquals(expected, solution.getConcatenation(nums));
    }

    @Test
    public void testGetConcatenationWithEmptyArray() {
        Solution solution = new Solution();
        int[] nums = {};
        int[] expected = {};
        assertArrayEquals(expected, solution.getConcatenation(nums));
    }
}
