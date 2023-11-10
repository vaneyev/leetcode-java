package org.example;

import org.example.Solution237.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution237Test {

    @Test
    void deleteNode1() {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);
        new Solution237().deleteNode(head.next);
        assertEquals(4, head.val);
        assertEquals(1, head.next.val);
        assertEquals(9, head.next.next.val);
        assertNull(head.next.next.next);
    }

    @Test
    void deleteNode2() {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);
        new Solution237().deleteNode(head.next.next);
        assertEquals(4, head.val);
        assertEquals(5, head.next.val);
        assertEquals(9, head.next.next.val);
        assertNull(head.next.next.next);
    }
}