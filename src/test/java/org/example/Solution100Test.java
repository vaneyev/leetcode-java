package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution100Test {

    @Test
    void isSameTree() {
        Solution100.TreeNode p = new Solution100.TreeNode(1);
        p.left = new Solution100.TreeNode(2);
        p.right = new Solution100.TreeNode(3);
        Solution100.TreeNode q = new Solution100.TreeNode(1);
        q.left = new Solution100.TreeNode(2);
        q.right = new Solution100.TreeNode(3);
        boolean result = new Solution100().isSameTree(p, q);
        assertTrue(result);
    }

    @Test
    void isSameTree2() {
        Solution100.TreeNode p = new Solution100.TreeNode(1);
        p.left = new Solution100.TreeNode(2);
        Solution100.TreeNode q = new Solution100.TreeNode(1);
        q.right = new Solution100.TreeNode(2);
        boolean result = new Solution100().isSameTree(p, q);
        assertFalse(result);
    }

    @Test
    void isSameTree3() {
        Solution100.TreeNode p = new Solution100.TreeNode(1);
        p.left = new Solution100.TreeNode(2);
        p.right = new Solution100.TreeNode(1);
        Solution100.TreeNode q = new Solution100.TreeNode(1);
        q.left = new Solution100.TreeNode(1);
        q.right = new Solution100.TreeNode(2);
        boolean result = new Solution100().isSameTree(p, q);
        assertFalse(result);
    }

}