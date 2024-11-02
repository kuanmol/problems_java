package extra.binarytree;

public class sum_in_range {

    static Node root = null;
    static Sum sum;

    static void rangesum(Node node, int low, int high, Sum sum) {
        if (node != null) {
            rangesum(node.left, low, high, sum);
            if (node.key >= low && node.key <= high) {
                sum.sum += node.key;
            }
            rangesum(node.right, low, high, sum);
        }
    }

    public static void main(String[] args) {
        sum = new Sum();
        root = new Node(10);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right = new Node(15);
        root.right.right = new Node(18);
        int l = 7;
        int r = 15;

        rangesum(root, l, r, sum); // Pass sum as an argument
        System.out.println(sum.sum);
    }

    static class Node {

        int key;
        Node left, right;

        public Node(int data) {
            key = data;
            left = right = null;
        }
    }

    static class Sum {
        int sum = 0;
    }
}
