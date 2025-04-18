package org.example;

import org.example.Solution2.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    @Test
    void addTwoNumbers() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        Solution2 solution = new Solution2();
        ListNode result = solution.addTwoNumbers(l1, l2);
        assertEquals(7, result.val);
        assertEquals(0, result.next.val);
        assertEquals(8, result.next.next.val);
    }

    @Test
    void addTwoNumbers2() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        Solution2 solution = new Solution2();
        ListNode result = solution.addTwoNumbers(l1, l2);
        assertEquals(0, result.val);
        assertNull(result.next);
    }

    @Test
    void addTwoNumbers3() {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);
        Solution2 solution = new Solution2();
        ListNode result = solution.addTwoNumbers(l1, l2);
        assertEquals(8, result.val);
        assertEquals(9, result.next.val);
        assertEquals(9, result.next.next.val);
        assertEquals(9, result.next.next.next.val);
        assertEquals(0, result.next.next.next.next.val);
        assertEquals(0, result.next.next.next.next.next.val);
        assertEquals(0, result.next.next.next.next.next.next.val);
        assertEquals(1, result.next.next.next.next.next.next.next.val);
    }

}