package org.example;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Intersection of Two Arrays II
 */
public class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                nums2[k++] = nums2[j++];
                i++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return Arrays.copyOf(nums2, k);
    }

    public int[] intersect2(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.compute(num, (key, value) -> value == null ? 1 : ++value);
        }
        int i = 0;
        for (int num : nums2) {
            Integer count = map.computeIfPresent(num, (key, value) -> --value);
            if (count != null && count >= 0) {
                nums2[i] = num;
                i++;
            }
        }
        return Arrays.copyOf(nums2, i);
    }
}
