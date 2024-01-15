package org.example.arraysHashing.twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> valueToIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (valueToIndexMap.containsKey(target - nums[i])) {
                return new int[]{valueToIndexMap.get(target - nums[i]), i};
            }
            valueToIndexMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
