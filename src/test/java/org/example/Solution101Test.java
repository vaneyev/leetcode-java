package org.example;

import org.example.Solution101.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution101Test {

    @Test
    void isSymmetric1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        boolean output = new Solution101().isSymmetric(root);
        assertTrue(output);
    }

    @Test
    void isSymmetric2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(3);
        boolean output = new Solution101().isSymmetric(root);
        assertFalse(output);
    }

    @Test
    void isSymmetric3() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        boolean output = new Solution101().isSymmetric(root);
        assertFalse(output);
    }
}