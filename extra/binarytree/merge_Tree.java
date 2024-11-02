package extra.binarytree;

public class merge_Tree {


    static Node root1 = null;
    static Node root2 = null;

    static Node Merge(Node node1, Node node2) {
        if (node1 == null)
            return node2;
        if (node2 == null)
            return node1;

        node1.key += node2.key;
        node1.left = Merge(node1.left, node1.left);
        node1.right = Merge(node1.right, node2.right);

        return node1;
    }

    static void print_inorder(Node node) {
        if (node == null)
            return;

        print_inorder(node.left);
        System.out.print(node.key + "  ");
        print_inorder(node.right);

    }

    public static void main(String[] args) {

        root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);

        root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);

        print_inorder(root1);
        System.out.println();

        print_inorder(root2);
        System.out.println();

        Node root3 = Merge(root1, root2);
        print_inorder(root3);

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
