package org.example;

/**
 * First Bad Version
 */
public class Solution278 {
    public int bad = 4;
    boolean isBadVersion(int version) {
        return version >= bad;
    }
    public int firstBadVersion(int n) {
        int first = 1;
        int last = n;
        int middle;
        while(first < last) {
            middle = first + (last - first) / 2;
            if (isBadVersion(middle)) {
                last = middle;
            } else {
                first = middle + 1;
            }
        }
        return first;
    }
}
