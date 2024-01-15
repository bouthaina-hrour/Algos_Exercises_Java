package org.example.arraysHashing.longestCommonPrefix;

import java.util.Arrays;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        return longestCommonPrefix(strs[0], strs[strs.length - 1]);

    }

    private static String longestCommonPrefix(String first, String last) {
        StringBuilder sb = new StringBuilder();
        int length = Math.min(first.length(), last.length());
        for (int i = 0; i < length; i++) {
            if (first.charAt(i) != last.charAt(i)) {
                break;
            }
            sb.append(first.charAt(i));
        }
        return sb.toString();

    }
}
