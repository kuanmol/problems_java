package extra.face.binarytree;

import java.util.Scanner;

public class diameter_Tree {
    static Node root;

    public static void insert(int data) {
        root = insertRec(root, data);
    }

    static Node insertRec(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    static int diameter() {
        return diarec(root);
    }

    static int diarec(Node root) {
        if (root == null)
            return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int diameterTree = leftHeight + rightHeight + 1;

        int leftDiameter = diarec(root.left);
        int rightDiameter = diarec(root.right);
        return Math.max(diameterTree, Math.max(leftDiameter, rightDiameter));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int data;

        while ((data = scanner.nextInt()) != -1) {
            insert(data);
        }
        System.out.println(diameter());
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
