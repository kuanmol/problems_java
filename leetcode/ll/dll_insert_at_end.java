package leetcode.ll;

import java.util.*;

public class dll_insert_at_end {
    static class node {
        int val;
        node next, prev;

        node(int val) {
            this.val = val;
            next = prev = null;
        }
    }

    static node insertatend(node head, int x) {
        node newnode = new node(x);
        if (head == null) {
            return newnode;
        }
        node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newnode;
        newnode.prev = curr;
        return head;
    }

    static void printList(node head) {
        node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        node head = null;

        System.out.print("yahan jitne tere ko number daalne h vo daal ");
        int n = sc.nextInt();

        System.out.println("ab number daal yahan pe:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            head = insertatend(head, val);
        }

        System.out.print("dekh saali kya print ho rha h ");
        printList(head);

        sc.close();
    }
}
