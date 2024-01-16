package org.example.binarySearch.findPeak;

/**
 * EXO 6 - The Peak of a Mountain Array
 * A mountain array is defined as an array that
 * has at least 3 elements
 * has an element with the largest value called "peak", with index k. The array elements strictly increase from the first element to A[k], and then strictly decreases from A[k + 1] to the last element of the array. Thus creating a "mountain" of numbers.
 * That is, given A[0]<...<A[k-1]<A[k]>A[k+1]>...>A[n-1], we need to find the index k. Note that the peak element is neither the first nor the last element of the array.
 * Find the index of the peak element. Assume there is only one peak element.
 */
public class Solution {
    // our feasibile function must return f f f t t t t for 0 1 2 3 2 1 0
    // we can choose if arr[i]>arr[i+1]
    //
    public static int findPeakIndex(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        int peakIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == arr.length - 1 || arr[mid] > arr[mid + 1]) {
                peakIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return peakIndex;

    }
}
