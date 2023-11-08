package org.example;

/**
 * String to Integer (atoi)
 */
public class Solution8 {
    public int myAtoi(String s) {
        char[] chars = s.trim().toCharArray();
        if (chars.length == 0) {
            return 0;
        }
        int i = 0;
        boolean minus = false;
        long result = 0;
        if (chars[i] == '-') {
            minus = true;
            i++;
        } else if (chars[i] == '+') {
            i++;
        }
        while (i < chars.length) {
            if (!Character.isDigit(chars[i])) {
                break;
            }
            result = result * 10 + (minus ? -chars[i] + '0' : chars[i] - '0');
            if (result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            i++;
        }
        return (int) (result);
    }
}
