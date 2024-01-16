package org.example.binarySearch.findFirstLarger;



/**
 * EXO 2 - First Element Not Smaller Than Target
 * Given an array of integers sorted in increasing order and a target, find the index of the first element in the array that is larger than or equal to the target.
 * Assume that it is guaranteed to find a satisfying number.
 */
public class Solution {

    public static int findFirstLargerThanTarget(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        int firstLargerThanTargetIndex = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= target) {
                firstLargerThanTargetIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return firstLargerThanTargetIndex;
    }
}
