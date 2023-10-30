package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution217Test {

    @Test
    void containsDuplicate1() {
        boolean output = new Solution217().containsDuplicate(new int[]{1, 2, 3, 1});
        assertTrue(output);
    }

    @Test
    void containsDuplicate2() {
        boolean output = new Solution217().containsDuplicate(new int[]{1, 2, 3, 4});
        assertFalse(output);
    }

    @Test
    void containsDuplicate3() {
        boolean output = new Solution217().containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2});
        assertTrue(output);
    }
}