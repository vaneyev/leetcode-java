package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void solutionTest() {
        Solution.ListNode head = new Solution.ListNode(3);
        head.next = new Solution.ListNode(2);
        head.next.next = new Solution.ListNode(0);
        head.next.next.next = new Solution.ListNode(-4);
        Solution solution = new Solution();
        Solution.ListNode result = solution.reverseList(head);
        assertEquals(-4, result.val);
        assertEquals(0, result.next.val);
        assertEquals(2, result.next.next.val);
        assertEquals(3, result.next.next.next.val);
        assertNull(result.next.next.next.next);
    }

    @Test
    void solutionTest1() {
        Solution.ListNode head = new Solution.ListNode(3);
        Solution solution = new Solution();
        Solution.ListNode result = solution.reverseList(head);
        assertEquals(3, result.val);
        assertNull(result.next);
    }
}