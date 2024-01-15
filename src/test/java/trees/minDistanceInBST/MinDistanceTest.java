package trees.minDistanceInBST;

import org.example.trees.TreeNode;
import org.example.trees.minDistanceInBST.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinDistanceTest {
    @Test
    void testMinDiffInBST() {
        // Create a sample binary search tree
        //      4
        //     / \
        //    2   6
        //   / \
        //  1   3
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        Solution solution = new Solution();

        // The minimum difference between any two different nodes in the tree is 1 (between node 3 and 4)
        assertEquals(1, solution.minDiffInBST(root));
    }

    @Test
    void testMinDiffInBSTWithNull() {
        // Test with a null tree
        Solution solution = new Solution();
        assertEquals(0, solution.minDiffInBST(null));
    }
}
