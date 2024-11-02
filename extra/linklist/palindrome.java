package extra.linklist;

public class palindrome {
    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 2 -> 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        Solution solution = new Solution();

        // Check if the linked list is a palindrome
        boolean result = solution.isPalindrome(head);

        // Print the result
        System.out.println("Is the linked list a palindrome? " + result);
    }
}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    ListNode curr;

    public boolean isPalindrome(ListNode head) {
        curr = head;
        return solve(head);
    }

    public boolean solve(ListNode head) {
        if (head == null) return true;
        boolean ans = solve(head.next) && head.val == curr.val;
        curr = curr.next;
        return ans;
    }
}

