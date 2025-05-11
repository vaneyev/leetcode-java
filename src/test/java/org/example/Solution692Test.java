package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution692Test {

    @Test
    void topKFrequent() {
        List<String> result = new Solution692().topKFrequent(new String[] {"i", "love", "leetcode", "i", "love", "coding"}, 2);
        assertEquals(2, result.size());
        assertEquals("i", result.get(0));
        assertEquals("love", result.get(1));
    }

    @Test
    void topKFrequent2() {
        List<String> result = new Solution692().topKFrequent(new String[] {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4);
        assertEquals(4, result.size());
        assertEquals("the", result.get(0));
        assertEquals("is", result.get(1));
        assertEquals("sunny", result.get(2));
        assertEquals("day", result.get(3));
    }
}