package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution74Test {

    @Test
    void searchMatrix() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        Solution74 solution = new Solution74();
        boolean result = solution.searchMatrix(matrix, 70);
        assertFalse(result);
    }

    @Test
    void searchMatrix1() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        Solution74 solution = new Solution74();
        boolean result = solution.searchMatrix(matrix, 3);
        assertTrue(result);
    }

    @Test
    void searchMatrix2() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        Solution74 solution = new Solution74();
        boolean result = solution.searchMatrix(matrix, 13);
        assertFalse(result);
    }

    @Test
    void searchMatrix3() {
        int[][] matrix = {{1}};
        Solution74 solution = new Solution74();
        boolean result = solution.searchMatrix(matrix, 1);
        assertTrue(result);
    }

    @Test
    void searchMatrix4() {
        int[][] matrix = {{1, 3}};
        Solution74 solution = new Solution74();
        boolean result = solution.searchMatrix(matrix, 3);
        assertTrue(result);
    }
}