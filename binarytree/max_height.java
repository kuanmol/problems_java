package binarytree;

public class max_height {
    static Node root = null;

    static int maxdepth(Node node) {
        if (node == null)
            return -1;
        //0 for count node
        else {
            int lheight = maxdepth(node.left);
            int lright = maxdepth(node.right);

            int ans = Math.max(lheight, lright);

            return ans + 1;
        }
    }

    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(maxdepth(root));

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

