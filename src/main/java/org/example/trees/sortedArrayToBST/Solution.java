package org.example.trees.sortedArrayToBST;

import org.example.trees.TreeNode;

import java.util.Arrays;

/**
 * Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        int middle = nums.length / 2;
        TreeNode root = new TreeNode(nums[middle]);
        if (nums.length == 3) {
            root.left = new TreeNode(nums[0]);
            root.right = new TreeNode(nums[2]);
        } else if (nums.length == 2) {
            root.left = new TreeNode(nums[0]);
            root.right = null;
        } else if (nums.length == 1) {
            root.left = null;
            root.right = null;
        } else {
            root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, middle));
            root.right = sortedArrayToBST(Arrays.copyOfRange(nums, middle + 1, nums.length));
        }
        return root;

    }
}
