package leet.binarytree;

import java.util.HashMap;
import java.util.Map;

class onezerofive {
    private Map<Integer, Integer> inorderMap = new HashMap<>();
    private int preorderIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);  // Store indices of inorder values for quick lookup
        }
        return buildSubtree(preorder, 0, inorder.length - 1);
    }

    private TreeNode buildSubtree(int[] preorder, int left, int right) {
        if (left > right) return null;

        int rootValue = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootValue);

        int inorderIndex = inorderMap.get(rootValue);

        root.left = buildSubtree(preorder, left, inorderIndex - 1);
        root.right = buildSubtree(preorder, inorderIndex + 1, right);

        return root;
    }

    public static void main(String[] args) {
        onezerofive solution = new onezerofive();

        int[] preorder1 = {3, 9, 20, 15, 7};
        int[] inorder1 = {9, 3, 15, 20, 7};
        TreeNode tree1 = solution.buildTree(preorder1, inorder1);
        System.out.println("Constructed Tree 1 (Preorder): " + tree1);

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
