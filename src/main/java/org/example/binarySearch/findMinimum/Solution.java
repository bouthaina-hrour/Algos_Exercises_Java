package org.example.binarySearch.findMinimum;

public class Solution {

    /**
     * A sorted array of unique integers was rotated at an unknown pivot. For example, [10, 20, 30, 40, 50] becomes [30, 40, 50, 10, 20]. Find the index of the minimum element in this array.
     * Input: [30, 40, 50, 10, 20]
     * [40,50, 60, 10, 20,30]
     * f f f t t t
     * Output: 3
     * Explanation: the smallest element is 10 and its index is 3.
     * Input: [3, 5, 7, 11, 13, 17, 19, 2]
     * Output: 7
     * Explanation: the smallest element is 2 and its index is 7.
     */
    public static int findMinInRotatedSortedArray(int[] arr) {
        int left =0;
        int right = arr.length-1;
        int index=-1;

        while (left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]<=arr[arr.length-1]){
                index=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return index;

    }
}
