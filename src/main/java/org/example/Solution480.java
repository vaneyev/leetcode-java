package org.example;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Supplier;

/**
 * Sliding Window Median
 */
public class Solution480 {
    public double[] medianSlidingWindow(int[] nums, int k) {
        double[] result = new double[nums.length - k + 1];
        Comparator<Integer> comparator = (l, r) -> nums[l] != nums[r] ? Integer.compare(nums[l], nums[r]) : l - r;
        TreeSet<Integer> left = new TreeSet<>(comparator);
        TreeSet<Integer> right = new TreeSet<>(comparator);
        Supplier<Double> median = k % 2 == 0
                ? () -> nums[left.last()] / 2.0 + nums[right.first()] / 2.0
                : () -> (double) nums[right.first()];
        Runnable balance = () -> {
            while (left.size() > right.size()) {
                right.add(left.pollLast());
            }
        };
        for (int i = 0; i < k; i++) {
            left.add(i);
        }
        balance.run();
        result[0] = median.get();
        for (int i = 0; i < nums.length - k; i++) {
            left.add(i + k);
            left.add(right.pollFirst());
            if (!left.remove(i)) {
                right.remove(i);
            }
            balance.run();
            result[i + 1] = median.get();
        }
        return result;
    }
}
