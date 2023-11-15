package org.example;

import org.example.Solution104.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution104Test {

    @Test
    void maxDepth1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        int output = new Solution104().maxDepth(root);
        assertEquals(3, output);
    }

    @Test
    void maxDepth2() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        int output = new Solution104().maxDepth(root);
        assertEquals(2, output);
    }
}