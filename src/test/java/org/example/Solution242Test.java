package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution242Test {

    @Test
    void isAnagram1() {
        boolean output = new Solution242().isAnagram("anagram", "nagaram");
        assertTrue(output);
    }

    @Test
    void isAnagram2() {
        boolean output = new Solution242().isAnagram("rat", "cat");
        assertFalse(output);
    }

    @Test
    void isAnagram3() {
        boolean output = new Solution242().isAnagram("ab", "a");
        assertFalse(output);
    }
}