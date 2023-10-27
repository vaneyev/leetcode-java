package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution122Test {

    @Test
    void maxProfit1() {
        int output = new Solution122().maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        assertEquals(7, output);
    }

    @Test
    void maxProfit2() {
        int output = new Solution122().maxProfit(new int[]{1, 2, 3, 4, 5});
        assertEquals(4, output);
    }

    @Test
    void maxProfit3() {
        int output = new Solution122().maxProfit(new int[]{7, 6, 4, 3, 1});
        assertEquals(0, output);
    }
}