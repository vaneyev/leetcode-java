package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution18Test {

    @Test
    void fourSum() {
        int[] nums = {1, 0, -1, 0, -2, 2};
        Solution18 solution = new Solution18();
        List<List<Integer>> result = solution.fourSum(nums, 0);
        assertEquals(3, result.size());
        assertEquals(-2, result.get(0).get(0));
        assertEquals(-1, result.get(0).get(1));
        assertEquals(1, result.get(0).get(2));
        assertEquals(2, result.get(0).get(3));
    }

    @Test
    void fourSum2() {
        int[] nums = {1000000000,1000000000,1000000000,1000000000};
        Solution18 solution = new Solution18();
        List<List<Integer>> result = solution.fourSum(nums, -294967296);
        assertEquals(0, result.size());
    }
}