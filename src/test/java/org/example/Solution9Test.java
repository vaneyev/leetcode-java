package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution9Test {

    @Test
    void isPalindrome1() {
        boolean output = new Solution9().isPalindrome(121);
        assertTrue(output);
    }

    @Test
    void isPalindrome2() {
        boolean output = new Solution9().isPalindrome(-121);
        assertFalse(output);
    }

    @Test
    void isPalindrome3() {
        boolean output = new Solution9().isPalindrome(10);
        assertFalse(output);
    }

    @Test
    void isPalindrome4() {
        boolean output = new Solution9().isPalindrome(1410110141);
        assertTrue(output);
    }
}