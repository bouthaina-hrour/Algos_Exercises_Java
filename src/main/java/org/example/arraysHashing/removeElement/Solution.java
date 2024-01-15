package org.example.arraysHashing.removeElement;

/**
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
 * <p>
 * Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
 * <p>
 * Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = i;
        while (i < nums.length && j < nums.length) {
            if (nums[i] != val) {
                i++;
                j++;
                continue;
            }

            if (nums[i] == val && nums[j] != val) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;

            }
            j++;
        }
        return i;

    }
}
