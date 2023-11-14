package org.example;

import org.example.Solution142.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution142Test {

    @Test
    void detectCycle1() {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next;
        ListNode output = new Solution142().detectCycle(head);
        assertEquals(head.next, output);
    }

    @Test
    void detectCycle2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;
        ListNode output = new Solution142().detectCycle(head);
        assertEquals(head, output);
    }

    @Test
    void detectCycle3() {
        ListNode head = new ListNode(1);
        ListNode output = new Solution142().detectCycle(head);
        assertNull(output);
    }
}