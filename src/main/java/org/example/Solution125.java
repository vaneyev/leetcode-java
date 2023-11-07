package org.example;

/**
 * Valid Palindrome
 */
public class Solution125 {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        char ci, cj;
        while (i < j) {
            ci = Character.toLowerCase(s.charAt(i));
            if (!isAlphaNumeric(ci)) {
                i++;
                continue;
            }
            cj = Character.toLowerCase(s.charAt(j));
            if (!isAlphaNumeric(cj)) {
                j--;
                continue;
            }
            if (ci != cj) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private boolean isAlphaNumeric(char c) {
        return c >= 'a' && c <= 'z' || c >= '0' && c <= '9';
    }
}
