package arraysHashing.replaceElements;

import org.example.arraysHashing.replaceElements.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReplaceElementsTest {
    @Test
    public void testReplaceElementsWithNormalArray() {
        Solution solution = new Solution();
        int[] arr = {17, 18, 5, 4, 6, 1};
        int[] expected = {18, 6, 6, 6, 1, -1};
        assertArrayEquals(expected, solution.replaceElements(arr));
    }

    @Test
    public void testReplaceElementsWithDescendingArray() {
        Solution solution = new Solution();
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {4, 3, 2, 1, -1};
        assertArrayEquals(expected, solution.replaceElements(arr));
    }

    @Test
    public void testReplaceElementsWithSingleElementArray() {
        Solution solution = new Solution();
        int[] arr = {9};
        int[] expected = {-1};
        assertArrayEquals(expected, solution.replaceElements(arr));
    }

    @Test
    public void testReplaceElementsWithEmptyArray() {
        Solution solution = new Solution();
        int[] arr = {};
        int[] expected = {};
        assertArrayEquals(expected, solution.replaceElements(arr));
    }
}
