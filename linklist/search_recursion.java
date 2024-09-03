package linklist;

public class search_recursion {

    static Node head;

    public static void main(String[] args) {
        search_recursion searchRecursion = new search_recursion();
        head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(8);
        head.next.next.next = new Node(43);
        searchRecursion.display();
        System.out.println(search(head, 6));

    }

    public static boolean search(Node node, int data) {
        if (node == null)
            return false;

        if (node.data == data)
            return true;
        return search(node.next, data);
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
