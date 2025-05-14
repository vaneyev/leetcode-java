package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Partition Labels
 */
class Solution763Test {

    @Test
    void partitionLabels() {
        List<Integer> result = new Solution763().partitionLabels("ababcbacadefegdehijhklij");
        assertNotNull(result);
        assertEquals(3, result.size());
        assertEquals(9, result.get(0));
        assertEquals(7, result.get(1));
        assertEquals(8, result.get(2));
    }

    @Test
    void partitionLabels2() {
        List<Integer> result = new Solution763().partitionLabels("eccbbbbdec");
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(10, result.get(0));
    }
}