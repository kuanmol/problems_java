package extra.binarytree;

public class searchtree {

    class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int item) {
            val = item;
            left = right = null;
        }
    }

    TreeNode root ;

    void insert(int val) {
        root = insertRec(root, val);
    }

    TreeNode insertRec(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        if (val < root.val)
            root.left = insertRec(root.left, val);
        else if (val > root.val)
            root.right = insertRec(root.right, val);

        return root;
    }

    TreeNode search(int num) {
        TreeNode cur = root;
        while (cur != null) {
            if (cur.val < num)
                cur = cur.right;
            else if (cur.val > num)
                cur = cur.left;
            else
                break;
        }
        return cur;
    }


    public static void main(String[] args) {
        searchtree tree = new searchtree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);


        int searchVal = 40;
        TreeNode result = tree.search(searchVal);
        if (result != null) {
            System.out.println("Node with value " + searchVal + " found.");
        } else {
            System.out.println("Node with value " + searchVal + " not found.");
        }
    }
}

