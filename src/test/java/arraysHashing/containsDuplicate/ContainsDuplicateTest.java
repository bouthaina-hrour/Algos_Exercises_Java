package arraysHashing.containsDuplicate;

import org.example.arraysHashing.containsDuplicate.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsDuplicateTest {
    @Test
    public void testContainsDuplicateWithDuplicate() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 1};
        assertTrue(solution.containsDuplicate(nums));
    }

    @Test
    public void testContainsDuplicateWithNoDuplicate() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 5};
        assertFalse(solution.containsDuplicate(nums));
    }

    @Test
    public void testContainsDuplicateWithMultipleDuplicates() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 1, 4, 2};
        assertTrue(solution.containsDuplicate(nums));
    }

    @Test
    public void testContainsDuplicateWithEmptyArray() {
        Solution solution = new Solution();
        int[] nums = {};
        assertFalse(solution.containsDuplicate(nums));
    }
}
