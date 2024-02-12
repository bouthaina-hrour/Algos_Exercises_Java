package org.example.twoPointer.moveZeroes;

public class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length == 1) return;

        int i = 0;
        int j = 1;

        while (j < nums.length && i<nums.length) {
            if (nums[i] != 0) {
                i++;
                j++;
            } else if (nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            } else j++;
        }
    }
}
