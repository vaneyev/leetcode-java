package org.example;

import org.example.Solution206.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution206Test {

    @Test
    void reverseList1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode output = new Solution206().reverseList(head);
        assertEquals(5, output.val);
        assertEquals(4, output.next.val);
        assertEquals(3, output.next.next.val);
        assertEquals(2, output.next.next.next.val);
        assertEquals(1, output.next.next.next.next.val);
        assertNull(output.next.next.next.next.next);
    }

    @Test
    void reverseList2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        ListNode output = new Solution206().reverseList(head);
        assertEquals(2, output.val);
        assertEquals(1, output.next.val);
        assertNull(output.next.next);
    }

    @Test
    void reverseList3() {
        ListNode output = new Solution206().reverseList(null);
        assertNull(output);
    }
}