package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {

    @Test
    void strStr1() {
        int output = new Solution28().strStr("sadbutsad", "sad");
        assertEquals(0, output);
    }

    @Test
    void strStr2() {
        int output = new Solution28().strStr("leetcode", "leeto");
        assertEquals(-1, output);
    }
}