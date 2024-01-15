package trees.subTree;

import org.example.trees.TreeNode;
import org.example.trees.subTree.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SubTreeTest {
    @Test
    void testIsSubtree() {
        // Create a sample binary tree
        //      3
        //     / \
        //    4   5
        //   / \
        //  1   2
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);

        // Create a sample subtree
        //    4
        //   / \
        //  1   2
        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);

        Solution solution = new Solution();

        // The subtree exists in the binary tree, so the result should be true
        assertTrue(solution.isSubtree(root, subRoot));
    }

    @Test
    void testIsNotSubtree() {
        // Create a sample binary tree
        //      3
        //     / \
        //    4   5
        //   / \
        //  1   2
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);

        // Create a different subtree
        //    4
        //   / \
        //  1   3
        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(3);

        Solution solution = new Solution();

        // The subtree does not exist in the binary tree, so the result should be false
        assertFalse(solution.isSubtree(root, subRoot));
    }

    @Test
    void testIsSubtreeWithNull() {
        // Test with one tree being null
        Solution solution = new Solution();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);

        // The result should be false when one tree is null
        assertFalse(solution.isSubtree(root, null));
        assertFalse(solution.isSubtree(null, root));

        // Test with both trees being null

    }
}
