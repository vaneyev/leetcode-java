package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Best Time to Buy and Sell Stock with Transaction Fee
 */
class Solution714Test {

    @Test
    void maxProfit() {
        int result = new Solution714().maxProfit(new int[] {1, 3, 2, 8, 4, 9}, 2);
        assertEquals(8, result);
    }

    @Test
    void maxProfit2() {
        int result = new Solution714().maxProfit(new int[] {1, 3, 7, 5, 10, 3}, 3);
        assertEquals(6, result);
    }
}