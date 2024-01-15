package org.example.trees.balancedBinaryTree;

import org.example.trees.TreeNode;

import static org.example.trees.maxDepthOfBinaryTree.Solution.getMaxDepth;

/**
 * Given a binary tree, determine if it is height-balanced.
 * A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        if (Math.abs(getMaxDepth(root.right) - getMaxDepth(root.left)) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
}
