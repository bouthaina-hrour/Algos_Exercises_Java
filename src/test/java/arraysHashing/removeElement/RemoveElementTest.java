package arraysHashing.removeElement;

import org.example.arraysHashing.removeElement.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveElementTest {
    @Test
    public void testRemoveElementWithMultipleOccurrences() {
        Solution solution = new Solution();
        int[] nums = {3, 2, 2, 3, 4, 5, 2};
        int val = 2;
        int result = solution.removeElement(nums, val);
        assertEquals(4, result);
        assertArrayEquals(new int[]{3, 3, 4, 5, 2, 2, 2}, nums);
    }

    @Test
    public void testRemoveElementWithNoOccurrences() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 5};
        int val = 6;
        int result = solution.removeElement(nums, val);
        assertEquals(5, result);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, nums);
    }

    @Test
    public void testRemoveElementWithAllOccurrences() {
        Solution solution = new Solution();
        int[] nums = {2, 2, 2, 2, 2};
        int val = 2;
        int result = solution.removeElement(nums, val);
        assertEquals(0, result);
        assertArrayEquals(new int[]{2, 2, 2, 2, 2}, nums);
    }

    @Test
    public void testRemoveElementWithEmptyArray() {
        Solution solution = new Solution();
        int[] nums = {};
        int val = 5;
        int result = solution.removeElement(nums, val);
        assertEquals(0, result);
        assertArrayEquals(new int[]{}, nums);
    }
}
