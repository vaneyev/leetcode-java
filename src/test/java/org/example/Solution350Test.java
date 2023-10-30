package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution350Test {

    @Test
    void intersect1() {
        int[] output = new Solution350().intersect(
                new int[]{1, 2, 2, 1},
                new int[]{2, 2}
        );
        assertArrayEquals(new int[]{2, 2}, output);
    }

    @Test
    void intersect2() {
        int[] output = new Solution350().intersect(
                new int[]{4, 9, 5},
                new int[]{9, 4, 9, 8, 4}
        );
        Arrays.sort(output);
        assertArrayEquals(new int[]{4, 9}, output);
    }
}