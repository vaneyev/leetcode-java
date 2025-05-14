package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution11Test {

    @Test
    void maxArea() {
        int result = new Solution11().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        assertEquals(49, result);
    }

    @Test
    void maxArea2() {
        int result = new Solution11().maxArea(new int[]{1, 1});
        assertEquals(1, result);
    }
}