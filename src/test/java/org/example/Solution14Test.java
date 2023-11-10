package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution14Test {

    @Test
    void longestCommonPrefix1() {
        String output = new Solution14().longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        assertEquals("fl", output);
    }

    @Test
    void longestCommonPrefix2() {
        String output = new Solution14().longestCommonPrefix(new String[]{"dog", "racecar", "car"});
        assertEquals("", output);
    }
}