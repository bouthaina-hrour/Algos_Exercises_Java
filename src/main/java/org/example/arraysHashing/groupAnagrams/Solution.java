package org.example.arraysHashing.groupAnagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * <p>
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 */
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> hashMap = new HashMap<>();

        for (String str : strs) {
            int[] count = new int[27];
            for (int i = 0; i < str.length(); i++) {
                count[str.charAt(i) - 'a'] += 1;

            }
            StringBuilder sb = new StringBuilder();
            for (int num : count) {
                sb.append(num);
            }
            List<String> value = hashMap.computeIfAbsent(sb.toString(), key -> new ArrayList<>());
            value.add(str);

        }

        return new ArrayList<>(hashMap.values());


    }

}
