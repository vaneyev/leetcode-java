package org.example;

/**
 * Longest Repeating Character Replacement
 */
public class Solution424 {
    public int characterReplacement(String s, int k) {
        int[] chars = new int[26];
        int res = 0;
        int max = 0;
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            chars[c - 'A']++;
            max = Math.max(max, chars[c - 'A']);
            while (j - i + 1 - max > k) {
                c = s.charAt(i);
                chars[c - 'A']--;
                i++;
            }
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}
