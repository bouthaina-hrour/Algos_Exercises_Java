package trees.levelOrder;

import org.example.trees.TreeNode;
import org.example.trees.levelOrder.Solution;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LevelOrderTest {
    @Test
    void testLevelOrder() {
        // Create a sample binary tree
        //      3
        //     / \
        //    9  20
        //      /  \
        //     15   7


        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Solution solution = new Solution();

        // The level order traversal of the binary tree is:
        // [
        //   [3],
        //   [9, 20],
        //   [15, 7]
        // ]
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(3),
                Arrays.asList(9, 20),
                Arrays.asList(15, 7)
        );

        assertEquals(expected, solution.levelOrder(root));
    }

    @Test
    void testLevelOrderWithNull() {
        // Test with a null tree
        Solution solution = new Solution();
        assertEquals(Arrays.asList(), solution.levelOrder(null));
    }
}
