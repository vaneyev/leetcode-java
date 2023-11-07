package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution125Test {

    @Test
    void isPalindrome1() {
        boolean output = new Solution125().isPalindrome("A man, a plan, a canal: Panama");
        assertTrue(output);
    }

    @Test
    void isPalindrome2() {
        boolean output = new Solution125().isPalindrome("race a car");
        assertFalse(output);
    }

    @Test
    void isPalindrome3() {
        boolean output = new Solution125().isPalindrome(" ");
        assertTrue(output);
    }
}