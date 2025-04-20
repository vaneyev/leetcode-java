package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {

    @Test
    void search() {
        int[] nums = new int[] {4, 5, 6, 7, 0, 1, 2};
        Solution33 solution = new Solution33();
        int result = solution.search(nums, 0);
        assertEquals(4, result);
    }

    @Test
    void search1() {
        int[] nums = new int[] {4, 5, 6, 7, 0, 1, 2};
        Solution33 solution = new Solution33();
        int result = solution.search(nums, 3);
        assertEquals(-1, result);
    }

    @Test
    void search2() {
        int[] nums = new int[] {1};
        Solution33 solution = new Solution33();
        int result = solution.search(nums, 0);
        assertEquals(-1, result);
    }

    @Test
    void search3() {
        int[] nums = new int[] {3, 1};
        Solution33 solution = new Solution33();
        int result = solution.search(nums, 0);
        assertEquals(-1, result);
    }

    @Test
    void search4() {
        int[] nums = new int[] {4, 5, 1, 2, 3};
        Solution33 solution = new Solution33();
        int result = solution.search(nums, 1);
        assertEquals(2, result);
    }

    @Test
    void search5() {
        int[] nums = new int[] {4, 5, 6, 7, 0, 1, 2};
        Solution33 solution = new Solution33();
        int result = solution.search(nums, 6);
        assertEquals(2, result);
    }
}