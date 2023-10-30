package org.example;

import java.util.HashSet;

/**
 * Contains Duplicate
 */
public class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 1) {
            return false;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int num: nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
