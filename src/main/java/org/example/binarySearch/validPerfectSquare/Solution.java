package org.example.binarySearch.validPerfectSquare;

/**
 * Given a positive integer num, return true if num is a perfect square or false otherwise.
 * <p>
 * A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.
 * <p>
 * You must not use any built-in library function, such as sqrt.
 */
public class Solution {
    public boolean isPerfectSquare(int num) {
        long l = 1;
        long r = num;

        while (l <= r) {
            long mid = l + (r - l) / 2;
            if (mid * mid == num) return true;
            else if (mid * mid > num) {
                r = mid - 1;
            } else l = mid + 1;
        }
        return false;
    }
}
