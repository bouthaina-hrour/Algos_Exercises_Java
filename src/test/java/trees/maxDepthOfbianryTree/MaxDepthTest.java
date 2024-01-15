package trees.maxDepthOfbianryTree;

import org.example.trees.TreeNode;
import org.example.trees.maxDepthOfBinaryTree.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxDepthTest {
    @Test
    void testGetMaxDepth() {
        // Create a sample tree
        //      1
        //     / \
        //    2   3
        //   / \
        //  4   5
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Expected maximum depth is 3 (from root to leaf node 4 or 5)
        int result = Solution.getMaxDepth(root);
        assertEquals(3, result);
    }

    @Test
    void testGetMaxDepthWithNull() {
        // Test with a null tree
        int result = Solution.getMaxDepth(null);
        assertEquals(0, result);
    }

    @Test
    void testGetMaxDepthWithSingleNode() {
        // Test with a tree containing only one node
        TreeNode root = new TreeNode(1);
        int result = Solution.getMaxDepth(root);
        assertEquals(1, result);
    }

}

