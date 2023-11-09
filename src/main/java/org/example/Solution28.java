package org.example;

/**
 * Find the Index of the First Occurrence in a String
 */
public class Solution28 {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }
        int j;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            for (j = 0; needle.charAt(j) == haystack.charAt(i + j); j++) {
                if (j == needle.length() - 1) {
                    return i;
                }
            }
        }
        return -1;
    }
}
