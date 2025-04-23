package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution49Test {

    @Test
    void groupAnagrams() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Solution49 solution = new Solution49();
        List<List<String>> result = solution.groupAnagrams(strs);
        assertEquals(3, result.size());
        assertEquals(3, result.get(0).size());
        assertEquals("eat", result.get(0).get(0));
        assertEquals("tea", result.get(0).get(1));
        assertEquals("ate", result.get(0).get(2));
    }
}