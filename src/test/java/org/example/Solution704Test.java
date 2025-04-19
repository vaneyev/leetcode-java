package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution704Test {
    @Test
    void searchTest() {
        Solution704 solution704 = new Solution704();
        int result = solution704.search(new int[] {1, 2, 3, 4}, 3);
        assertEquals(2, result);
    }

    @Test
    void searchTest1() {
        Solution704 solution704 = new Solution704();
        int result = solution704.search(new int[] {1, 2, 3, 4}, 5);
        assertEquals(-1, result);
    }

    @Test
    void searchTest2() {
        Solution704 solution704 = new Solution704();
        int result = solution704.search(new int[] {1}, 5);
        assertEquals(-1, result);
    }

    @Test
    void searchTest3() {
        Solution704 solution704 = new Solution704();
        int result = solution704.search(new int[] {1}, 1);
        assertEquals(0, result);
    }

    @Test
    void searchTest4() {
        Solution704 solution704 = new Solution704();
        int result = solution704.search(new int[] {1, 2, 3, 4}, 4);
        assertEquals(3, result);
    }
    @Test
    void searchTest5() {
        Solution704 solution704 = new Solution704();
        int result = solution704.search(new int[] {-1, 0, 3, 5, 9, 12}, 2);
        assertEquals(-1, result);
    }
}