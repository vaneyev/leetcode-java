package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution56Test {

    @Test
    void merge() {
        int[][] intervals = new int[][] {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result = new Solution56().merge(intervals);
        assertArrayEquals(new int[] {1, 6}, result[0]);
        assertArrayEquals(new int[] {8, 10}, result[1]);
        assertArrayEquals(new int[] {15, 18}, result[2]);
    }

    @Test
    void merge2() {
        int[][] intervals = new int[][] {{1, 4}, {4, 5}};
        int[][] result = new Solution56().merge(intervals);
        assertArrayEquals(new int[] {1, 5}, result[0]);
    }

    @Test
    void merge3() {
        int[][] intervals = new int[][] {{1, 4}, {0, 4}};
        int[][] result = new Solution56().merge(intervals);
        assertArrayEquals(new int[] {0, 4}, result[0]);
    }
}