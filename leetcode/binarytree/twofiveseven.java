package leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;

public class twofiveseven {
    List<String> result;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        twofiveseven solution = new twofiveseven();
        List<String> result = solution.binaryTreePaths(root);
        System.out.println("Root-to-leaf paths: " + result);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(root, sb);
        return result;
    }

    public void helper(TreeNode root, StringBuilder sb) {
        if (root == null) {
            return;
        }

        int len = sb.length();
        sb.append(root.val);
        if (root.left == null && root.right == null) {
            result.add(sb.toString());
        } else {
            sb.append("->");
            helper(root.left, sb);
            helper(root.right, sb);
        }

        sb.setLength(len);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

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
