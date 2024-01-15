package dynamicProgramming.longestIncreasingSubsequence;

import org.example.dynamicProgramming.longestIncreasingSubsequence.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestIncreasingSubseqTest {
    @Test
    public void testLengthOfLISWithValidArray() {
        Solution solution = new Solution();
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        assertEquals(4, solution.lengthOfLIS(nums));
    }

    @Test
    public void testLengthOfLISWithSingleElementArray() {
        Solution solution = new Solution();
        int[] nums = {6};
        assertEquals(1, solution.lengthOfLIS(nums));
    }

    @Test
    public void testLengthOfLISWithEqualElements() {
        Solution solution = new Solution();
        int[] nums = {1, 1, 1, 1, 1};
        assertEquals(1, solution.lengthOfLIS(nums));
    }

    @Test
    public void testLengthOfLISWithDecreasingArray() {
        Solution solution = new Solution();
        int[] nums = {5, 4, 3, 2, 1};
        assertEquals(1, solution.lengthOfLIS(nums));
    }
}
