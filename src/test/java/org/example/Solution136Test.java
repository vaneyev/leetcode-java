package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution136Test {

    @Test
    void singleNumber1() {
        int output = new Solution136().singleNumber(new int[]{2, 2, 1});
        assertEquals(1, output);
    }

    @Test
    void singleNumber2() {
        int output = new Solution136().singleNumber(new int[]{4, 1, 2, 1, 2});
        assertEquals(4, output);
    }

    @Test
    void singleNumber3() {
        int output = new Solution136().singleNumber(new int[]{1});
        assertEquals(1, output);
    }
}