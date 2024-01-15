package org.example.dynamicProgramming.houseRobberII;

import java.util.Arrays;

import static org.example.dynamicProgramming.houseRobber.Solution.rob;

/**
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed.
 * All houses at this place are arranged in a circle.
 * That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two adjacent houses were broken into on the same night.
 * Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
 */
public class Solution {
    public static int rob2(int[] nums) {
        if(nums.length==1) return nums[0];
        return Math.max(rob(Arrays.stream(nums, 1, nums.length ).toArray()), rob(Arrays.stream(nums, 0, nums.length-1).toArray()));

    }
}
