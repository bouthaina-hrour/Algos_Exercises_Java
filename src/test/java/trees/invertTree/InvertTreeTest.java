package trees.invertTree;

import org.example.trees.InvertTree.Solution;
import org.example.trees.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class InvertTreeTest {


    @Test
    void testInvertTree() {
        Solution solution = new Solution();

        // Create a sample tree
        // Original:
        //     1
        //    / \
        //   2   3
        // Inverted:
        //     1
        //    / \
        //   3   2
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        TreeNode invertedRoot = solution.invertTree(root);

        // Verify the inverted tree
        assertEquals(1, invertedRoot.val);
        assertEquals(3, invertedRoot.left.val);
        assertEquals(2, invertedRoot.right.val);
    }

    @Test
    void testInvertTreeUsingBFS() {
        Solution solution = new Solution();

        // Create a sample tree
        // Original:
        //     1
        //    / \
        //   2   3
        // Inverted:
        //     1
        //    / \
        //   3   2
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        TreeNode invertedRoot = solution.invertTreeUsingBFS(root);

        // Verify the inverted tree
        assertEquals(1, invertedRoot.val);
        assertEquals(3, invertedRoot.left.val);
        assertEquals(2, invertedRoot.right.val);
    }

    @Test
    void testInvertTreeWithNull() {
        Solution solution = new Solution();

        // Test with a null tree
        assertNull(solution.invertTree(null));
    }

    @Test
    void testInvertTreeUsingBFSWithNull() {
        Solution solution = new Solution();

        // Test with a null tree
        assertNull(solution.invertTreeUsingBFS(null));
    }
}


