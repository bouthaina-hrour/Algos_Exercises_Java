package org.example.arraysHashing.containsDuplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> intSet = new HashSet<>();
        for (int value : nums) {
            if (intSet.contains(value)) {
                return true;
            } else {
                intSet.add(value);
            }
        }
        return false;

    }
}
