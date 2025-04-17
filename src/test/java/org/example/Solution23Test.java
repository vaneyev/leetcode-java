package org.example;

import org.example.Solution23.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Solution23Test {

    @Test
    void mergeKLists() {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(5);
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        ListNode list3 = new ListNode(2);
        list3.next = new ListNode(6);
        ListNode[] lists = new ListNode[]{list1, list2, list3};
        ListNode output = new Solution23().mergeKLists(lists);
        assertEquals(1, output.val);
        assertEquals(1, output.next.val);
        assertEquals(2, output.next.next.val);
        assertEquals(3, output.next.next.next.val);
        assertEquals(4, output.next.next.next.next.val);
        assertEquals(4, output.next.next.next.next.next.val);
        assertEquals(5, output.next.next.next.next.next.next.val);
        assertEquals(6, output.next.next.next.next.next.next.next.val);
        assertNull(output.next.next.next.next.next.next.next.next);
    }

    @Test
    void mergeKLists2() {
        ListNode output = new Solution23().mergeKLists(new ListNode[]{});
        assertNull(output);
    }

    @Test
    void mergeKLists3() {
        ListNode output = new Solution23().mergeKLists(new ListNode[]{ null});
        assertNull(output);
    }
}