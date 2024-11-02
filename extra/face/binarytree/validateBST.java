package extra.face.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TreeNode {
    int key;
    TreeNode left, right;

    TreeNode(int key) {
        this.key = key;
        left = right = null;
    }
}

public class validateBST {
    static TreeNode constructTree(int[] keys) {
        if (keys == null || keys.length == 0)
            return null;

        TreeNode root = new TreeNode(keys[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;

        while (!queue.isEmpty() && i < keys.length) {
            TreeNode node = queue.poll();

            int leftKey = keys[i++];
            if (leftKey != Integer.MIN_VALUE) {
                node.left = new TreeNode(leftKey);
                queue.add(node.left);
            }

            if (i < keys.length) {
                int rightKey = keys[i++];
                if (rightKey != Integer.MIN_VALUE) {
                    node.right = new TreeNode(rightKey);
                    queue.add(node.right);
                }
            }
        }

        return root;
    }

    static boolean isBST(TreeNode root, int minVal, int maxVal) {
        if (root == null)
            return true;

        if (root.key <= minVal || root.key >= maxVal)
            return false;

        return isBST(root.left, minVal, root.key) && isBST(root.right, root.key, maxVal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] keys = new int[n];
        for (int i = 0; i < n; i++) {
            keys[i] = scanner.nextInt();
        }

        TreeNode root = constructTree(keys);
        boolean isBST = isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

        if (isBST) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
