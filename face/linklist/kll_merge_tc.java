package face.linklist;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class MergeSortLinkedLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        PriorityQueue<ListNode> pq = new PriorityQueue<>(n, Comparator.comparingInt(node -> node.val));

        for (int i = 0; i < n; i++) {
            ListNode head = readList(scanner);
            if (head != null) {
                pq.offer(head);
            }
        }

        ListNode mergedHead = mergeLists(pq);


        printList(mergedHead);
        System.out.println("linklist");
    }

    private static ListNode readList(Scanner scanner) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        int num;
        while ((num = scanner.nextInt()) != -1) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }

    static ListNode mergeLists(PriorityQueue<ListNode> pq) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            current.next = node;
            current = current.next;
            if (node.next != null) {
                pq.offer(node.next);
            }
        }

        return dummy.next;
    }

    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}

class ListNode {
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
