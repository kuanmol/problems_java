package extra.linklist;

import java.util.HashSet;

public class removeduplicate {
    static Node head;

    static void deletedups(Node n) {
        HashSet<Integer> hashSet = new HashSet<>();
        Node current = head;
        Node prev = null;
        while (current != null) {
            int curval = current.data;
            if (hashSet.contains(curval)) {
                prev.next = current.next;
            } else {
                hashSet.add(curval);
                prev = current;
            }
            current = current.next;
        }
    }

    static public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        display();
        deletedups(head);
        display();
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
