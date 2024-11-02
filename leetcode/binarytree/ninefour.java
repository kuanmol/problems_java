package leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;

public class ninefour {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        // Method to perform inorder traversal
        public List<Integer> inorderTraversal() {
            List<Integer> result = new ArrayList<>();
            inorderTraversalHelper(this, result);
            return result;
        }

        private void inorderTraversalHelper(TreeNode node, List<Integer> result) {
            if (node == null) {
                return;
            }
            inorderTraversalHelper(node.left, result);
            result.add(node.val);
            inorderTraversalHelper(node.right, result);
        }
    }

    public static void main(String[] args) {
        ninefour solution = new ninefour();


        TreeNode root = solution.new TreeNode(1);
        root.right = solution.new TreeNode(2);
        root.right.left = solution.new TreeNode(3);

        List<Integer> result = root.inorderTraversal();

        System.out.println(result);
    }
}
