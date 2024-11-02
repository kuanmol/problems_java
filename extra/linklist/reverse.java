package extra.linklist;

public class reverse {


    static Node head;

    public static void main(String[] args) {
        reverse reverse = new reverse();
        head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(43);
        reverse.display(head);
        head = reverse.reversing(head);
        reverse.display(head);
    }

    Node reversing(Node node) {
        Node prev = null;
        Node curr = node;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;
    }

    public void display(Node temp) {
        temp = head;
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
