package org.example.arraysHashing.twoSumII;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class Solution {
    public static int[] sumOfTwoWithIndex(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(k - nums[i])) {

                return new int[]{i, map.get(k - nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[]{};

    }
}
