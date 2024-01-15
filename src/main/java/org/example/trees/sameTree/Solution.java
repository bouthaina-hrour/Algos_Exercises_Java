package org.example.trees.sameTree;

import org.example.trees.TreeNode;

/**
 * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
 * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
 */
public class Solution {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if ((p == null && q != null) || (p != null && q == null) || (p.val != q.val)) return false;
        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }
}
