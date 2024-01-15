package arraysHashing.validAnagram;

import java.util.Arrays;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * <p>
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        Arrays.sort(chart);
        Arrays.sort(chars);
        for (int i = 0; i < chart.length; i++) {
            if (chart[i] != chars[i]) return false;
        }
        return true;

    }
}
