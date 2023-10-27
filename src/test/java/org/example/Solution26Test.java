package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution26Test {

    @Test
    void removeDuplicates1() {
        int[] nums = {1, 1, 2};
        int output = new Solution26().removeDuplicates(nums);
        assertEquals(2, output);
        int[] actual = Arrays.copyOf(nums, output);
        assertArrayEquals(new int[]{1, 2}, actual);
    }

    @Test
    void removeDuplicates2() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int output = new Solution26().removeDuplicates(nums);
        assertEquals(5, output);
        int[] actual = Arrays.copyOf(nums, output);
        assertArrayEquals(new int[]{0, 1, 2, 3, 4}, actual);
    }

    @Test
    void removeDuplicates3() {
        int[] nums = {1, 2, 3};
        int output = new Solution26().removeDuplicates(nums);
        assertEquals(3, output);
        int[] actual = Arrays.copyOf(nums, output);
        assertArrayEquals(new int[]{1, 2, 3}, actual);
    }
}