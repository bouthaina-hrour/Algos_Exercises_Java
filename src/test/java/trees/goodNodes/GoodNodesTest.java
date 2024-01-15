package trees.goodNodes;

import org.example.trees.TreeNode;
import org.example.trees.goodNodes.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoodNodesTest {
    @Test
    void testGoodNodes() {
        // Create a sample binary tree
        //      3
        //     / \
        //    1   4
        //   / \
        //  3   5
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(5);

        Solution solution = new Solution();

        // In the path from root to each node, there are no nodes with a value greater than the node itself.
        // Therefore, all nodes are good nodes. The expected result is 4.
        assertEquals(4, solution.goodNodes(root));
    }

    @Test
    void testGoodNodesWithNull() {
        // Test with a null tree
        Solution solution = new Solution();
        assertEquals(0, solution.goodNodes(null));
    }

}
