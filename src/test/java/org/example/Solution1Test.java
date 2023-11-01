package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {

    @Test
    void twoSum1() {
        int[] output = new Solution1().twoSum(new int[] {2,7,11,15}, 9);
        Arrays.sort(output);
        assertArrayEquals(new int[] {0, 1}, output);
    }

    @Test
    void twoSum2() {
        int[] output = new Solution1().twoSum(new int[] {3,2,4}, 6);
        Arrays.sort(output);
        assertArrayEquals(new int[] {1, 2}, output);
    }

    @Test
    void twoSum3() {
        int[] output = new Solution1().twoSum(new int[] {3, 3}, 6);
        Arrays.sort(output);
        assertArrayEquals(new int[] {0, 1}, output);
    }
}