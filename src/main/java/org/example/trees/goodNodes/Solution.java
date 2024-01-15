package org.example.trees.goodNodes;

import org.example.trees.TreeNode;

/**
 * Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.
 * Return the number of good nodes in the binary tree.
 */
public class Solution {
    public int goodNodes(TreeNode root) {
        if (root == null) return 0;
        return dfs(root, root.val);

    }

    int dfs(TreeNode node, int max) {
        if (node == null) return 0;
        int result = node.val < max ? 0 : 1;
        max = Math.max(max, node.val);
        return result + dfs(node.right, max) + dfs(node.left, max);

    }
}
