package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution153Test {

    @Test
    void findMin() {
        int[] nums = {3, 4, 5, 1, 2};
        Solution153 solution = new Solution153();
        int min = solution.findMin(nums);
        assertEquals(1, min);
    }

    @Test
    void findMin2() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        Solution153 solution = new Solution153();
        int min = solution.findMin(nums);
        assertEquals(0, min);
    }

    @Test
    void findMin3() {
        int[] nums = {11, 13, 15, 17};
        Solution153 solution = new Solution153();
        int min = solution.findMin(nums);
        assertEquals(11, min);
    }

    @Test
    void findMin4() {
        int[] nums = {3, 1, 2};
        Solution153 solution = new Solution153();
        int min = solution.findMin(nums);
        assertEquals(1, min);
    }

    @Test
    void findMin5() {
        int[] nums = {2, 1};
        Solution153 solution = new Solution153();
        int min = solution.findMin(nums);
        assertEquals(1, min);
    }
}