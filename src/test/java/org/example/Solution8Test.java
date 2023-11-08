package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution8Test {

    @Test
    void myAtoi1() {
        int output = new Solution8().myAtoi("42");
        assertEquals(42, output);
    }

    @Test
    void myAtoi2() {
        int output = new Solution8().myAtoi("-42");
        assertEquals(-42, output);
    }

    @Test
    void myAtoi3() {
        int output = new Solution8().myAtoi("4193 with words");
        assertEquals(4193, output);
    }

    @Test
    void myAtoi4() {
        int output = new Solution8().myAtoi("-91283472332");
        assertEquals(-2147483648, output);
    }

    @Test
    void myAtoi5() {
        int output = new Solution8().myAtoi("");
        assertEquals(0, output);
    }

    @Test
    void myAtoi6() {
        int output = new Solution8().myAtoi("9223372036854775808");
        assertEquals(2147483647, output);
    }
}