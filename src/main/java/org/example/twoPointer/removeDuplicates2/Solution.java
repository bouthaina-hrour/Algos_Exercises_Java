package org.example.twoPointer.removeDuplicates2;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Solution {



    public static int removeDuplicates2(int[] nums) {
        if (nums.length == 1) return 1;
        int i = 0;
        int j = i + 1;

        while (j < nums.length) {
            if (nums[j] == nums[i]) {
                if (i - 1 < 0 || nums[i - 1] != nums[j]) {
                    nums[i + 1] = nums[j];
                    i++;
                    j++;
                } else {
                    j++;
                }
            } else {
                nums[i + 1] = nums[j];
                i++;
                j++;
            }
        }
        return i;
    }
}
