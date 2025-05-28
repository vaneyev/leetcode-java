package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution113Test {

    @Test
    void pathSum() {
        Solution113.TreeNode root = new Solution113.TreeNode(5);
        root.left = new Solution113.TreeNode(4);
        root.right = new Solution113.TreeNode(8);
        root.left.left = new Solution113.TreeNode(11);
        root.left.left.left = new Solution113.TreeNode(7);
        root.left.left.right = new Solution113.TreeNode(2);
        root.right.left = new Solution113.TreeNode(13);
        root.right.right = new Solution113.TreeNode(4);
        root.right.right.left = new Solution113.TreeNode(5);
        root.right.right.right = new Solution113.TreeNode(1);
        List<List<Integer>> result = new Solution113().pathSum(root, 22);
        assertEquals(2, result.size());
        assertEquals(4, result.get(0).size());
        assertEquals(4, result.get(1).size());
        assertEquals(5, result.get(0).get(0));
        assertEquals(4, result.get(0).get(1));
        assertEquals(11, result.get(0).get(2));
        assertEquals(2, result.get(0).get(3));
        assertEquals(5, result.get(1).get(0));
        assertEquals(8, result.get(1).get(1));
        assertEquals(4, result.get(1).get(2));
        assertEquals(5, result.get(1).get(3));
    }

    @Test
    void pathSum2() {
        Solution113.TreeNode root = new Solution113.TreeNode(1);
        root.left = new Solution113.TreeNode(2);
        root.right = new Solution113.TreeNode(3);
        List<List<Integer>> result = new Solution113().pathSum(root, 5);
        assertTrue(result.isEmpty());
    }

    @Test
    void pathSum3() {
        Solution113.TreeNode root = new Solution113.TreeNode(1);
        root.left = new Solution113.TreeNode(2);
        List<List<Integer>> result = new Solution113().pathSum(root, 0);
        assertTrue(result.isEmpty());
    }
}