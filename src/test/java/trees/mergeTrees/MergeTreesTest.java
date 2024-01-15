package trees.mergeTrees;

import org.example.trees.TreeNode;
import org.example.trees.mergeTrees.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MergeTreesTest {
    @Test
    void testMergeTrees() {
        // Create two sample binary trees
        // Tree 1:      1
        //             / \
        //            3   2
        //           /
        //          5
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(5);

        // Tree 2:      2
        //             / \
        //            1   3
        //             \   \
        //              4   7
        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        root2.right.right = new TreeNode(7);

        Solution solution = new Solution();

        // The merged tree should be:
        // Merged:      3
        //             / \
        //            4   5
        //           / \   \
        //          5   4   7
        TreeNode expectedMerged = new TreeNode(3);
        expectedMerged.left = new TreeNode(4);
        expectedMerged.right = new TreeNode(5);
        expectedMerged.left.left = new TreeNode(5);
        expectedMerged.left.right = new TreeNode(4);
        expectedMerged.right.right = new TreeNode(7);

        assertEquals(expectedMerged.val, solution.mergeTrees(root1, root2).val);
        assertEquals(expectedMerged.left.val, solution.mergeTrees(root1, root2).left.val);
        assertEquals(expectedMerged.right.val, solution.mergeTrees(root1, root2).right.val);
        assertEquals(expectedMerged.left.left.val, solution.mergeTrees(root1, root2).left.left.val);
        assertEquals(expectedMerged.left.right.val, solution.mergeTrees(root1, root2).left.right.val);
        assertEquals(expectedMerged.right.right.val, solution.mergeTrees(root1, root2).right.right.val);
    }

    @Test
    void testMergeTreesWithNull() {
        // Test with one tree being null
        Solution solution = new Solution();

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(2);

        TreeNode merged = solution.mergeTrees(root1, null);

        // The merged tree should be the same as the non-null tree
        assertEquals(root1.val, merged.val);
        assertEquals(root1.left.val, merged.left.val);
        assertEquals(root1.right.val, merged.right.val);

        // Test with both trees being null
        assertNull(solution.mergeTrees(null, null));
    }
}
