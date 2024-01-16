package org.example.binarySearch.findFirstTrue;

import java.util.List;

/**
 * EXO 1 - Find the First True in a Sorted Boolean Array
 * An array of boolean values is divided into two sections; the left section consists of all false and the right section consists of all true. Find the First True in a Sorted Boolean Array of the right section, i.e. the index of the first true element. If there is no true element, return -1.
 * Input: arr = [false, false, true, true, true]
 * Output: 2
 * Explanation: first true's index is 2.
 */
public class Solution {

    public static int findFirstTrueIndexInSortedArray(List<Boolean> arr) {
        int left = 0;
        int right = arr.size() - 1;
        int firstTrueIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid)) {
                firstTrueIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return firstTrueIndex;
    }


}
