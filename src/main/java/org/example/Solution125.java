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
            ci = s.charAt(i);
            if (!Character.isLetterOrDigit(ci)) {
                i++;
                continue;
            }
            cj = s.charAt(j);
            if (!Character.isLetterOrDigit(cj)) {
                j--;
                continue;
            }
            if (Character.toLowerCase(ci) != Character.toLowerCase(cj)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
