package trees.ancestorOfBST;

import org.example.trees.TreeNode;
import org.example.trees.ancestorOfBST.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AncestorOfBSTTest {


    @Test
    void testLowestCommonAncestorBFS() {
        // Create a sample BST
        //      6
        //     / \
        //    2   8
        //   / \ / \
        //  0  4 7  9
        //    / \
        //   3   5
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        Solution solution = new Solution();

        // Test case: p = 2, q = 8
        TreeNode resultBFS = solution.lowestCommonAncestorBFS(root, root.left, root.right);
        TreeNode resultDFS = solution.lowestCommonAncestorDFS(root, root.left, root.right);
        assertEquals(6, resultBFS.val);
        assertEquals(resultBFS.val, resultDFS.val);
    }

    @Test
    void testLowestCommonAncestorDFS() {
        // Create a sample BST
        //      6
        //     / \
        //    2   8
        //   / \ / \
        //  0  4 7  9
        //    / \
        //   3   5
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        Solution solution = new Solution();

        // Test case: p = 2, q = 8
        TreeNode resultDFS = solution.lowestCommonAncestorDFS(root, root.left, root.right);
        assertEquals(6, resultDFS.val);


    }
}


