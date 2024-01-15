package trees.balancedBinaryTree;

import org.example.trees.TreeNode;
import org.example.trees.balancedBinaryTree.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsBalancedTest {


    @Test
    void isBalancedMustReturnFalseForbalancedTree() {
        // Create a sample balanced tree
        //      1
        //     / \
        //    2   3
        //   / \
        //  4   5
        TreeNode balancedRoot = new TreeNode(1);
        balancedRoot.left = new TreeNode(2);
        balancedRoot.right = new TreeNode(3);
        balancedRoot.left.left = new TreeNode(4);
        balancedRoot.left.right = new TreeNode(5);

        Solution solution = new Solution();

        // Test case: a balanced tree
        assertTrue(solution.isBalanced(balancedRoot));

        // Create a sample unbalanced tree
        //      1
        //     /
        //    2
        //   /
        //  3
        TreeNode unbalancedRoot = new TreeNode(1);
        unbalancedRoot.left = new TreeNode(2);
        unbalancedRoot.left.left = new TreeNode(3);

        // Test case: an unbalanced tree
        assertFalse(solution.isBalanced(unbalancedRoot));

        // Test case: an empty tree
        assertTrue(solution.isBalanced(null));
    }
    @Test
    void isBalancedMustReturnFalseForUnbalancedTree() {
        Solution solution = new Solution();
        // Create a sample unbalanced tree
        //      1
        //     /
        //    2
        //   /
        //  3
        TreeNode unbalancedRoot = new TreeNode(1);
        unbalancedRoot.left = new TreeNode(2);
        unbalancedRoot.left.left = new TreeNode(3);

        // Test case: an unbalanced tree
        assertFalse(solution.isBalanced(unbalancedRoot));
    }

    @Test
    void isBalancedMustReturnTrueForEmptyTree() {
        // Test case: an empty tree
        Solution solution = new Solution();
        assertTrue(solution.isBalanced(null));
    }




}


