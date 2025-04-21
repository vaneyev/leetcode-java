package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution81Test {

    @Test
    void search() {
        int[] nums = new int[] {2, 5, 6, 0, 0, 1, 2};
        Solution81 solution = new Solution81();
        boolean result = solution.search(nums, 0);
        assertTrue(result);
    }

    @Test
    void search2() {
        int[] nums = new int[] {2, 5, 6, 0, 0, 1, 2};
        Solution81 solution = new Solution81();
        boolean result = solution.search(nums, 3);
        assertFalse(result);
    }

    @Test
    void search3() {
        int[] nums = new int[] {2, 2, 1};
        Solution81 solution = new Solution81();
        boolean result = solution.search(nums, 2);
        assertTrue(result);
    }

    @Test
    void search4() {
        int[] nums = new int[] {2, 2, 2};
        Solution81 solution = new Solution81();
        boolean result = solution.search(nums, 2);
        assertTrue(result);
    }

    @Test
    void search5() {
        int[] nums = new int[] {1, 0, 1, 1, 1};
        Solution81 solution = new Solution81();
        boolean result = solution.search(nums, 0);
        assertTrue(result);
    }

    @Test
    void search6() {
        int[] nums = new int[] {1};
        Solution81 solution = new Solution81();
        boolean result = solution.search(nums, 0);
        assertFalse(result);
    }
}