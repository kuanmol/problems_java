package face.linklist;

import java.util.Scanner;

public class rotatelimit {
    static Node head;

    static void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    static void rotate() {


    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static void rotate(int k) {
        if (head == null || k <= 0) {
            return;
        }
        int count = 1;
        Node current = head;
        while (current != null && count < k) {
            current = current.next;
            count++;
        }
        if (current == null) {
            return;
        }
        Node knode = current;
        while (current.next != null) {
            current = current.next;
        }
        current.next = head;
        head = knode.next;
        knode.next = null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        while ((num = scanner.nextInt()) != -1) {
            insert(num);
        }
        int rotations = scanner.nextInt();


        display(head);
        System.out.println();

        rotate(rotations);

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
