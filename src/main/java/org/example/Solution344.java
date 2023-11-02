package org.example;

/**
 * Reverse String
 */
public class Solution344 {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        char temp;
        while (i < j) {
            temp = s[i];
            s[i++] = s[j];
            s[j--] = temp;
        }
    }
}
