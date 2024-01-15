package org.example.dynamicProgramming.longestPalindromicSubstring;

/**
 * Given a string s, return the longest palindromic substring in s.
 * A string is palindromic if it reads the same forward and backward.
 */
public class Solution {
    public String longestPalindrome(String s) {
        int maxLength = 1;
        int start = 0;
        int end = 0;
        int[][] dp = new int[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = 1;
            if (i != s.length() - 1) {
                dp[i][i + 1] = s.charAt(i) == s.charAt(i + 1) ? 1 : 0;
                if (dp[i][i + 1] == 1) {
                    maxLength = 2;
                    start = i;
                    end = i + 1;
                }
            }
        }
        for (int j = 2; j < dp.length; j++) {
            for (int i = 0; i < dp.length - 1; i++) {

                if (j != i && j != i + 1) {
                    if (((s.charAt(i) == s.charAt(j)) && (dp[i + 1][j - 1] == 1))) {
                        dp[i][j] = 1;
                        if (j - i + 1 > maxLength) {
                            maxLength = j - i + 1;
                            start = i;
                            end = j;
                        }
                    } else dp[i][j] = 0;

                }
            }
        }
        return s.substring(start, end + 1);

    }
}
