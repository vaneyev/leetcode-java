package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution480Test {

    @Test
    void medianSlidingWindow() {
        double[] result = new Solution480().medianSlidingWindow(new int[] {1, 3, -1, -3, 5, 3, 6, 7}, 3);
        assertArrayEquals(new double[] {1.0, -1.0, -1.0, 3.0, 5.0, 6.0}, result);
    }

    @Test
    void medianSlidingWindow2() {
        double[] result = new Solution480().medianSlidingWindow(new int[] {1, 2, 3, 4, 2, 3, 1, 4, 2}, 3);
        assertArrayEquals(new double[] {2.0, 3.0, 3.0, 3.0, 2.0, 3.0, 2.0}, result);
    }

    @Test
    void medianSlidingWindow3() {
        double[] result = new Solution480().medianSlidingWindow(new int[] {1, 2, 3, 4, 2, 3, 1, 4, 2}, 4);
        assertArrayEquals(new double[] {2.5, 2.5, 3.0, 2.5, 2.5, 2.5}, result);
    }

    @Test
    void medianSlidingWindow4() {
        double[] result = new Solution480().medianSlidingWindow(new int[] {2147483647, 2147483647}, 2);
        assertArrayEquals(new double[] {2147483647}, result);
    }

    @Test
    void medianSlidingWindow5() {
        double[] result = new Solution480().medianSlidingWindow(new int[] {1, 2}, 1);
        assertArrayEquals(new double[] {1, 2}, result);
    }
}