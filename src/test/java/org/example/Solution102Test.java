package org.example;

import org.example.Solution102.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution102Test {

    @Test
    void levelOrder1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> output = new Solution102().levelOrder(root);
        assertNotNull(output);
        assertEquals(3, output.size());
        assertArrayEquals(new int[]{3}, output.get(0).stream().mapToInt(Integer::intValue).toArray());
        assertArrayEquals(new int[]{9, 20}, output.get(1).stream().mapToInt(Integer::intValue).toArray());
        assertArrayEquals(new int[]{15, 7}, output.get(2).stream().mapToInt(Integer::intValue).toArray());
    }

    @Test
    void levelOrder2() {
        TreeNode root = new TreeNode(1);
        List<List<Integer>> output = new Solution102().levelOrder(root);
        assertNotNull(output);
        assertEquals(1, output.size());
        assertArrayEquals(new int[]{1}, output.get(0).stream().mapToInt(Integer::intValue).toArray());
    }

    @Test
    void levelOrder3() {
        List<List<Integer>> output = new Solution102().levelOrder(null);
        assertNotNull(output);
        assertTrue(output.isEmpty());
    }
}