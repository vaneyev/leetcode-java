package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution424Test {

    @Test
    void characterReplacement() {
        int result = new Solution424().characterReplacement("ABAB", 2);
        assertEquals(4, result);
    }

    @Test
    void characterReplacement2() {
        int result = new Solution424().characterReplacement("AABABBA", 1);
        assertEquals(4, result);
    }
}