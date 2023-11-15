package org.example;

import org.example.Solution98.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution98Test {

    @Test
    void isValidBST1() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        boolean output = new Solution98().isValidBST(root);
        assertTrue(output);
    }

    @Test
    void isValidBST2() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);
        boolean output = new Solution98().isValidBST(root);
        assertFalse(output);
    }

    @Test
    void isValidBST3() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        boolean output = new Solution98().isValidBST(root);
        assertFalse(output);
    }

    @Test
    void isValidBST4() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(6);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(7);
        boolean output = new Solution98().isValidBST(root);
        assertFalse(output);
    }

    @Test
    void isValidBST5() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(6);
        boolean output = new Solution98().isValidBST(root);
        assertTrue(output);
    }

    @Test
    void isValidBST6() {
        TreeNode root = new TreeNode(32);
        root.left = new TreeNode(26);
        root.right = new TreeNode(47);
        root.left.left = new TreeNode(19);
        root.right.right = new TreeNode(56);
        root.left.left.right = new TreeNode(27);
        boolean output = new Solution98().isValidBST(root);
        assertFalse(output);
    }
}