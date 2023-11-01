package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution66Test {

    @Test
    void plusOne1() {
        int[] output = new Solution66().plusOne(new int[]{1, 2, 3});
        assertArrayEquals(new int[]{1, 2, 4}, output);
    }

    @Test
    void plusOne2() {
        int[] output = new Solution66().plusOne(new int[]{4, 3, 2, 1});
        assertArrayEquals(new int[]{4, 3, 2, 2}, output);
    }

    @Test
    void plusOne3() {
        int[] output = new Solution66().plusOne(new int[]{9});
        assertArrayEquals(new int[]{1, 0}, output);
    }
}