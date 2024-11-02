package leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;

public class onefourfour {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    static void periios(TreeNode root, List<Integer> arr) {
        if (root == null) {
            return;
        }
        arr.add(root.val);
        periios(root.left, arr);
        periios(root.right, arr);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        periios(root, arr); // Call the periios method
        return arr;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        onefourfour solution = new onefourfour();

        List<Integer> result = solution.preorderTraversal(root);

        System.out.println(result);
    }
}
