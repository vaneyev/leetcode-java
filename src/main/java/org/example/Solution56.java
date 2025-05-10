package org.example;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Merge Intervals
 */
public class Solution56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int j = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[j][1] >= intervals[i][0]) {
                intervals[j][1] = Math.max(intervals[j][1], intervals[i][1]);
            } else {
                j++;
                intervals[j] = intervals[i];
            }
        }
        return Arrays.copyOfRange(intervals, 0, j + 1);
    }
}
