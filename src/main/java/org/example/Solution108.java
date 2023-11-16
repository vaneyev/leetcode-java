package org.example;

/**
 * Convert Sorted Array to Binary Search Tree
 */
public class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return create(nums, 0, nums.length - 1);
}

    public TreeNode create(int[] nums, int first, int last) {
        if (first > last) {
            return null;
        }
        int middle = (first + last) / 2;
        TreeNode node = new TreeNode(nums[middle]);
        node.left = create(nums, first, middle - 1);
        node.right = create(nums, middle + 1, last);
        return node;
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
