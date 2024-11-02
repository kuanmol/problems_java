package extra.face.linklist;

import java.util.Scanner;

public class odd_Eveindex {
    static Node head;

    static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            insert(num);
        }


//        head = reorderList(head);

    }

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
