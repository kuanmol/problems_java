package leet.binarytree;

public class onezerofour {

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

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {
        // Example 1
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);

        onezerofour solution = new onezerofour();
        System.out.println("Max Depth of Example 1: " + solution.maxDepth(root1)); // Expected output: 3

        // Example 2
        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(2);

        System.out.println("Max Depth of Example 2: " + solution.maxDepth(root2)); // Expected output: 2
    }
}
