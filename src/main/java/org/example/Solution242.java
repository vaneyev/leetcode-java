package org.example;

/**
 * Valid Anagram
 */
public class Solution242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] chars = new int[26];
        for (char c : s.toCharArray()) {
            chars[c - 'a']++;
        }
        int f = 0;
        for (char c: t.toCharArray()) {
            int i = c - 'a';
            if (--chars[i] < 0) {
                return false;
            }
            if (chars[i] == 0) {
                f &= 1 << i;
            } else {
                f |= 1 << i;
            }
        }
        return f == 0;
    }
}
