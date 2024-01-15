package org.example.arraysHashing.replaceElements;

/**
 * Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
 * <p>
 * After doing so, return the array.
 */
public class Solution {
    public int[] replaceElements(int[] arr) {
        int[] arr2 = new int[arr.length];

        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[i] = max;
            max = Math.max(arr[i], max);
        }
        return arr2;
    }
}
