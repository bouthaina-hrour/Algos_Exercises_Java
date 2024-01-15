package trees.rightSideView;

import org.example.trees.TreeNode;
import org.example.trees.rightSideView.Solution;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RightSideViewTest {
    @Test
    void testRightSideView() {
        // Create a sample binary tree
        //      1
        //     / \
        //    2   3
        //     \   \
        //      5   4
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        Solution solution = new Solution();

        // The right side view of the binary tree is [1, 3, 4]
        List<Integer> expected = List.of(1, 3, 4);

        assertEquals(expected, solution.rightSideView(root));
    }

    @Test
    void testRightSideViewWithNull() {
        // Test with a null tree
        Solution solution = new Solution();
        assertEquals(List.of(), solution.rightSideView(null));
    }
}
