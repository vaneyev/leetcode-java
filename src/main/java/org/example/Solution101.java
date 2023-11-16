package org.example;

/**
 * Symmetric Tree
 */
public class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        return isEqual(root.left, root.right);
    }

    private boolean isEqual(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null || left.val != right.val) {
            return false;
        }
        if (!isEqual(left.left, right.right)) {
            return false;
        }
        return isEqual(left.right, right.left);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
