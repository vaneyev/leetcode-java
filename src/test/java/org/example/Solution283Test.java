package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution283Test {

    @Test
    void moveZeroes1() {
        int[] nums = {0, 1, 0, 3, 12};
        new Solution283().moveZeroes(nums);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }

    @Test
    void moveZeroes2() {
        int[] nums = {0};
        new Solution283().moveZeroes(nums);
        assertArrayEquals(new int[]{0}, nums);
    }

    @Test
    void moveZeroes3() {
        int[] nums = {1, 0};
        new Solution283().moveZeroes(nums);
        assertArrayEquals(new int[]{1, 0}, nums);
    }
}