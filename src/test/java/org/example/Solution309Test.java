package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution309Test {

    @Test
    void maxProfit() {
        int result = new Solution309().maxProfit(new int[] {1, 2, 3, 0, 2});
        assertEquals(3, result);
    }

    @Test
    void maxProfit2() {
        int result = new Solution309().maxProfit(new int[] {1});
        assertEquals(0, result);
    }
}