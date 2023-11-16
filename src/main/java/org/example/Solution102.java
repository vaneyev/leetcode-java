package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Binary Tree Level Order Traversal
 */
public class Solution102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        handleNode(0, root, result);
        return result;
    }

    private void handleNode(int level, TreeNode root, List<List<Integer>> list) {
        if (root == null) {
            return;
        }
        if (list.size() == level) {
            List<Integer> levelList = new ArrayList<>();
            list.add(levelList);
            levelList.add(root.val);
        } else {
            list.get(level).add(root.val);
        }
        handleNode(level + 1, root.left, list);
        handleNode(level + 1, root.right, list);
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
