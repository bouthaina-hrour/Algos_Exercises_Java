package org.example.trees.diameterOfBinaryTree;

import org.example.trees.TreeNode;

import static org.example.trees.maxDepthOfBinaryTree.Solution.getMaxDepth;

/**
 * Given the root of a binary tree, return the length of the diameter of the tree.
 * The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
 * The length of a path between two nodes is represented by the number of edges between them.
 */
public class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;

        // the diameter may or not pass through th root
        // it will be the max of
        // * diameter of left subtree * diameter of right subtree * sum of depth of right subtree and depth of right subtree

        int ldiameter = diameterOfBinaryTree(root.left);
        int rdiameter = diameterOfBinaryTree(root.right);

        int ldepth = getMaxDepth(root.left);
        int rdepth = getMaxDepth(root.right);


        return Math.max(ldepth + rdepth, Math.max(ldiameter, rdiameter));

    }

}
