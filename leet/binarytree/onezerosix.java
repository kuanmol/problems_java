package leet.binarytree;

import java.util.HashMap;
import java.util.Map;

class onezerosix {
    private Map<Integer, Integer> inorderMap = new HashMap<>();
    private int postorderIndex;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        postorderIndex = postorder.length - 1;
        return buildSubtree(postorder, 0, inorder.length - 1);
    }

    private TreeNode buildSubtree(int[] postorder, int left, int right) {
        if (left > right) return null;

        int rootValue = postorder[postorderIndex--];
        TreeNode root = new TreeNode(rootValue);

        int inorderIndex = inorderMap.get(rootValue);

        root.right = buildSubtree(postorder, inorderIndex + 1, right);
        root.left = buildSubtree(postorder, left, inorderIndex - 1);

        return root;
    }

    public static void main(String[] args) {
        onezerosix solution = new onezerosix();

        int[] inorder1 = {9, 3, 15, 20, 7};
        int[] postorder1 = {9, 15, 7, 20, 3};
        TreeNode tree1 = solution.buildTree(inorder1, postorder1);
        System.out.println("Constructed Tree 1 (Preorder): " + tree1);

        int[] inorder2 = {-1};
        int[] postorder2 = {-1};
        TreeNode tree2 = solution.buildTree(inorder2, postorder2);
        System.out.println("Constructed Tree 2 (Preorder): " + tree2);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return val + " -> (" + (left != null ? left.toString() : "null") + ", " + (right != null ? right.toString() : "null") + ")";
        }
    }

}