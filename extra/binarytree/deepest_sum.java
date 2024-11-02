package extra.binarytree;

public class deepest_sum {

    static Node root = null;

    public static int maxDepth(Node node) {
        if (node == null)
            return 0;

        return 1 + Math.max(maxDepth(node.left), maxDepth(node.right));

    }

    public static int sumMaxLevelRec(Node node, int max) {
        if (node == null)
            return 0;
        if (max == 1)
            return node.key;
        return sumMaxLevelRec(node.left, max - 1) +
                sumMaxLevelRec(node.right, max - 1);
    }

    public static int sumMaxLevel(Node root) {
        int MaxDepth = maxDepth(root);
        return sumMaxLevelRec(root, MaxDepth);
    }

    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(5);
        root.right.right.left = new Node(20);
        root.right.right.right = new Node(28);
        System.out.println(sumMaxLevel(root));
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
