package org.example.dynamicProgramming.climbingStairs;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps.
 * In how many distinct ways can you climb to the top?
 */
public class Solution {
    public static int climbingStairs(int n) {
        int[] dp = new int[n + 1];

        dp[n] = 1;
        dp[n - 1] = 1;

        for (int i = n - 2; i >= 0; i--) {
            dp[i] = dp[i + 1] + dp[n + 2];
        }
        return dp[0];
    }

    public static int climbingStairs2(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        return climbingStairs2(n - 1) + climbingStairs2(n - 2);
    }
}
