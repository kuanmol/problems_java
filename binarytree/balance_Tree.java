package binarytree;

public class balance_Tree {
    static Node root = null;

    static int height(Node node) {
        if (node == null)
            return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    static boolean check_blanced(Node node) {
        if (node == null)
            return true;
        int lh = height(node.left);
        int rh = height(node.right);

        return Math.abs(lh - rh) <= 1 && check_blanced(node.left) && check_blanced(node.right);

    }

    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(51);

        if (check_blanced(root))
            System.out.println("tree is balanced");
        else
            System.out.println("tree is unbalanced");

    }

    static class Node {
        int key;
        Node left, right;

        public Node(int data) {
            key = data;

            left = right = null;
        }
    }
}
