package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution438Test {

    @Test
    void findAnagrams() {
        Solution438 solution = new Solution438();
        List<Integer> result = solution.findAnagrams("cbaebabacd", "abc");
        assertEquals(2, result.size());
        assertTrue(result.contains(0));
        assertTrue(result.contains(6));
    }

    @Test
    void findAnagrams2() {
        Solution438 solution = new Solution438();
        List<Integer> result = solution.findAnagrams("bpaa", "aa");
        assertEquals(1, result.size());
        assertTrue(result.contains(2));
    }

    @Test
    void findAnagrams3() {
        Solution438 solution = new Solution438();
        List<Integer> result = solution.findAnagrams("aaaaaaaaaa", "aaaaaaaaaaaaa");
        assertEquals(0, result.size());
    }
}