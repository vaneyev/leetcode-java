package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution110Test {

    @Test
    void isBalanced() {
        Solution110.TreeNode root = new Solution110.TreeNode(3);
        root.left = new Solution110.TreeNode(9);
        root.right = new Solution110.TreeNode(20);
        root.right.left = new Solution110.TreeNode(15);
        root.right.right = new Solution110.TreeNode(7);
        boolean result = new Solution110().isBalanced(root);
        assertTrue(result);
    }

    @Test
    void isBalanced2() {
        Solution110.TreeNode root = new Solution110.TreeNode(1);
        root.left = new Solution110.TreeNode(2);
        root.right = new Solution110.TreeNode(2);
        root.left.left = new Solution110.TreeNode(3);
        root.left.right = new Solution110.TreeNode(3);
        root.left.left.left = new Solution110.TreeNode(4);
        root.left.left.right = new Solution110.TreeNode(4);
        boolean result = new Solution110().isBalanced(root);
        assertFalse(result);
    }

    @Test
    void isBalanced3() {
        boolean result = new Solution110().isBalanced(null);
        assertTrue(result);
    }

    @Test
    void isBalanced4() {
        Solution110.TreeNode root = new Solution110.TreeNode(1);
        root.left = new Solution110.TreeNode(2);
        root.right = new Solution110.TreeNode(3);
        root.left.left = new Solution110.TreeNode(4);
        root.left.right = new Solution110.TreeNode(5);
        root.right.left = new Solution110.TreeNode(6);
        root.left.left.left = new Solution110.TreeNode(8);
        boolean result = new Solution110().isBalanced(root);
        assertTrue(result);
    }

    @Test
    void isBalanced5() {
        Solution110.TreeNode root = new Solution110.TreeNode(1);
        root.right = new Solution110.TreeNode(2);
        root.right.right = new Solution110.TreeNode(3);
        boolean result = new Solution110().isBalanced(root);
        assertFalse(result);
    }
}