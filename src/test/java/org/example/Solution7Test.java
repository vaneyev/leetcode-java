package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution7Test {

    @Test
    void reverse1() {
        int output = new Solution7().reverse(123);
        assertEquals(321, output);
    }

    @Test
    void reverse2() {
        int output = new Solution7().reverse(-123);
        assertEquals(-321, output);
    }

    @Test
    void reverse3() {
        int output = new Solution7().reverse(120);
        assertEquals(21, output);
    }

    @Test
    void reverse4() {
        int output = new Solution7().reverse(900000);
        assertEquals(9, output);
    }

    @Test
    void reverse5() {
        int output = new Solution7().reverse(1534236469);
        assertEquals(0, output);
    }

    @Test
    void reverse6() {
        int output = new Solution7().reverse(901000);
        assertEquals(109, output);
    }

    @Test
    void reverse7() {
        int output = new Solution7().reverse(-2147483412);
        assertEquals(-2143847412, output);
    }

    @Test
    void reverse8() {
        int output = new Solution7().reverse(-2147483648);
        assertEquals(0, output);
    }

    @Test
    void reverse9() {
        int output = new Solution7().reverse(1563847412);
        assertEquals(0, output);
    }
}