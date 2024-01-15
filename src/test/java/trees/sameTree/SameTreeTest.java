package trees.sameTree;

import org.example.trees.TreeNode;
import org.example.trees.sameTree.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SameTreeTest {
    @Test
    void testIsSameTree() {
        // Create two identical binary trees
        // Tree 1:      1
        //              / \
        //             2   3
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        // Tree 2:      1
        //              / \
        //             2   3
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        Solution solution = new Solution();

        // Both trees are identical, so the result should be true
        assertTrue(solution.isSameTree(p, q));
    }

    @Test
    void testIsNotSameTree() {
        // Create two different binary trees
        // Tree 1:      1
        //              / \
        //             2   3
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        // Tree 2:      1
        //              / \
        //             2   4
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(4);

        Solution solution = new Solution();

        // The trees are different, so the result should be false
        assertFalse(solution.isSameTree(p, q));
    }

    @Test
    void testIsSameTreeWithNull() {
        // Test with one tree being null
        Solution solution = new Solution();

        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        // The result should be false when one tree is null
        assertFalse(solution.isSameTree(p, null));
        assertFalse(solution.isSameTree(null, p));

        // Test with both trees being null
        assertTrue(solution.isSameTree(null, null));
    }
}
