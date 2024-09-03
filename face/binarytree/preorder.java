package face.binarytree;

class transversal {

    static Node root;

    public static void main(String[] args) {
        root = new Node(1);
        root.right = new Node(3);
        root.right.right = new Node(5);
        root.right.left = new Node(8);
        root.left = new Node(4);
        root.left.right = new Node(7);
        root.left.left = new Node(9);
        transversal transversal = new transversal();
        System.out.println("preorder");
        transversal.preorder(root);
        System.out.println();
        System.out.println("inorder");
        transversal.inorder(root);
        System.out.println();
        System.out.println("postorder");
        transversal.postorder(root);
    }

    void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");

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
