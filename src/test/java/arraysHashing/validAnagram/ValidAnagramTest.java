package arraysHashing.validAnagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidAnagramTest {
    @Test
    public void testIsAnagramWithAnagrams() {
        Solution solution = new Solution();
        assertTrue(solution.isAnagram("listen", "silent"));
    }

    @Test
    public void testIsAnagramWithNonAnagrams() {
        Solution solution = new Solution();
        assertFalse(solution.isAnagram("hello", "world"));
    }

    @Test
    public void testIsAnagramWithEmptyStrings() {
        Solution solution = new Solution();
        assertTrue(solution.isAnagram("", ""));
    }

    @Test
    public void testIsAnagramWithDifferentLengths() {
        Solution solution = new Solution();
        assertFalse(solution.isAnagram("abc", "abcd"));
    }

    @Test
    public void testIsAnagramWithSameString() {
        Solution solution = new Solution();
        assertTrue(solution.isAnagram("abc", "abc"));
    }
}
