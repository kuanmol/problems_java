package face.linklist;

import java.util.Scanner;

class revk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListNode head = new ListNode();
        ListNode node = head;

        int temp = scanner.nextInt();
        while (temp != -1) {
            node.val = temp;
            node.next = new ListNode();
            node = node.next;
            temp = scanner.nextInt();
        }
        node.val = -1;

        int k = scanner.nextInt();

        ListNode tempNode = head;
        while (tempNode != null) {
            if (tempNode.next.val == -1) {
                tempNode.next = null;
            }
            tempNode = tempNode.next;
        }

        ListNode result = reverseKGroup(head, k);
        printLinkedList(result);
    }

    public static ListNode reverse(ListNode start, ListNode end) {
        ListNode prev = null;
        ListNode curr = start;
        ListNode next;

        while (curr != end) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) return null;

        ListNode a = head;
        ListNode b = head;

        for (int i = 0; i < k; i++) {
            if (b == null) return head;
            b = b.next;
        }

        ListNode newHead = reverse(a, b);

        a.next = reverseKGroup(b, k);
        return newHead;
    }

    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
