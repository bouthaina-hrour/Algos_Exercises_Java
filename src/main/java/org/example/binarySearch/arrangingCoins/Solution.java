package org.example.binarySearch.arrangingCoins;

/**
 * You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.
 * <p>
 * Given the integer n, return the number of complete rows of the staircase you will build.
 */
public class Solution {
    public int arrangeCoins(int n) {
        int completedRows = 0;
        long left = 1;
        long right = n;
        while (left <= right) {

            int mid = (int) ((left + right) / 2);
            long coins = (long) ((mid / 2.0) * (mid + 1));
            if (coins > n) {
                right = mid - 1;
            } else {
                completedRows = Math.max(completedRows, mid);
                left = mid + 1;
            }
        }
        return completedRows;
    }
}
