package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution48Test {

    @Test
    void rotate1() {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        new Solution48().rotate(matrix);
        int[][] expected = new int[][]{
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };
        for (int i = 0; i < matrix.length; i++) {
            assertArrayEquals(expected[i], matrix[i]);
        }
    }

    @Test
    void rotate2() {
        int[][] matrix = new int[][]{
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };
        new Solution48().rotate(matrix);
        int[][] expected = new int[][]{
                {15, 13, 2, 5},
                {14, 3, 4, 1},
                {12, 6, 8, 9},
                {16, 7, 10, 11}
        };
        for (int i = 0; i < matrix.length; i++) {
            assertArrayEquals(expected[i], matrix[i]);
        }
    }
}