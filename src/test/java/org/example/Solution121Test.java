package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution121Test {

    @Test
    void maxProfit() {
        assertEquals(5, new Solution121().maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
    }

    @Test
    void maxProfit2() {
        assertEquals(0, new Solution121().maxProfit(new int[] {7, 6, 4, 3, 1}));
    }

    @Test
    void maxProfit3() {
        assertEquals(1, new Solution121().maxProfit(new int[] {1, 2}));
    }
}