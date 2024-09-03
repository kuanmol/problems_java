package face.linklist;


import java.util.Scanner;

public class reorder {
    static Node head;

    static void order(Node head) {
        if (head == null || head.next == null) {
            return;
        }
        Node slow = head, fast = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node firsthalf = head;
        Node secondhalf = slow.next;
        slow.next = null;
        secondhalf = reverse(secondhalf);
        while (secondhalf != null) {
            Node next1 = firsthalf.next;
            Node next2 = secondhalf.next;

            firsthalf.next = secondhalf;
            secondhalf.next = next1;
            firsthalf = next1;
            secondhalf = next2;
        }
    }

    static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    static void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            insert(num);
        }
        order(head);
        display(head);
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
