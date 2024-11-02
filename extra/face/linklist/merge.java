package extra.face.linklist;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Main {
    static Node head;

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    static Node insert(Node head, int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int size1 = cin.nextInt();
        for (int i = 0; i < size1; i++) {
            int data = cin.nextInt();
            head = insert(head, data);
        }
        display(head);
    }
}
