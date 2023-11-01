package org.example;

import java.util.HashMap;

/**
 * Two Sum
 */
public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer p = map.get(nums[i]);
            if (p != null) {
                return new int[]{p, i};
            }
            map.put(target - nums[i], i);
        }
        return new int[]{};
    }
}
