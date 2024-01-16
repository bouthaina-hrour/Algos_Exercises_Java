package org.example.binarySearch.findElement;

public class Solution {

    public static int findElement(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int firstOccurenceIndex = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                firstOccurenceIndex = mid;
                right = mid - 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return firstOccurenceIndex;
    }
}
