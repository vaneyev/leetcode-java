package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution189Test {

    @Test
    void rotate1() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        new Solution189().rotate(nums, 3);
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, nums);
    }

    @Test
    void rotate2() {
        int[] nums = {-1, -100, 3, 99};
        new Solution189().rotate(nums, 2);
        assertArrayEquals(new int[]{3, 99, -1, -100}, nums);
    }

    @Test
    void rotate3() {
        int[] nums = {1, 2, 3};
        new Solution189().rotate(nums, 2);
        assertArrayEquals(new int[]{2, 3, 1}, nums);
    }

    @Test
    void rotate4() {
        int[] nums = {1, 2, 3, 4, 5, 6};
        new Solution189().rotate(nums, 1);
        assertArrayEquals(new int[]{6, 1, 2, 3, 4, 5}, nums);
    }
}