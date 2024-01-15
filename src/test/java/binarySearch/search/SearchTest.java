package binarySearch.search;

import org.example.binarySearch.search.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchTest {
    @Test
    public void testSearchWithValidTarget() {
        Solution solution = new Solution();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        assertEquals(4, solution.search(nums, 9));
        assertEquals(5, solution.search(nums, 12));
    }

    @Test
    public void testSearchWithInvalidTarget() {
        Solution solution = new Solution();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        assertEquals(-1, solution.search(nums, 2));
        assertEquals(-1, solution.search(nums, 10));
    }

    @Test
    public void testSearchWithEmptyArray() {
        Solution solution = new Solution();
        int[] nums = {};
        assertEquals(-1, solution.search(nums, 5));
    }

    @Test
    public void testSearchWithSingleElementArray() {
        Solution solution = new Solution();
        int[] nums = {7};
        assertEquals(0, solution.search(nums, 7));
    }

    @Test
    public void testSearchWithDuplicateElements() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 2, 3, 4, 5};
        assertEquals(2, solution.search(nums, 2));
    }
}
