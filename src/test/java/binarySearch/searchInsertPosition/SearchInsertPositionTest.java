package binarySearch.searchInsertPosition;

import org.example.binarySearch.searchInsertPosition.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInsertPositionTest {
    @Test
    public void testSearchInsertWithValidTarget() {
        Solution solution = new Solution();
        int[] nums = {1, 3, 5, 6};
        assertEquals(2, solution.searchInsert(nums, 5));
        assertEquals(1, solution.searchInsert(nums, 2));
        assertEquals(4, solution.searchInsert(nums, 7));
    }

    @Test
    public void testSearchInsertWithInvalidTarget() {
        Solution solution = new Solution();
        int[] nums = {1, 3, 5, 6};
        assertEquals(0, solution.searchInsert(nums, 0));
        assertEquals(0, solution.searchInsert(nums, 1));
        assertEquals(4, solution.searchInsert(nums, 8));
    }

    @Test
    public void testSearchInsertWithEmptyArray() {
        Solution solution = new Solution();
        int[] nums = {};
        assertEquals(0, solution.searchInsert(nums, 5));
    }

    @Test
    public void testSearchInsertWithSingleElementArray() {
        Solution solution = new Solution();
        int[] nums = {7};
        assertEquals(0, solution.searchInsert(nums, 5));
        assertEquals(1, solution.searchInsert(nums, 8));
    }

    @Test
    public void testSearchInsertWithDuplicateElements() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 2, 3, 4, 5};
        assertEquals(2, solution.searchInsert(nums, 2));
        assertEquals(4, solution.searchInsert(nums, 4));
    }
}
