package org.example.dynamicProgramming.minCostClimbingStairs;

/**
 * You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.
 * You can either start from the step with index 0, or the step with index 1.
 * Return the minimum cost to reach the top of the floor.
 */
public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] realCost = new int[cost.length + 1];
        realCost[cost.length] = 0;
        realCost[cost.length - 1] = cost[cost.length - 1];

        for (int i = cost.length - 2; i >= 0; i--) {
            realCost[i] = Math.min(realCost[i + 2], realCost[i + 1]) + cost[i];
        }
        return Math.min(realCost[0], realCost[1]);

    }
}
