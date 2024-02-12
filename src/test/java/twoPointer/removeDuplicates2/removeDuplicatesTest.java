package twoPointer.removeDuplicates2;

import org.junit.jupiter.api.Test;

import static org.example.twoPointer.removeDuplicates2.Solution.removeDuplicates2;

public class removeDuplicatesTest {

    @Test
    public void testRemovingDuplicates() {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3}; // Input array
        int[] expectedNums = {0, 0, 1, 1, 2, 3, 3, 0, 0}; // The expected answer with correct length

        int k = removeDuplicates2(nums); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
