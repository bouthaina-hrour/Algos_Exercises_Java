package dynamicProgramming.longestPalindromicSubstring;

import org.example.dynamicProgramming.longestPalindromicSubstring.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromicSubstringTest {
    @Test
    public void testLongestPalindromeWithValidString() {
        Solution solution = new Solution();
        assertEquals("bab", solution.longestPalindrome("babad"));
        assertEquals("bb", solution.longestPalindrome("cbbd"));
    }

    @Test
    public void testLongestPalindromeWithSingleCharacterString() {
        Solution solution = new Solution();
        assertEquals("a", solution.longestPalindrome("a"));
    }
    @Test
    public void testLongestPalindromeWithEqualCharacters() {
        Solution solution = new Solution();
        assertEquals("aaaaa", solution.longestPalindrome("aaaaa"));
    }

    @Test
    public void testLongestPalindromeWithNoPalindrome() {
        Solution solution = new Solution();
        assertEquals("a", solution.longestPalindrome("abc"));
    }
}
