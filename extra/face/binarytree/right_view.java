package extra.face.binarytree;

import java.util.*;

public class right_view {
    public static void right_view_print(Node root, int currentDepth, List<Integer> result) {
        if (root == null)
            return;

        if (currentDepth == result.size())
            result.add(root.data);

        right_view_print(root.right, currentDepth + 1, result);
        right_view_print(root.left, currentDepth + 1, result);
    }

    public static Node buildTree(String[] node) {
        if (node.length == 0 || node[0].equals("N"))
            return null;

        Node root = new Node(Integer.parseInt(node[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int index = 1;
        while (!queue.isEmpty() && index < node.length) {
            Node parent = queue.poll();
            if (!node[index].equals("N")) {
                parent.left = new Node(Integer.parseInt(node[index]));
                queue.add(parent.left);
            }
            index++;
            if (index < node.length && !node[index].equals("N")) {
                parent.right = new Node(Integer.parseInt(node[index]));
                queue.add(parent.right);
            }
            index++;
        }
        return root;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] node = scanner.nextLine().split(" ");
        Node root = buildTree(node);

        List<Integer> result = new ArrayList<>();
        right_view_print(root, 0, result);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i != result.size() - 1) {
                System.out.print(" ");
            }
        }
    }

    static class Node {
        Node left;
        int data;
        Node right;

        public Node(int data) {
            this.left = null;
            this.data = data;
            this.right = null;
        }

    }
}
