package org.example;

/**
 * Rotate Array
 */
public class Solution189 {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        int end = nums.length - 1;
        reverse(nums, 0, end);
        reverse(nums, 0, k - 1);
        reverse(nums, k, end);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            nums[start] ^= nums[end];
            nums[end] ^= nums[start];
            nums[start++] ^= nums[end--];
        }
    }
}
