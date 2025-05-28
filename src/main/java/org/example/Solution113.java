package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Path Sum II
 */
public class Solution113 {
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

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> path = new ArrayList<>();
        dfs(root, path, targetSum);
        return res;
    }

    private void dfs(TreeNode node, List<Integer> path, int remain) {
        if (node == null) {
            return;
        }
        path.add(node.val);
        if (node.left == null && node.right == null) {
            if (remain == node.val) {
                res.add(new ArrayList<>(path));
            }
        }
        dfs(node.left, path, remain - node.val);
        dfs(node.right, path, remain - node.val);
        path.remove(path.size() - 1);
    }
}
