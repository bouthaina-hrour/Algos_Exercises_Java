package trees.sortedArrayToBST;

import org.example.trees.TreeNode;
import org.example.trees.sortedArrayToBST.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortedArrayToBSTTest {
    @Test
    void testSortedArrayToBST() {
        // Create a sample sorted array
        int[] nums = {-10, -3, 0, 5, 9};

        Solution solution = new Solution();

        // Convert the sorted array to a height-balanced BST
        // The resulting tree should be:
        //       0
        //      / \
        //    -3   9
        //    /   /
        // -10   5
        TreeNode root = solution.sortedArrayToBST(nums);

        // Check the structure of the resulting tree
        assertEquals(0, root.val);
        assertEquals(-3, root.left.val);
        assertEquals(9, root.right.val);
        assertEquals(-10, root.left.left.val);
        assertEquals(5, root.right.left.val);
    }

    @Test
    void testSortedArrayToBSTWithEmptyArray() {
        // Test with an empty array
        Solution solution = new Solution();
        TreeNode root = solution.sortedArrayToBST(new int[]{});

        // The resulting tree should be null
        assertEquals(null, root);
    }

}
