package org.example;

/**
 * Remove Nth Node From End of List
 */
public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }
        int i = 0;
        ListNode cur = head;
        ListNode prev = head;
        while(cur != null) {
            if (i <= n) {
                i++;
            } else {
                prev = prev.next;
            }
            cur = cur.next;
        }
        if (i == n) {
            head = head.next;
        } else {
            prev.next = prev.next.next;
        }
        return head;
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

