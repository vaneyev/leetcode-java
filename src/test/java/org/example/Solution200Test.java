package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution200Test {

    @Test
    void numIslands() {
        char[][] grid = new char[][] {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        Solution200 solution = new Solution200();
        int result = solution.numIslands(grid);
        assertEquals(1, result);
    }

    @Test
    void numIslands2() {
        char[][] grid = new char[][] {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        Solution200 solution = new Solution200();
        int result = solution.numIslands(grid);
        assertEquals(3, result);
    }

    @Test
    void numIslands3() {
        char[][] grid = new char[][] {
                {'1', '1', '1'},
                {'0', '1', '0'},
                {'1', '1', '1'}
        };
        Solution200 solution = new Solution200();
        int result = solution.numIslands(grid);
        assertEquals(1, result);
    }

    @Test
    void numIslands4() {
        char[][] grid = new char[][] {
                {'1', '0', '1', '1', '1'},
                {'1', '0', '1', '0', '1'},
                {'1', '1', '1', '0', '1'},
        };
        Solution200 solution = new Solution200();
        int result = solution.numIslands(grid);
        assertEquals(1, result);
    }

    @Test
    void numIslands5() {
        char[][] grid = new char[][]
                {
                        {'1', '1', '1', '1', '1', '0', '1', '1', '1', '1'},
                        {'0', '1', '1', '0', '1', '1', '1', '0', '1', '1'},
                        {'1', '0', '1', '0', '1', '1', '0', '1', '0', '1'},
                        {'1', '0', '1', '1', '0', '1', '1', '1', '1', '1'},
                        {'1', '1', '0', '0', '1', '1', '1', '1', '1', '1'},
                        {'1', '1', '0', '1', '1', '1', '1', '1', '1', '1'},
                        {'1', '1', '1', '1', '1', '1', '1', '1', '0', '1'},
                        {'0', '1', '1', '0', '1', '1', '1', '1', '1', '0'},
                        {'1', '1', '0', '1', '1', '0', '1', '1', '1', '1'},
                        {'0', '1', '1', '1', '1', '1', '0', '1', '1', '1'}
                };
        Solution200 solution = new Solution200();
        int result = solution.numIslands(grid);
        assertEquals(1, result);
    }
}