package org.example;

/**
 * Add Two Numbers
 */
public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode cur = result;
        boolean overflow = false;
        while (true) {
            int v1 = l1 == null ? 0 : l1.val;
            int v2 = l2 == null ? 0 : l2.val;
            cur.val = v1 + v2 + (overflow ? 1 : 0);
            if (cur.val >= 10) {
                cur.val = cur.val % 10;
                overflow = true;
            } else {
                overflow = false;
            }
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            if (l1 == null && l2 == null && !overflow) {
                break;
            }
            cur.next = new ListNode(0);
            cur = cur.next;
        }
        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
