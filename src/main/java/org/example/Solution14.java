package org.example;

/**
 * Longest Common Prefix
 */
public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        int j;
        char c;
        int min = Integer.MAX_VALUE;
        for (String str:
             strs) {
            if (str.length() < min) {
                min = str.length();
            }
        }
        for (int i = 0; i < min; i++) {
            c = strs[0].charAt(i);
            for(j = 1; j < strs.length; j++) {
                if (c != strs[j].charAt(i)) {
                    return result.toString();
                }
            }
            result.append(c);
        }
        return result.toString();
    }
}
