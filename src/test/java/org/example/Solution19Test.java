package org.example;

import org.example.Solution19.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution19Test {

    @Test
    void removeNthFromEnd1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode output = new Solution19().removeNthFromEnd(head, 2);
        assertEquals(1, output.val);
        assertEquals(2, output.next.val);
        assertEquals(3, output.next.next.val);
        assertEquals(5, output.next.next.next.val);
        assertNull(head.next.next.next.next);
    }

    @Test
    void removeNthFromEnd2() {
        ListNode head = new ListNode(1);
        ListNode output = new Solution19().removeNthFromEnd(head, 1);
        assertNull(output);
    }

    @Test
    void removeNthFromEnd3() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        ListNode output = new Solution19().removeNthFromEnd(head, 1);
        assertEquals(1, output.val);
        assertNull(output.next);
    }

    @Test
    void removeNthFromEnd4() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        ListNode output = new Solution19().removeNthFromEnd(head, 2);
        assertEquals(2, output.val);
        assertNull(output.next);
    }
}