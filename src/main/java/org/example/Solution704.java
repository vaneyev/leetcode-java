package org.example;

/**
 * Binary Search
 */
public class Solution704 {
    public int search(int[] nums, int target) {
        if (nums[0] > target && nums[nums.length - 1] < target) {
            return -1;
        }
        int left = 0, right = nums.length - 1;
        int mid = nums.length / 2;
        while (left <= right) {
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            }
            mid = left + (right - left) / 2;
        }
        return -1;
    }
}
