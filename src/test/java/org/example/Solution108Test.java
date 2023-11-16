package org.example;

import org.example.Solution108.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution108Test {

    @Test
    void sortedArrayToBST1() {
        TreeNode output = new Solution108().sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
        assertNotNull(output);
        assertEquals(0, output.val);
        assertNotNull(output.left);
        assertEquals(-10, output.left.val);
        assertNotNull(output.right);
        assertEquals(5, output.right.val);
        assertNull(output.left.left);
        assertNotNull(output.left.right);
        assertEquals(-3, output.left.right.val);
        assertNull(output.right.left);
        assertNotNull(output.right.right);
        assertEquals(9, output.right.right.val);
    }

    @Test
    void sortedArrayToBST2() {
        TreeNode output = new Solution108().sortedArrayToBST(new int[]{1, 3});
        assertNotNull(output);
        assertEquals(1, output.val);
        assertNull(output.left);
        assertNotNull(output.right);
        assertEquals(3, output.right.val);
    }
}