package org.example.trees.minDistanceInBST;

import org.example.trees.TreeNode;

/**
 * Given the root of a Binary Search Tree (BST),
 * return the minimum difference between the values of any two different nodes in the tree.
 */
public class Solution {
    TreeNode prev = null;
    int min = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        return BSTInorder(root);
    }

    public int BSTInorder(TreeNode root) {

        if (root == null) return 0;

        BSTInorder(root.left);
        if (prev != null) {
            min = Math.min(min, root.val - prev.val);
        }
        prev = root;
        BSTInorder(root.right);
        return min;
    }
}
