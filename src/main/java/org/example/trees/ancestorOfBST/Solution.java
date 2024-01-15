package org.example.trees.ancestorOfBST;

import org.example.trees.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
 */
public class Solution {
    public boolean isDescendant(TreeNode node, TreeNode p) {
        if (node == null) return false;
        if (p == node || p == node.left || p == node.right) return true;
        return isDescendant(node.left, p) || isDescendant(node.right, p);
    }

    public TreeNode lowestCommonAncestorBFS(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode lowestCommonAncestor = null;
        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);


        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (isDescendant(node, p) && isDescendant(node, q)) lowestCommonAncestor = node;
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        return lowestCommonAncestor;
    }

    public TreeNode lowestCommonAncestorDFS(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q) return root;
        if ((p.val > root.val && q.val < root.val) || (p.val < root.val && q.val > root.val)) return root;
        if (p.val > root.val) {
            return lowestCommonAncestorDFS(root.right, p, q);
        }
        return lowestCommonAncestorDFS(root.left, p, q);
    }

}
