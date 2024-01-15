package trees.pathSum;

import org.example.trees.TreeNode;
import org.example.trees.pathSum.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PathSumTest {
    @Test
    void testHasPathSum() {
        // Create a sample binary tree
        //      5
        //     / \
        //    4   8
        //   /   / \
        //  11  13  4
        // /  \      \
        //7    2      1
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        Solution solution = new Solution();

        // The tree has a path from root to leaf 5->8->4->1, and the sum is 18
        assertTrue(solution.hasPathSum(root, 18));

        // The tree does not have a path with a sum of 22
        assertFalse(solution.hasPathSum(root, 22));
    }

    @Test
    void testHasPathSumWithNull() {
        // Test with a null tree
        Solution solution = new Solution();
        assertFalse(solution.hasPathSum(null, 5));
    }

}
