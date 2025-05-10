package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution301Test {

    @Test
    void removeInvalidParentheses() {
        Solution301 solution = new Solution301();
        List<String> result = solution.removeInvalidParentheses("()())()");
        assertEquals(2, result.size());
        assertEquals("(())()", result.get(0));
        assertEquals("()()()", result.get(1));
    }

    @Test
    void removeInvalidParentheses2() {
        Solution301 solution = new Solution301();
        List<String> result = solution.removeInvalidParentheses("(a)())()");
        assertEquals(2, result.size());
        assertEquals("(a())()", result.get(0));
        assertEquals("(a)()()", result.get(1));
    }

    @Test
    void removeInvalidParentheses3() {
        Solution301 solution = new Solution301();
        List<String> result = solution.removeInvalidParentheses(")(");
        assertEquals(1, result.size());
        assertEquals("", result.get(0));
    }
}