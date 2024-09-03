package binarytree;

public class base {

    static Node root = null;

    public static void main(String[] args) {
        base base = new base();
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.right = new Node(5);
        base.print_inorder(root);
    }

    void print_inorder(Node node) {
        if (node == null)
            return;

        print_inorder(node.left);
        System.out.print(node.key + "  ");
        print_inorder(node.right);

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
