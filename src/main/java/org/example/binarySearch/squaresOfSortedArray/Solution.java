package org.example.binarySearch.squaresOfSortedArray;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 */
public class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int[] result = new int[nums.length];
        int i = nums.length - 1;
        while (l <= r) {
            if (Math.pow(nums[r], 2) > Math.pow(nums[l], 2)) {
                result[i] = (int) Math.pow(nums[r], 2);
                r--;
            } else {
                result[i] = (int) Math.pow(nums[l], 2);
                l++;
            }
            i--;
        }
        return result;
    }
}
