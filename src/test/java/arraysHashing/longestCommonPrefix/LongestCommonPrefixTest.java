package arraysHashing.longestCommonPrefix;

import org.example.arraysHashing.longestCommonPrefix.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonPrefixTest {
    @Test
    public void testLongestCommonPrefixWithCommonPrefix() {
        Solution solution = new Solution();
        String[] input = {"flower", "flow", "flight"};
        assertEquals("fl", solution.longestCommonPrefix(input));
    }

    @Test
    public void testLongestCommonPrefixWithNoCommonPrefix() {
        Solution solution = new Solution();
        String[] input = {"dog", "racecar", "car"};
        assertEquals("", solution.longestCommonPrefix(input));
    }

    @Test
    public void testLongestCommonPrefixWithSingleWord() {
        Solution solution = new Solution();
        String[] input = {"hello"};
        assertEquals("hello", solution.longestCommonPrefix(input));
    }

    @Test
    public void testLongestCommonPrefixWithDifferentLengths() {
        Solution solution = new Solution();
        String[] input = {"apple", "app", "april"};
        assertEquals("ap", solution.longestCommonPrefix(input));
    }
}
