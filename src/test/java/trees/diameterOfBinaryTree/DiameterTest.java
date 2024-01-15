package trees.diameterOfBinaryTree;

import org.example.trees.TreeNode;
import org.example.trees.diameterOfBinaryTree.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiameterTest {
    @Test
    void testDiameterOfBalancedBinaryTree() {
        // Create a sample balanced binary tree
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

        Solution solution = new Solution();

        // The diameter of the binary tree is the length of the longest path, which is from node 4 to node 3
        assertEquals(3, solution.diameterOfBinaryTree(root));
    }

    @Test
    void testDiameterOfSingleNodeTree() {
        // Create a sample binary tree with only one node
        TreeNode singleNodeTree = new TreeNode(1);

        Solution solution = new Solution();

        // The diameter of a tree with a single node is 0
        assertEquals(0, solution.diameterOfBinaryTree(singleNodeTree));
    }

    @Test
    void testDiameterOfUnbalancedBinaryTree() {
        // Create a sample binary tree with one unbalanced branch
        //      1
        //       \
        //        2
        //         \
        //          3
        TreeNode unbalancedTree = new TreeNode(1);
        unbalancedTree.right = new TreeNode(2);
        unbalancedTree.right.right = new TreeNode(3);

        Solution solution = new Solution();

        // The diameter of this tree is the length of the unbalanced branch, which is 2
        assertEquals(2, solution.diameterOfBinaryTree(unbalancedTree));
    }

}
