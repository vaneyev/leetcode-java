package org.example;

public class Solution {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = head;
        head = head.next;
        prev.next = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
