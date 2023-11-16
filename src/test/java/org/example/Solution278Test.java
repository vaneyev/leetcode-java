package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution278Test {

    @Test
    void firstBadVersion1() {
        Solution278 solution = new Solution278();
        solution.bad = 4;
        int output = solution.firstBadVersion(5);
        assertEquals(solution.bad, output);
    }

    @Test
    void firstBadVersion2() {
        Solution278 solution = new Solution278();
        solution.bad = 1;
        int output = solution.firstBadVersion(1);
        assertEquals(solution.bad, output);
    }

    @Test
    void firstBadVersion3() {
        Solution278 solution = new Solution278();
        solution.bad = 2;
        int output = solution.firstBadVersion(3);
        assertEquals(solution.bad, output);
    }

    @Test
    void firstBadVersion4() {
        Solution278 solution = new Solution278();
        solution.bad = 1702766719;
        int output = solution.firstBadVersion(2126753390);
        assertEquals(solution.bad, output);
    }
}