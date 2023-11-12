package org.example;

/**
 * Palindrome Linked List
 */
public class Solution234 {
    public boolean isPalindrome(ListNode head) {
        if (head.next == null) {
            return true;
        }
        ListNode slow = null;
        ListNode next = head;
        ListNode fast = head.next.next;
        ListNode temp;
        while (true) {
            temp = next.next;
            next.next = slow;
            slow = next;
            next = temp;
            if (fast == null) {
                fast = next;
                break;
            }
            fast = fast.next;
            if (fast == null) {
                fast = next.next;
                break;
            }
            fast = fast.next;
        }
        while (slow != null) {
            if (slow.val != fast.val) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    public static class ListNode {
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
