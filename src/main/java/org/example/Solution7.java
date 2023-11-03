package org.example;

/**
 * Reverse Integer
 */
public class Solution7 {
    public int reverse(int x) {
        if (x == Integer.MIN_VALUE) {
            return 0;
        }
        boolean minus = x < 0;
        String s = Integer.toString(minus ? -x : x);
        int i;
        int first = s.length() == 10 ? 1 : 0;
        x = 0;
        for(i = s.length() - 1; i >= first; i--) {
            x = x * 10 + (s.charAt(i) - '0');
        }
        if (s.length() == 10) {
            if (x > 214748364 || (x == 214748364 && s.charAt(i) - '0' > 7)) {
                return 0;
            }
            x = x * 10 + s.charAt(i) - '0';
        }
        return minus ? - x : x;
    }
}
