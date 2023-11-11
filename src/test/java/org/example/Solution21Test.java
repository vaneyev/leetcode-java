package org.example;

import org.example.Solution21.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution21Test {

    @Test
    void mergeTwoLists1() {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        ListNode output = new Solution21().mergeTwoLists(list1, list2);
        assertEquals(1, output.val);
        assertEquals(1, output.next.val);
        assertEquals(2, output.next.next.val);
        assertEquals(3, output.next.next.next.val);
        assertEquals(4, output.next.next.next.next.val);
        assertEquals(4, output.next.next.next.next.next.val);
        assertNull(output.next.next.next.next.next.next);
    }

    @Test
    void mergeTwoLists2() {
        ListNode output = new Solution21().mergeTwoLists(null, null);
        assertNull(output);
    }

    @Test
    void mergeTwoLists3() {
        ListNode list2 = new ListNode(0);
        ListNode output = new Solution21().mergeTwoLists(null, list2);
        assertEquals(0, output.val);
        assertNull(output.next);
    }
}