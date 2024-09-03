package binarytree;

public class subtreeofbinaryree {


    static Node root1 = null;
    static Node root2 = null;

    static boolean isIdentical(Node root1, Node root2) {
        if (root1 == null && root2 == null)
            return true;

        if (root1 == null || root2 == null)
            return false;

        return (root1.key == root2.key
                && isIdentical(root1.left, root2.left)
                && isIdentical(root1.right, root2.right));
    }

    static boolean isSubtree(Node node1, Node node2) {
        if (node2 == null)
            return true;
        if (node1 == null)
            return false;
        if (isIdentical(node1, node2))
            return true;

        return isSubtree(node1.left, node2) || isSubtree(node1.right, node2);
    }

    public static void main(String[] args) {
        root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);

        root2 = new Node(6);
        root2.left = new Node(93);
        root2.right = new Node(38);
        root2.right.right = new Node(49);
        root2.right.right.right = new Node(34);
        root2.left.left = new Node(45);
        if (isSubtree(root1, root2))
            System.out.println("it is a subtree");
        else
            System.out.println("it is not a subtree");
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
