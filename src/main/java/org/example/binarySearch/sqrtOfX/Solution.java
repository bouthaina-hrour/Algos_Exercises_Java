package org.example.binarySearch.sqrtOfX;

/**
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
 * <p>
 * You must not use any built-in exponent function or operator.
 * <p>
 * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 */
public class Solution {
    public int mySqrt(int x) {
        int l = 1;
        int r = x;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid == (long) x) return mid;
            else if ((long) mid * mid > (long) x) {
                r = mid - 1;
            } else l = mid + 1;
        }
        return r;
    }
}
