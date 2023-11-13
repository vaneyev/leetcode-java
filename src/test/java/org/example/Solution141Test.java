package org.example;

import org.example.Solution141.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution141Test {

    @Test
    void hasCycle1() {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        boolean output = new Solution141().hasCycle(head);
        assertTrue(output);
    }

    @Test
    void hasCycle2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;
        boolean output = new Solution141().hasCycle(head);
        assertTrue(output);
    }

    @Test
    void hasCycle3() {
        ListNode head = new ListNode(1);
        boolean output = new Solution141().hasCycle(head);
        assertFalse(output);
    }
}