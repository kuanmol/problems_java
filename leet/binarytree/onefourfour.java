package leet.binarytree;

import java.util.ArrayList;
import java.util.List;

public class onefourfour {

    // Definition for a binary tree node
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // Method to perform preorder traversal
    static void periios(TreeNode root, List<Integer> arr) {
        if (root == null) {
            return;
        }
        arr.add(root.val); // Visit the root
        periios(root.left, arr); // Traverse left subtree
        periios(root.right, arr); // Traverse right subtree
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        periios(root, arr); // Call the periios method
        return arr;
    }

    public static void main(String[] args) {
        // Create the tree nodes
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Create an instance of onefourfour
        onefourfour solution = new onefourfour();

        // Perform preorder traversal
        List<Integer> result = solution.preorderTraversal(root);

        // Print the result
        System.out.println(result); // Expected output: [1, 2, 4, 5, 3]
    }
}
