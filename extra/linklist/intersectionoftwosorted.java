package extra.linklist;

public class intersectionoftwosorted {
    static Node head1;
    static Node head2;

    public static void display(Node temp) {
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        intersectionoftwosorted intersectionoftwosorted = new intersectionoftwosorted();
        head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(6);

        head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        head2.next.next.next = new Node(14);
        head2.next.next.next.next = new Node(15);
        head2.next.next.next.next.next = new Node(16);

        Node intt = intersectionoftwosorted.intersection(head1, head2);
        display(intt);
    }

    Node intersection(Node a, Node b) {
        if (a == null || b == null)
            return null;

        // Check for intersection
        if (a.data == b.data) {
            Node temp = new Node(a.data);
            temp.next = intersection(a.next, b.next);
            return temp;
        }

        // Move to the next nodes
        if (a.data < b.data)
            return intersection(a.next, b);
        else
            return intersection(a, b.next);
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
