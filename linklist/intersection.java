package linklist;

public class intersection {
    static Node head1;
    static Node head2;

    static int getintersection(Node head1, Node head2) {
        Node temp1 = head1;
        while (temp1 != null) {
            temp1.visited = true;
            temp1 = temp1.next;
        }
        temp1 = head2;
        while (temp1 != null) {
            if (temp1.visited) {
                return temp1.data;
            } else {
                temp1.visited = true;
            }
            temp1 = temp1.next;
        }
        return -1;

    }

    public static void main(String[] args) {
        intersection intersection = new intersection();

        head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(6);


        head2 = new Node(69);
        head2.next = new Node(9);
        head2.next.next = new Node(8);
        head2.next.next.next = new Node(21);
        System.out.println(getintersection(head1, head2));
    }

    static class Node {
        int data;
        Node next;
        boolean visited;

        public Node(int data) {
            this.data = data;
            this.next = null;
            visited = false;
        }
    }
}
