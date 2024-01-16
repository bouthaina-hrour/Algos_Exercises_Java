package org.example.mathAndGeometry.perfectPthPowers;

/**
 * We say that x is a perfect square if, for some integer b, x=b^2
 * Similarly, x is a perfect cube if, for some integer b, x=b^3
 * More generally, x is a perfect pth power if, for some integer b, b, x=b^p.
 * Given an integer x you are to determine the largest integer p such that
 * x is a perfect pth power.
 */
public class Solution {
    public static int findLargestPower(int x) {
        int resultP = 1;

        int absX = Math.abs(x);

        for (int p = 2; p <= 32; p++) {
            double baseCandidate = Math.pow(absX, 1.0 / p);

            if (baseCandidate == (int) baseCandidate) {
                resultP = p;

            }
        }

        return resultP;
    }

}
