package binarytree;

public class diameter {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int item) {
            val = item;
            left = right = null;
        }
    }


    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        calcHeight(root);
        return diameter;
    }
    int calcHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = calcHeight(node.left);
        int rightHeight = calcHeight(node.right);
        diameter = Math.max(diameter, leftHeight + rightHeight );

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(4);
        root.left.right.left=new TreeNode(6);
        root.left.right.right=new TreeNode(5);
        root.right=new TreeNode(7);
        root.right.right=new TreeNode(8);
        root.right.right.right=new TreeNode(10);
        root.right.right.left=new TreeNode(9);
        root.right.right.right.left=new TreeNode(11);
        root.right.right.right.right=new TreeNode(12);
        root.right.right.right.right.right=new TreeNode(13);

        // Create a Solution object
        diameter solution = new diameter();

        int diameter = solution.diameterOfBinaryTree(root);
        System.out.println("Diameter of the binary tree: " + diameter);
    }
}
