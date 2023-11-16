package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution88Test {

    @Test
    void merge1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        new Solution88().merge(nums1, 3, nums2, 3);
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    void merge2() {
        int[] nums1 = {1};
        int[] nums2 = {};
        new Solution88().merge(nums1, 1, nums2, 0);
        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    void merge3() {
        int[] nums1 = {0};
        int[] nums2 = {1};
        new Solution88().merge(nums1, 0, nums2, 1);
        assertArrayEquals(new int[]{1}, nums1);
    }
}