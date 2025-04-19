package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution374Test {

    @Test
    void guessNumber() {
        Solution374 solution = new Solution374(6);
        assertEquals(6, solution.guessNumber(10));
    }

    @Test
    void guessNumber1() {
        Solution374 solution = new Solution374(1);
        assertEquals(1, solution.guessNumber(1));
    }

    @Test
    void guessNumber2() {
        Solution374 solution = new Solution374(1);
        assertEquals(1, solution.guessNumber(2));
    }

    @Test
    void guessNumber3() {
        Solution374 solution = new Solution374(1702766719);
        assertEquals(1702766719, solution.guessNumber(2126753390));
    }
}